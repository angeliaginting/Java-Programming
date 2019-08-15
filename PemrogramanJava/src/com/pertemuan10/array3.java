package com.pertemuan10;

import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah array: ");
        int jumlah = input.nextInt();
        int[] array = new int[jumlah];

        for (int i = 0; i < jumlah ; i++) {
            System.out.print("Masukkan indeks ke - " + i + " : ");
            array[i] = input.nextInt();
            System.out.println(array[i] + (i+1));
        }
    }
}
