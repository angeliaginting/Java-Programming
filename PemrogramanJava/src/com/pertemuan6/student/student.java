package com.pertemuan6.student;

import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        myIdentity angel = new myIdentity();

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama       : ");
        angel.nama = input.nextLine();
        System.out.print("Masukkan Alamat     : ");
        angel.alamat = input.nextLine();
        System.out.print("Masukkan Kelas      : ");
        angel.kelas = input.nextLine();
        System.out.print("Masukkan NIS        : ");
        angel.nis = input.nextInt();
        System.out.print("Masukkan Nilai      : ");
        angel.nilai = input.nextInt();

//        angel.nis = 111;
//        angel.nama = "Angel";
//        angel.alamat = "Jl. Letsu";
//        angel.kelas = "X IPA 2";
//        angel.nilai = 90;

        System.out.println("NIS       : " + angel.nis +
                           "\nNama      : " + angel.nama +
                           "\nAlamat    : " + angel.alamat +
                           "\nKelas     : " + angel.kelas +
                           "\nNilai     : " + angel.nilai);
        System.out.println("");
        System.out.println("NIS             : " +angel.nis);
        System.out.println("Nama            : " +angel.nama);
        System.out.println("Alamat          : " +angel.alamat);
        System.out.println("Kelas           : " +angel.kelas);
        System.out.println("Nilai           : " +angel.nilai);
    }
}
