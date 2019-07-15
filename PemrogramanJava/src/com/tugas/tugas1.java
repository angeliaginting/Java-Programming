package com.tugas;

import java.util.Scanner;

public class tugas1 {

    public static double Bagi(double bil1, double bil2){
        return(bil1 / bil2);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //input
        System.out.print("Masukkan Bilangan 1 : ");
        int bil1 = input.nextInt();
        System.out.print("Masukkan Bilangan 2 : ");
        int bil2 = input.nextInt();

        //proses
        int tambah = bil1 + bil2;
        int kurang = bil1 - bil2;
        int kali = bil1 * bil2;

        //output
        System.out.println("Hasil dari " + bil1 + " + " + bil2 + " adalah " + tambah);
        System.out.println("Hasil dari " + bil1 + " - " + bil2 + " adalah " + kurang);
        System.out.println("Hasil dari " + bil1 + " * " + bil2 + " adalah " + kali);
        System.out.println("Hasil dari " + bil1 + " / " + bil2 + " adalah " + Bagi(bil1, bil2));

    }
}
