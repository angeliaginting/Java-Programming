package com.pertemuan8;

import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan var pertama : ");
        int var1 = input.nextInt();
        System.out.print("Masukkan var kedua : ");
        int var2 = input.nextInt();

        int sum = 0;
        for (int i = var1; i <= var2; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
