package com.pertemuan4;

import java.util.Scanner;

public class array4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String [] buah = new String[5];

        //array untuk input data
        for (int i = 0; i < buah.length ; i++) {
            System.out.print("Buah ke - " + i + " = ");
            buah[i] = input.nextLine();
        }

        //array untuk output
        for(String x : buah){
            System.out.println(x);
        }
    }
}
