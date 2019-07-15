package com.tugas;

import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int jumlah;
        System.out.print("Masukkan jumlah data yang ingin di input: ");
        jumlah = input.nextInt();

        int data[] = new int[jumlah];

        for (int i = 0; i < jumlah ; i++) {
            System.out.print("Masukkan Data ke - " + (i+1) + " : ");
            data[i] = input.nextInt();
        }

        System.out.println("");

        for (int x : data) {
            System.out.println("Data : " + x);
        }

        System.out.println("");

        int sum = 0;
        for(int x : data){
            sum += x;
        }

        System.out.println("Jumlah data dari array : " + sum);

    }
}
