package jualan.kereta;

import java.util.Scanner;

public class JualanKereta {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double gajiasas = 1800.00;
        double komisyen;
        int bil;

        System.out.println("Masukkan Bilangan Kereta = ");

        bil = input.nextInt();

        if (bil >= 10) {
            komisyen = 10000.00;
        } else if (bil >= 5 && bil <= 9) {
            komisyen = 6000.00;
        } else if (bil >= 1 && bil <= 4) {
            komisyen = 3000.00;
        } else {
            komisyen = 0;
        }

        double jumlahGaji = gajiasas + komisyen;

        System.out.println("Jumlah kereta dijual: " + bil);
        System.out.println("Jumlah komisyen: " + komisyen);
        System.out.println("Jumlah gaji: " + jumlahGaji);
        
        
    }

}
