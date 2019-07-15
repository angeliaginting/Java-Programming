package com.pertemuan2;

import java.util.Scanner;

public class ifTunggal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //input
        System.out.print("Nama      : ");
        String nama = input.nextLine();
        System.out.print("Nilai     : ");
        int nilai = input.nextInt();

        //cek apakah dia lulus ataupun tidak
        if (nilai>=70 && nilai<=100){
            System.out.println("Selamat " + nama + ", Anda Lulus");
        }else{
            System.out.println("Maaf " + nama + ", Anda Gagal");
        }
    }
}
