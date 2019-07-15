package com.tugas;

import java.util.Scanner;
import java.text.DecimalFormat;

public class tugas2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.00");

        int kehadiran, tugas, mid, uas;

        System.out.print("Nama           : ");
        String nama = input.nextLine();
        System.out.print("Kehadiran      : ");
        kehadiran = input.nextInt();
        System.out.print("Tugas          : ");
        tugas = input.nextInt();
        System.out.print("Nilai MID      : ");
        mid = input.nextInt();
        System.out.print("Nilai UAS      : ");
        uas = input.nextInt();

        System.out.println("==================================");
        System.out.println("Nama               : " + nama);

        double nilai = 0.1 * kehadiran + 0.2 * tugas + 0.3 * mid + 0.4 * uas;

        System.out.println("Nilai              : " + df.format(nilai));

        if(nilai >= 80 && nilai <= 100){
            System.out.println("Grade              : A");
            System.out.println("Keterangan         : Dengan Pujian");
        }else if(nilai >= 70){
            System.out.println("Grade              : B");
            System.out.println("Keterangan         : Memuaskan");
        }else if(nilai >= 60){
            System.out.println("Grade              : C");
            System.out.println("Keterangan         : Cukup");
        }else if(nilai >= 50){
            System.out.println("Grade              : D");
            System.out.println("Keterangan         : Buruk");
        }else{
            System.out.println("Grade              : E");
            System.out.println("Keterangan         : Sangat Buruk");
        }
    }
}
