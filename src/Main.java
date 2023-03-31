 import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Yıl giriniz: ");
        int yil = input.nextInt();
        if (yil % 4 == 0 &&(yil % 100 != 0 || yil % 400==0)){
            System.out.println(yil + " Artık yıldır.");
        }else {
            System.out.println(yil + " Bir artık yıl değildir. ");
        }

    }


}