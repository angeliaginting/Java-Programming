package com.pertemuan6.student1;

import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        myIdentity angel = new myIdentity();

        angel.setNis(111);
        angel.setNama("Angel");
        angel.setAlamat("Jl. Letsu");
        angel.setKelas("X IPA 2");
        angel.setNilai(90);

        System.out.println("NIS             : " +angel.getNis());
        System.out.println("Nama            : " +angel.getNama());
        System.out.println("Alamat          : " +angel.getAlamat());
        System.out.println("Kelas           : " +angel.getKelas());
        System.out.println("Nilai           : " +angel.getNilai());
    }
}
