package com.pertemuan7;

public class main {
    public static void main(String[] args) {

        //membuat objek bangun datar
        bangunDatar mBangunDatar = new bangunDatar();

        //membuat objek persegi dan mengisi nilai properti
        persegi mPersegi = new persegi();
        mPersegi.sisi = 3;

        //membuat objek persegiPanjang dan mengisi nilai properti
        persegiPanjang mPersegiPanjang = new persegiPanjang();
        mPersegiPanjang.panjang = 5;
        mPersegiPanjang.lebar = 8;

        //membuat objek lingkaran dan mengisi nilai properti
        lingkaran mLingkaran = new lingkaran();
        mLingkaran.r = 22;

        //membuat objek segitiga dan mengisi nilai properti
        segitiga mSegitiga = new segitiga();
        mSegitiga.alas = 4;
        mSegitiga.tinggi = 8;

        //memanggil method luas dan keliling
        mBangunDatar.luas();
        mBangunDatar.keliling();

        System.out.println("");

        mPersegi.luas();
        mPersegi.keliling();

        System.out.println("");

        mPersegiPanjang.luas();
        mPersegiPanjang.keliling();

        System.out.println("");

        mLingkaran.luas();
        mLingkaran.keliling();

        System.out.println("");

        mSegitiga.luas();
    }
}
