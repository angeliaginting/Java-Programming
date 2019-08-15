package com.ujian;

import java.util.Scanner;

public class ujian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input banyaknya data : ");
        int data = input.nextInt();

        System.out.println("");

        String [] nama = new String[data];
        int [] nilai = new int[data];

        for (int i = 0; i < data ; i++) {
            System.out.println("Input Data " + (i + 1) + " : ");
            System.out.print("Input Nama Mahasiswa : ");
            nama[i] = input.next();
            System.out.print("Input Nilai Mahasiswa : ");
            nilai[i] = input.nextInt();
            System.out.println("");
        }

        System.out.println("");

        System.out.println("Menu : ");
        System.out.println("1. Tampilkan Data");
        System.out.println("2. Tambah Data");

        System.out.println("");

        System.out.print("Pilih Menu : ");
        int menu = input.nextInt();

        System.out.println("");

        if (menu == 1){
            for (int j = 0; j < data ; j++) {
                System.out.println("Data " + (j+1) + " : ");
                System.out.println("Nama Mahasiswa : " + nama[j]);
                System.out.println("Nilai Mahassiwa : " + nilai[j]);
                System.out.println("");
            }
        }else{
            System.out.print("Tambah banyaknya data : ");
            int data2 = input.nextInt();
            for (int j = 0; j < data2 ; j++) {
                System.out.println("Input Data " + (j+1) + " : ");
                System.out.print("Input Nama Mahasiswa : ");
                nama[j] = input.next();
                System.out.print("Input Nilai Mahasiswa : ");
                nilai[j] = input.nextInt();
                System.out.println("");
            }
        }
    }
}
