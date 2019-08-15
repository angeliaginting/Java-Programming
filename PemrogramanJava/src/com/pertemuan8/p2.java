package com.pertemuan8;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan var 1: ");
        int var1 = input.nextInt();
        System.out.print("Masukkan var 2: ");
        int var2 = input.nextInt();

        int temp;
        temp = var1;
        var1 = var2;
        var2 = temp;
        System.out.println("Ini var1 : " + var1);
        System.out.println("Ini var2 : " + var2);
    }
}
