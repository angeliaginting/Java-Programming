package com.pertemuan4;

import java.util.Scanner;

public class array6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka[] = new int[5];

        for (int i = 0; i <angka.length ; i++) {
            System.out.print("Angka ke - " + i + " = ");
            angka[i] = input.nextInt();
        }

        for(int x : angka){
            System.out.println(x);
        }

        //penjumlahan
        int sum = 0;
        for (int x : angka) {
            sum += x;
        }
        System.out.println("Jumlah data dari array: " +sum);
    }
}
