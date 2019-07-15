package com.pertemuan3;

import java.util.Scanner;

public class perulanganFor_a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for(int i = 0; i<=10; i++){
            System.out.print(i + " ");
        }

        System.out.println("");

        for (int i = 0; i <=10 ; i+=2) {
            System.out.print(i + " ");
        }

        System.out.println("");

        for (int i = 1; i <=10 ; i+=2) {
            System.out.print(i + " ");
        }

        System.out.println("");

        for (int i = 1; i <=5 ; i++) {
            System.out.println("Hello World " + i);
        }

        System.out.println("");

        for (int i = 10; i >= 0 ; i--) {
            System.out.print(i + " ");
        }
    }
}
