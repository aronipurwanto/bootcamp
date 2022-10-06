package logic02;

public class DeretAngka {
    public static void methodTest(){

    }

    public static String namaLengkap(String namaDepan, String namaBelakang, String gelar){
        String nama = namaDepan +" "+ namaBelakang +", "+gelar;
        return nama;
    }

    public static int[] fibonacchi(int n){
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            if(i < 2){
                array[i] = 1;
            }else {
                array[i] = array[i-1] + array[i-2];
            }
        }
        return array;
    }

    public static int[] tribonacchi(int nValue){
        int[] deret = new int[nValue];
        for (int i = 0; i < nValue; i++) {
            if(i < 3){
                deret[i] = 1;
            }else {
                deret[i] = deret[i-1] + deret[i-2] + deret[i-3];
            }
        }
        return deret;
    }
}
