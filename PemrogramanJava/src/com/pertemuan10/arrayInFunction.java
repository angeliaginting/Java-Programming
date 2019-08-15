package com.pertemuan10;

import java.util.Scanner;

public class arrayInFunction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan jumlah array: ");
        int jumlah = input.nextInt();
        int[] arrayInt = new int[jumlah];

        //definisi objek untuk nama kelas arrayInFunction
        arrayInFunction obj = new arrayInFunction();

        //memanggil fungsi inputArray
        arrayInt = obj.inputArray(jumlah);

        //buat fungsi untuk menampilkan array
        obj.tampilkanArray(arrayInt);
    }

    public int[] inputArray(int jumlah){
        int[] arrayInt = new int[jumlah];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < jumlah ; i++) {
            System.out.println("Masukkan indeks ke " + i);
            arrayInt[i] = input.nextInt();
        }
        return arrayInt;
    }

    public void tampilkanArray(int[] arrayInt){
        for (int i = 0; i < arrayInt.length ; i++) {
            System.out.println(arrayInt[i]);
        }
    }
}
