package by.htp.les04.main;

import java.util.Random;

public class task3 {
    public static void main(String[] args) {

        int m = 5;
        int n = 6;
        int[][] mas = new int[m][n];
        Random rand = new Random();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = rand.nextInt(20);

                System.out.print(mas[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {

                if ((i % 2 == 0) || (i == 0)) {

                    System.out.print(mas[i][j] + "  ");

                } else { 
                    System.out.print(mas[i][mas[0].length - 1 - j] + "  ");

                }


            }
            System.out.println();

        }
    }
}
