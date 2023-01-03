import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Team21_calismalari {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Elma");
        list.add("Portakal");
        list.add("uzum");
        list.add("Cilek");
        list.add("greyfurt");
        list.add("nar");
        list.add("mandalina");
        list.add("armut");
        list.add("Elma");
        list.add("keciboynuzu");
        list.add("Ayva");
//S1: list elemanlarını ilk harf buyuk gerisi kucuk sekılde listeleyelim
// S2: ilk harfi e ve ya c olanlari listeleyelim
//S3: tum stringlerin basina ve sonuna yildiz ekleyerek yazdiralim

        //S1:
        System.out.println(list.stream().
                map(t -> t.substring(0, 1).toUpperCase() + t.substring(1).toLowerCase()).
                collect(Collectors.toList()));
        //S2:
        System.out.println(list.stream().
                filter(t -> t.toLowerCase().startsWith("e") || t.toLowerCase().startsWith("c")).
                collect(Collectors.toList()));

        //S3: tum stringlerin basina ve sonuna yildiz ekleyerek yazdiralim

        list.stream().map(t-> "*"+t+"*").forEach(t-> System.out.print(" "+t+" "));
        //S7: uzunlugu 3 ile 7 arası olan veya a ile biten elemanlardan yeni bir liste olustur
        //S8: list elemanlarını uzunluklarına ve ikinci harflerine göre benzersiz sıralayıp yazdırın
        // S9: uzunlugu 4 ve 8 olanlar haric bir liste olusturunuz
        //S10: List elemanlarını son harfe göre sıralayıp, son 3 elemanı yazdırın
        System.out.println();

        System.out.println(list.stream().
                filter(t -> t.length() > 3 && t.length() < 7 || t.toLowerCase().endsWith("a")).
                collect(Collectors.toList()));

        //S8:list elemanlarını uzunluklarına ve ikinci harflerine göre benzersiz sıralayıp yazdırın(BAKILACAK)
        System.out.println(list.stream().
                sorted(Comparator.comparing(String::length)).collect(Collectors.toList()));
        // S9: uzunlugu 4 ve 8 olanlar haric bir liste olusturunuz

        System.out.println(list.stream().
                filter(t -> t.length() != 4 && t.length() != 8).
                collect(Collectors.toList()));
        //S10: List elemanlarını son harfe göre sıralayıp, son 3 elemanı yazdırın
        System.out.println(list.
                stream().
                sorted(Comparator.comparing(t -> t.toString().charAt(t.toString().length() - 1)).reversed()).

                limit(3).collect(Collectors.toList()));//[keciboynuzu, greyfurt, armut]

        System.out.println(list.
                stream().
                sorted(Comparator.comparing(t -> t.charAt(t.length() - 1)))
                .collect(Collectors.toList()));
    }
}
