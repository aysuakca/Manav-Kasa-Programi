import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double armutFiyat=2.14;
        double elmaFiyat=3.67;
        double domatesFiyat=1.11;
        double muzFiyat=0.95;
        double patlicanFiyat=5.00;
        double toplam,armutKg,elmaKg,domatesKg,muzKg,patlicanKg;

        Scanner inp= new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        armutKg = inp.nextDouble();

        System.out.print("Elma Kaç Kilo ? : ");
        elmaKg = inp.nextDouble();

        System.out.print("Domates Kaç Kilo ? : ");
        domatesKg = inp.nextDouble();

        System.out.print("Muz Kaç Kilo ? : ");
        muzKg = inp.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlicanKg = inp.nextDouble();

        toplam =(armutFiyat*armutKg) + (elmaFiyat*elmaKg) + (domatesFiyat*domatesKg) + (muzFiyat*muzKg) + (patlicanFiyat*patlicanKg);

        System.out.println("Toplam Tutar :  " + toplam);
    }
}
