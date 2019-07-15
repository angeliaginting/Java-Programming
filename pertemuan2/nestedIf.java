package com.pertemuan2;

import java.util.Scanner;

public class nestedIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kartu;
        int belanjaan, diskon, uang, kembalian;

        System.out.print("Apakah anda punya kartu member? ");
        kartu = input.nextLine();
        System.out.print("Belanjaan               : ");
        belanjaan = input.nextInt();

        if(kartu.equalsIgnoreCase("Ya")){
            if(belanjaan>500000){
                diskon = 50000;
            }else if(belanjaan>100000){
                diskon = 15000;
            }else{
                diskon = 5000;
            }
        }else if(kartu.equalsIgnoreCase("Tidak")){
            if(belanjaan>500000){
                diskon = 30000;
            }else if(belanjaan>100000){
                diskon = 10000;
            }else{
                diskon = 0;
            }
        }else{
            diskon = 0;
            System.out.println("Maaf yang anda input salah!");
        }

        int bayar = belanjaan - diskon;

        System.out.println("Total Belanjaan         : " +belanjaan);
        System.out.println("Diskon                  : " +diskon);
        System.out.println("Total yang di bayar     : " +bayar);
        System.out.print("Uang                    : ");
        uang = input.nextInt();

        if(uang<bayar){
            System.out.println("Maaf, uang anda kurang");
        }

        //untuk mendapatkan uang kembalian
        kembalian = uang - bayar;
        System.out.println("Kembalian               : " +kembalian);
    }
}
