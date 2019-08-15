package com.pertemuan8;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan pertama : ");
        int bil = input.nextInt();
        System.out.print("Masukkan bilangan kedua : ");
        int bil2 = input.nextInt();

        if(bil > bil2){
            System.out.println("Maka " + bil + " > " + bil2);
        }else{
            System.out.println("Maka " + bil2 + " > " + bil);
        }

        if(bil %2 == 1){
            System.out.println("Ganjil");
        }else{
            System.out.println("Genap");
        }

        System.out.println("");

        int waktu = 0;
        for(int kecepatan = 2; kecepatan <= 20; kecepatan+=2){
            waktu++;
        }
        System.out.println("Maka waktu : " + waktu);

        for(int i = 1; i <=10; i++){
            System.out.println(i);
        }
    }
}
