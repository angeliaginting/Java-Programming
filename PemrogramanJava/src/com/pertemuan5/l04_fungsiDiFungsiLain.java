package com.pertemuan5;

public class l04_fungsiDiFungsiLain {
    public static void main(String[] args) {
        int s = 8;
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
