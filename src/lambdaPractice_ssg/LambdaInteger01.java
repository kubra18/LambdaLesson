package lambdaPractice_ssg;

import java.util.Arrays;
import java.util.List;

public class LambdaInteger01 {
    public static void main(String[] args) {
        List<Integer> intL= Arrays.asList(-2,-8,-5,1,2,5,6,7,15,6,8);
        tekYaz(intL);
        System.out.println();
        System.out.println(cftcrpbl(intL));
        System.out.println();
        System.out.println(ngtfkrtp(intL));
        System.out.println();
        System.out.println(pzkplrnmx(intL));

    }
    public static void tekYaz(List<Integer> l){
        l.stream().filter(Utils::tekMi).forEach(Utils::printSameLine);

    }
    // S2: ciftlerin carpimini bulalim
    public static java.util.Optional<Integer> cftcrpbl(List<Integer> l){
    return l.stream().filter(Utils::ciftMi).reduce(Math::multiplyExact);
    //   return l.stream().filter(Utils::ciftMi).reduce(1,(x,y)->x*y);
    }

    // S3: negatiflerin kare toplamlarini  bulalim
    public static java.util.Optional<Integer> ngtfkrtp(List<Integer> l){
     return   l.stream().filter(Utils::negatifMi).map(Utils::kareBul).reduce(Utils::toplam);

    }
    // S4: poziflerin kuplerinden max olani yazdiralim
    public static java.util.Optional<Integer> pzkplrnmx(List<Integer> l){
        return l.stream().filter(Utils::pozitifMi).map(Utils::kupBul).reduce(Math::max);
    }
}
