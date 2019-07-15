package com.pertemuan4;

public class array5 {
    public static void main(String[] args) {
        int angka[] = {18, 19, 20, 21, 22};

        //array menampilkan data
        for (int i = 0; i < angka.length ; i++) {
            System.out.println("Indeks ke - " + i + " = " + angka[i]);
        }

        //untuk menghitung jumlah data yang ada di array
        System.out.println("Banyak data array : " +angka.length);

        int sum = 0;
        //array penjumlahan semua data di dalam indeks array
        for(int x : angka){
            sum += x;
        }
        System.out.println(sum);
    }
}
