package com.pertemuan6.book;

public class myBook {
    public static void main(String[] args) {
        buku book = new buku();

        book.judul = "Coding is Art";
        book.penulis = "Angel";
        book.jumlahHalaman = 410;
        book.penerbit = "Andi";

        System.out.println("Buku            : " + book.judul);
        System.out.println("Penulis         : " + book.penulis);
        System.out.println("Jumlah Halaman  : " + book.jumlahHalaman);
        System.out.println("Penerbit        : " + book.penerbit);
    }
}
