package stayceey.algorytmy1;
import java.util.Scanner;
public class Algorytmy1 {

    public static void main(String[] args) {
        Scanner pierwszy = new Scanner(System.in);
        Scanner drugi = new Scanner(System.in);
        Scanner trzeci = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę.");
        int a = pierwszy.nextInt();
        System.out.println("Podaj drugą liczbę.");
        int b = drugi.nextInt();
        System.out.println("Podaj trzecią liczbę.");
        int c = trzeci.nextInt();
        int max = a;
        if (b > max){
            max = b;
        }
        if (c > max ){
            max =c;
        }
        System.out.println("Największa liczba to: "+max);
    }
}
