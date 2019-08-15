package com.pertemuan9;

import java.util.Scanner;

public class fungsiLuasSegitiga {

    private double luasSegitiga(double alas, double tinggi){
        return alas * tinggi / 2;
    }

    public static void main(String[] args) {
        fungsiLuasSegitiga fungsi = new fungsiLuasSegitiga();

        System.out.print("Masukkan alas : ");
        Scanner input = new Scanner(System.in);
        double alas = input.nextDouble();
        System.out.print("Masukkan tinggi : ");
        double tinggi = input.nextDouble();

        double hasil = fungsi.luasSegitiga(alas, tinggi);
        System.out.println("Maka luas segitiga adalah : " + hasil);
    }
}
