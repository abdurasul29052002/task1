package com.company;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result=0;
        int[][] table = new int[7][7];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                table[i][j]=sc.nextInt();
                if (table[i][j]==1){
                    result = Math.abs(i-3)+Math.abs(j-3);
                }
            }
        }
        System.out.println(result);
    }
}