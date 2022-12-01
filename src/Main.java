import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double num1, num2, islem;

        Scanner input = new Scanner(System.in);
        System.out.println("İlk Sayıyı Giriniz");
        num1 = input.nextInt();
        System.out.println("İkinci Sayıyı Giriniz");
        num2 = input.nextInt();

        System.out.println("1-Toplama\n 2-Çıkartma\n 3-Çarpma \n 4-Bölme");
        islem = input.nextInt();
        switch ((int) islem){
            case 1:
                System.out.println("toplam= " + (num1 + num2));
                break;
            case 2:
                System.out.println("çıkarma= " + (num1 - num2));
                break;
            case 3:
                System.out.println("çarpma= " + (num1 * num2));
                break;
            case 4:
                System.out.println("bölme= " + (num1 / num2));
                break;
        }


    }
}
