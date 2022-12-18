import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dairede Alan ve Çevre Bulma Programı");
        Scanner imput =new Scanner(System.in);
        System.out.print("Lütfen Daire Yarı Çapını giriniz.");
        double yaricap=imput.nextDouble();
        double cevre=Math.PI*2*yaricap;
        double alan=Math.PI*yaricap*yaricap;
        System.out.println("Dairenin çevresi : "+cevre);
        System.out.println("Dairenin alanı : "+alan);

        //Ödev sorusu çözümü
        System.out.println("Lütfen Daire Diliminin Alanını Bulmaya Hoş Geldiniz.");
        System.out.print("Lütfen Daire Yarı Çapını giriniz.");
        double yaricap2=imput.nextDouble();
        System.out.print("Lütfen Daire diliminin açısını giriniz.");
        double aci=imput.nextDouble();
        double alan2=(Math.PI*yaricap2*yaricap2)*(aci/360);
        System.out.println("Dairenin alanı : "+alan2);
    }
}