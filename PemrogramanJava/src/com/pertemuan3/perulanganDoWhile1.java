package com.pertemuan3;

import java.util.Scanner;

public class perulanganDoWhile1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String x;

        do{
            for(int i = 0; i<=10; i++){
                System.out.print(i + " ");
            }

            System.out.println("");

            System.out.println("Apakah Anda Ingin Mengulang? [yes/no]");
            x = input.nextLine();
        }while(x.equalsIgnoreCase("yes"));
    }
}
