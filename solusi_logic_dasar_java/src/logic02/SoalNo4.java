package logic02;

import java.util.Scanner;

public class SoalNo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukan nilai n: ");
        int n = scanner.nextInt();

        // deret angka, dengan memanggil method yang ada di Class DeretAnga
        int[] deret = DeretAngka.fibonacchi(n);

        // buat array 2 dimensi
        String[][] array2Dimensi = new String[n][n];

        // isi array
        // 1. buat loop baris
        for (int i = 0; i < n; i++) {
            // 2. buat loop kolom
            for (int j = 0; j < n; j++) {
                // proses isi
                if(i == 0 || j==0 || i == n/2){
                    array2Dimensi[i][j] = deret[j]+"";
                }else if(i == n-1 || j== n-1 || j== n/2){
                    array2Dimensi[i][j] = deret[j]+"";
                }
            }
        }

        // cetak array
        // memanggil method print
        PrintArray.array2Dimensi(array2Dimensi);
    }
}
