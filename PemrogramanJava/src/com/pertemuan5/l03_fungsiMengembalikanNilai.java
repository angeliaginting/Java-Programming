package com.pertemuan5;

public class l03_fungsiMengembalikanNilai {

    static int luasPersegi(int sisi){
        int luas = sisi * sisi;
        return luas;
    }

    public static void main(String[] args) {
        System.out.println("Luas Persegi adalah " + luasPersegi(8));
        System.out.println("Luas Persegi adalah " + luasPersegi(10));
    }
}
