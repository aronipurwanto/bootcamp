package logic02;

import java.util.Scanner;

public class SoalNo1 {
    public static void main(String[] args) {
        // buat array
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan nilai n : ");
        int n = scanner.nextInt();
        // membuat array
        int[][] array = new int[n][n];

        //mengisi array
        int angka = 1;
        // buat for baris
        for (int i = 0; i < n; i++) {
            // buat for kolom
            for (int j = 0; j < n; j++) {
                // isi array
                array[i][j] = angka;
                angka++;
            }
        }

        // print array
        PrintArray.array2Dimensi(array);
    }
}
