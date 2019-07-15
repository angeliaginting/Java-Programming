package com.pertemuan2;

import java.util.Scanner;

public class ifJamak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //input
        System.out.println("Masukkan Warna       : ");
        String warna = input.nextLine();

        if(warna.equalsIgnoreCase("Merah")){
            System.out.println("Lampu " + warna + ", berhenti!");
        }else if(warna.equalsIgnoreCase("Kuning")){
            System.out.println("Lampu " + warna + ", harap hati-hati!");
        }else if(warna.equalsIgnoreCase("Hijau")){
            System.out.println("Lampu " + warna + ", silahkan jalan!");
        }else{
            System.out.println("Warna lampu yang di input salah");
        }
    }
}
