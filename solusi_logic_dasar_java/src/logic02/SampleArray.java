package logic02;

public class SampleArray {
    public static void main(String[] args) {
        // deklrasi array 1 dimensi
        String[] array = new String[10];
        // mengisi array 1 dimensi
        array[0] = "sate";
        array[2] = "bakso";
        array[1] = "mie ayam";

        // deklarasi array 2 dimensi
        String[][] array2Dimensi = new String[9][4];
        System.out.println(array2Dimensi);

        int[][] arrayInt = new int[5][6];
        System.out.println(arrayInt);
    }
}
