package io.learn.dataprovider;

public class TwoDimensionalArray {

    public static void main(String[] args) {

        //one-dimensional array
        int[] arr = new int[10];
        int[] arr2 = { 1, 2, 3, 4, 5};

        //two-dimensional array
        int[][] twoDimArray = new int[3][3];
        twoDimArray[0][0] = 1;
        twoDimArray[0][1] = 2;
        twoDimArray[0][2] = 3;
        twoDimArray[1][0] = 4;
        twoDimArray[1][1] = 5;
        twoDimArray[1][2] = 6;
        twoDimArray[2][0] = 7;
        twoDimArray[2][1] = 8;
        twoDimArray[2][2] = 9;

        for(int i = 0; i < twoDimArray.length; i++) {
            for(int j = 0; j < twoDimArray.length; j++) {
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
