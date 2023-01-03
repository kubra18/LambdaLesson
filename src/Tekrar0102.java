import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class Tekrar0102 {
    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(4,2,6,11,-5,7,3,15));
        cifYzdr(sayi);
        System.out.println();
        tekYzdr(sayi);
        System.out.println();
        enbyk(sayi);
        System.out.println();
        ciftkarekok(sayi);
        System.out.println();
        enbykStructerd(sayi);
      cftkareenbyk(sayi);
        System.out.println("+++++++");
        top(sayi);
        System.out.println("#######");
        ciftcarp(sayi);
        System.out.println("222222");
        minbul(sayi);
        System.out.println("ffffffff");
        bstnbykenkcktksy(sayi);
        cftelkarkctnbyg(sayi);



    }
    public static void yazdir(int a){
        System.out.print(a+" ");
    }
    public static void yazdir(String a) {
        System.out.print(a + " ");
    }


    // Task-1 : Functional Programming ile listin cift elemanlarinin  karelerini
    // ayni satirda aralarina bosluk bırakarak print ediniz

public static void cifYzdr(List<Integer> sayi)
{
    sayi.stream().filter(Tekrar0102::ciftbul).forEach(Tekrar0102::yazdir);
}
    // Task-2 : Functional Programming ile listin tek elemanlarinin  kuplerinin bir fazlasini ayni satirda
    // aralarina bosluk birakarak print ediniz

    public static void tekYzdr(List<Integer> sayi)
    {
        sayi.stream().filter(t->t%2==1).map(t->t*t*t+1).forEach(Tekrar0102::yazdir);
    }

    // Task-3 : Functional Programming ile listin cift elemanlarinin
    // karekoklerini ayni satirda aralarina bosluk birakarak yazdiriniz

public static void ciftkarekok(List<Integer>sayi)
{
    sayi.stream().filter(Tekrar0102::ciftbul).map(Math::sqrt).forEach(t-> System.out.print(t+" "));
}

public static boolean ciftbul(int a)
{
   return a%2==0;
}

    // Task-4 : list'in en buyuk elemanini yazdiriniz
    public static void enbyk(List<Integer>sayi){
      Optional<Integer> maxsayi = sayi.
        stream().reduce(Math::max);
        System.out.println(maxsayi);

    }

    // Structured yapı ile çözelim

public static void enbykStructerd(List<Integer>sayi){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<sayi.size();i++)
        {
            if(sayi.get(i)>max)
                max= sayi.get(i);

        }
    System.out.println("en buyuk sayi = " + max);
}
    // Task-5 : List'in cift elemanlarin karelerinin en buyugunu print ediniz
    public static void cftkareenbyk(List<Integer>sayi){
        System.out.println(sayi.stream().filter(Tekrar0102::ciftbul).map(t -> t * t).reduce(Math::max));

    }




    // Task-6: List'teki tum elemanlarin toplamini yazdiriniz.Lambda Expression...
    public static void top(List<Integer>sayi){
        System.out.println(sayi.stream().reduce(0, (a, b) -> a + b));
    }




    // Task-7 : List'teki cift elemanlarin carpimini  yazdiriniz.
    public static void ciftcarp(List<Integer>sayi){
        System.out.println(sayi.stream().filter(Tekrar0102::ciftbul).reduce(1, (a, b) -> a * b));
    }


    // Task-8 : List'teki elemanlardan en kucugunu  print ediniz.
public static void minbul(List<Integer>sayi){
    System.out.println(sayi.stream().reduce(Tekrar0102::kbrmin));

}

    public static int kbrmin(int a,int b){
      return   a<b ? a : b;
    }




    // Task-9 : List'teki 5'ten buyuk en kucuk tek sayiyi print ediniz.

    public static void bstnbykenkcktksy(List<Integer>sayi){
        System.out.println(sayi.stream().filter(t -> t > 5 && t % 2 == 1).reduce(Tekrar0102::kbrmin));
    }

    // Task-10 : list'in cift  elemanlarinin karelerini  kucukten buyuge print ediniz.
    public static void cftelkarkctnbyg(List<Integer>sayi){
        sayi.stream().filter(Tekrar0102::ciftbul).map(t->t*t).sorted().forEach(Tekrar0102::yazdir);
    }











}
