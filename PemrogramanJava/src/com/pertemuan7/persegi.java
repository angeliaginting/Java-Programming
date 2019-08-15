package com.pertemuan7;

public class persegi extends bangunDatar {
    float sisi;

    @Override
    float luas(){
        float luas = sisi*sisi;
        System.out.println("Luas Persegi                : " + luas);
        return luas;
    }

    @Override
    float keliling(){
        float keliling = 4*sisi;
        System.out.println("Keliling Persegi            : " + keliling);
        return keliling;
    }
}
