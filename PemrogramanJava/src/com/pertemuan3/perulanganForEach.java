package com.pertemuan3;

public class perulanganForEach {
    public static void main(String[] args) {

        int angka[] = {20, 12, 13, 14, 16};

        System.out.print(angka[0]);
        System.out.print(angka[1]);
        System.out.print(angka[2]);
        System.out.print(angka[3]);
        System.out.print(angka[4]);

        System.out.println("");

        for(int x : angka){
            System.out.print(x + " ");
        }
    }
}
