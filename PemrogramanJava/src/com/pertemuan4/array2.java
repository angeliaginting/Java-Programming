package com.pertemuan4;

public class array2 {
    public static void main(String[] args) {
        String [] name = new String[10];

        name[0] = "Fibra";
        name[1] = "Maria";
        name[2] = "Lidia";
        name[3] = "Rida";
        name[4] = "Angel";
        name[5] = "sofi";
        name[6] = "Dicky";
        name[7] = "Faqih";
        name[8] = "Khairul";
        name[9] = "Ilham";

        //cara memanggil menggunakan perulangan
        for (int i = 0; i < name.length ; i++) {
            System.out.println(name[i]);
        }
    }
}
