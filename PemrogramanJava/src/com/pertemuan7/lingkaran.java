package com.pertemuan7;

public class lingkaran extends bangunDatar {
    float r;

    @Override
    float luas(){
        float luas = (float) (Math.PI*r*r);
        System.out.println("Luas Lingkaran              : " + luas);
        return luas;
    }

    @Override
    float keliling(){
        float keliling = (float)(2*Math.PI*r);
        System.out.println("Keliling Lingkaran          : " + keliling);
        return keliling;
    }
}
