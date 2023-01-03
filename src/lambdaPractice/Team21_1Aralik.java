package lambdaPractice;

import java.util.stream.IntStream;

public class Team21_1Aralik {
    public static void main(String[] args) {


    //TASK 02 --> 1'den x'e kadar cift tamsayilari
//TASK 03 --> Ilk x pozitif cift sayiyi toplayan program  create ediniz.
//TASK 04 --> Ilk X pozitif tek tamsayiyi toplayan programi  create ediniz.
//TASK 05 --> 2'nin ilk pozitif x kuvvetini ekrana yazdiran programi  create ediniz.
//TASK 06 --> Istenilen bir sayinin ilk x kuvvetini ekrana yazdiran programi  create ediniz.
        System.out.println(ciftTopla(4));
        System.out.println(xeKadarCiftTopla(4));
        System.out.println(xeKadarTekTopla(3));
    pozitifXKuvveti(5);
        System.out.println();
    istenenSayıninKuvveti(5,3);

}
    public static int ciftTopla(int a){

        return    IntStream.
                rangeClosed(2,a).filter(t-> t%2==0).sum();

    }
    //TASK 03 --> Ilk x pozitif cift sayiyi toplayan program  create ediniz.
    public static int xeKadarCiftTopla(int sayi){
        return   IntStream.
                iterate(2,t-> t+2).
                limit(sayi).
                sum();
    }
    //TASK 04 --> Ilk X pozitif tek tamsayiyi toplayan programi  create ediniz.
    public static int xeKadarTekTopla(int sayi){
        return   IntStream.
                iterate(1,t-> t+2).
                limit(sayi).
                sum();
    }
    //TASK 05 --> 2'nin ilk pozitif x kuvvetini ekrana yazdiran programi  create ediniz.
    public static void pozitifXKuvveti(int sayi){

        IntStream.
                iterate(2,t-> t*2).
                limit(sayi).
                forEach(t-> System.out.print(t+" "));

    }
    //TASK 06 --> Istenilen bir sayinin ilk x kuvvetini ekrana yazdiran programi  create ediniz.

    public static void istenenSayıninKuvveti(int istenensayi,int kuvvet) {
        IntStream.
                iterate(istenensayi, t -> t * istenensayi).
                limit(kuvvet).
                forEach(t -> System.out.print(t + " "));


    }
}
