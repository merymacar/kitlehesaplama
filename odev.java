import java.util.Scanner;

public class odev {
   public static void main(String[] args){
    int kilo;
    double boy;
       //scanner sınıf tanımlama
       Scanner inp = new Scanner(System.in);
       //Kullanıcıdan değer alma
       System.out.print("kilo girin : ");
       kilo= inp.nextInt();
       System.out.print("boy girin : ");
       boy= inp.nextDouble();

       double boykare = (boy*boy);
       double sonuc= kilo/boykare;
       System.out.println("Vücut Kitle Endeksiniz" +sonuc);



   }
}





