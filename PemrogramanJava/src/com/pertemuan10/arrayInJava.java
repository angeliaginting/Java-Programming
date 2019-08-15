package com.pertemuan10;

import java.util.Scanner;

public class arrayInJava {
    public static void main(String[] args) {
        String[] baju = new String[3];

        baju[0] = "Joger";
        baju[1] = "Hugo";
        baju[2] = "Polo";

        System.out.println("indeks 0 : " + baju[0] + " indeks 1 : " +
                baju[1] + " indeks 2 : " + baju[2]);

        baju[1] = "Nevada";
        System.out.println("indeks 0 : " + baju[0] + " indeks 1 : " +
                baju[1] + " indeks 2 : " + baju[2]);

        System.out.println("Masukkan jumlah array : ");
        Scanner input = new Scanner(System.in);

        int jumlah = input.nextInt();
        int[] arrayInt = new int[jumlah];
        for (int i = 0; i < jumlah ; i++) {
            System.out.println("Masukkan indeks ke " + i);
            arrayInt[i] = input.nextInt();
        }

        for (int i = 0; i < jumlah; i++) {
            System.out.println(arrayInt[i]);
        }
    }
}
