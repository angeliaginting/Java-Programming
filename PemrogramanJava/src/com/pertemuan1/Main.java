package com.pertemuan1;

import java.util.Scanner;

public class Main {

    public static double Bagi(double bil1, double bil2){
        return(bil1 / bil2);
    }

    public static void main(String[] args) {
	// write your code here
        Scanner ucok = new Scanner(System.in);

        //input
        System.out.print("Masukkan Nama   : ");
        String nama = ucok.nextLine();

        System.out.print("Masukkan Alamat : ");
        String alamat = ucok.nextLine();

        System.out.print("Masukkan No. Hp : ");
        int no = ucok.nextInt();

        //output
        System.out.println("Nama            : "+nama+" S.Kom");
        System.out.println("Alamat          : "+alamat);
        System.out.println("No. Hp          : "+no);


        //input
        System.out.print("Masukkan Bilangan 1 : ");
        int bil1 = ucok.nextInt();
        System.out.print("Masukkan Bilangan 2 : ");
        int bil2 = ucok.nextInt();

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
