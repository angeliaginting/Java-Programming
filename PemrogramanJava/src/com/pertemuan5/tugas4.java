package com.pertemuan5;

import java.util.Scanner;

public class tugas4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int s;

        System.out.print("Sisi adalah ");
        s = input.nextInt();

        int luas = luasKubus(s);
        int luas1 = luasPersegi(s);

        System.out.println("Luas Persegi adalah " + luas1);
        System.out.println("Luas Kubus adalah " + luas);
    }

    //membuat fungsi luas persegi
    static int luasPersegi(int sisi){
        return sisi*sisi;
    }

    //membuat fungsi luas kubus
    static int luasKubus(int sisi){
        //memanggil fungsi luas persegi
        return 6 * luasPersegi(sisi);
    }
}
