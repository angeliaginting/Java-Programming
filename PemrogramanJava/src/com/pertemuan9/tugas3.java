package com.pertemuan9;

import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        tugas3 fungsi = new tugas3();

        System.out.print("Masukkan Bilangan Pertama : ");
        int bil1 = input.nextInt();
        System.out.print("Masukkan Bilangan Kedua : ");
        int bil2 = input.nextInt();

        System.out.println("Hasil Penjumlahan : " + fungsi.penjumlahan(bil1, bil2));
        System.out.println("Hasil Pengurangan : " + fungsi.pengurangan(bil1, bil2));
        System.out.println("Hasil Perkalian : " + fungsi.perkalian(bil1, bil2));
        System.out.println("Hasil Pembagian : " + fungsi.pembagian(bil1, bil2));
    }

    public int penjumlahan(int bil1, int bil2){
        return bil1 + bil2;
    }

    public int pengurangan(int bil1, int bil2){
        return bil1 - bil2;
    }

    public int perkalian(int bil1, int bil2){
        return bil1 * bil2;
    }

    public double pembagian(double bil1, double bil2){
        return bil1 / bil2;
    }
}
