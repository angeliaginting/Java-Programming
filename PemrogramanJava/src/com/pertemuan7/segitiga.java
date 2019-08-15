package com.pertemuan7;

public class segitiga extends bangunDatar {
    float alas, tinggi;

    @Override
    float luas(){
        float luas = alas * tinggi;
        System.out.println("Luas Segitiga               : " + luas);
        return luas;
    }
}
