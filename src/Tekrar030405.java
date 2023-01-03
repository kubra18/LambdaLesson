import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tekrar030405 {
    public static void main(String[] args) {
        List<String> menu = new ArrayList<>(Arrays.asList("trileçe","havucDilim","güvec","kokorec",
                "küşleme","arabAşı","waffle","künefe","güvec"));
        byktkrarsz(menu);
        System.out.println();
        carsyterstkrrsz(menu);
        lstElcarsygore(menu);
        System.out.println();
        karsy7denaz(menu);
        wilebas(menu);
        System.out.println("mmmmmmmm");
        enbykel(menu);
        xilebtn(menu);
        snhfgrsrl(menu);


    }
    // Task -1 : List elemanlarini alfabetik buyuk harf ve  tekrarsiz print ediniz.
    public static void byktkrarsz(List<String>menu){
        menu.stream().map(String::toUpperCase).sorted().distinct().forEach(Tekrar0102::yazdir);
    }





    // Task -2 : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..
    public static void carsyterstkrrsz(List<String> ikram) {

        ikram.
                stream().
                map(String::length).sorted(Comparator.reverseOrder()).distinct().forEach(Tekrar0102::yazdir);
    }
    // Task-3 : List elemanlarini, character sayisina gore kckten byk e gore print ediniz..

    public static void lstElcarsygore(List<String> yemek){
        yemek.stream().sorted(Comparator.comparing(String::length)).forEach(Tekrar0102::yazdir);
    }

    // Task-4 : List elemanlarinin hepsinin karakter sayisinin 7 ve 7 'den az olma durumunu kontrol ediniz.

    public static void karsy7denaz(List<String>ikram){
        System.out.println(ikram.stream().allMatch(t -> t.length() <= 7) ? "list elemanlari 7 ve daha az harfden olusuyor" :
                "list elemanlari 7 harfden buyuk");
    }



    // Task-5 : List elelmanlarinin hepsinin "w" ile baslamasını noneMatch() ile kontrol ediniz.

    public static void wilebas(List<String> yemek){
        System.out.println(yemek.stream().noneMatch(t -> t.startsWith("w")) ? "w ile yemek ismimi olur" : "w ile yemek icat ettik");
    }

    // Task-6 : List elelmanlarinin "x" ile biten en az bir elemanı var mı kontrol ediniz.

public static void xilebtn(List<String> yemek){

    System.out.println(  yemek.stream().anyMatch(t-> t.endsWith("x")) ? "evet var" : "malesef yok");;
    }


    // Task-7 : Karakter sayisi en buyuk elemani yazdiriniz.
    public static void enbykel(List<String>yemek){

        System.out.println(yemek.stream().sorted(Comparator.comparing(t -> t.toString().length()).reversed()).limit(1).toString());
    }

    // Task-8 : list elemanlarini son harfine göre siralayıp ilk eleman hariç kalan elemanlari print ediniz.
    public  static void snhfgrsrl(List<String> yemek){

        yemek.stream().sorted(Comparator.comparing(t->t.charAt(t.length()-1))).skip(1).forEach(Lambda01::yazdir);
    }

}

