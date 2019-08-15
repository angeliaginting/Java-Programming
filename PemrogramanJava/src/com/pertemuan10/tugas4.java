package com.pertemuan10;

import java.util.Scanner;

public class tugas4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah array: ");
        int jumlah = input.nextInt();
        int[] array = new int[jumlah];

        for (int i = 0; i < jumlah ; i++) {
            System.out.print("Masukkan indeks ke - " + i + " : ");
            array[i] = input.nextInt();
            if(array[i] % 2 == 1){
                System.out.println("Ini bilangan ganjil");
            }else{
                System.out.println("Ini bilangan genap");
            }
        }
    }
}
