package com.pertemuan9;

public class function {
    public static void main(String[] args) {
        function fungsi = new function();
        int hasilJumlah = fungsi.pengulanganJumlah(5);
        System.out.println("Ini hasil jumlah : " + hasilJumlah);
        System.out.println("Hasil jumlah 2 : " + fungsi.pengulanganJumlah(4));
        System.out.println("Hasil jumlah 3 : " + fungsi.pengulanganJumlah(6));
    }

    public int pengulanganJumlah(int bil_2){
        int jumlah = 0;
        for(int i = 1; i <= bil_2; i++){
            jumlah = jumlah + i;
        }

        return jumlah;
    }
}
