package com.company;

import java.util.Random;
import java.util.Scanner;

public class task5 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*int a;
        do{
            a = in.nextInt();
        } while (a<=0);
        int count =0;
        for(int i=1; i<Math.sqrt(a); i++) count++;
        System.out.println(count);*/

        int n = 5;
        int m = 6;
        int a[][] = inputArray(n, m,0, 10);
        printArray(a,n,m);
        Task (a, n, m);
        }

    public static int[][] inputArray(int n, int m, int a, int b) {
        Random random = new Random();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = random.nextInt(a, b);
            }
        }
        return arr;
    }
    public static void printArray (int[][]arr, int n, int m){
        for (int i = 0; i<n; i++){
            for (int j = 0; j<m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }



    public static void Task (int[][] arr, int n, int m){
        int count = 0;
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                if (isLocalMax(arr, n, m, i, j)){
                    count++;
                    System.out.println(count + " число = " + arr[i][j]);
                    System.out.println("Индекс: " +  i + " " + j);
                }
            }
        }
        if (count==0){
            System.out.println("Чисел нет");
        }
    }
    public static boolean isLocalMax(int arr[][], int n, int m, int i, int j){
        int startI = i>0? i-1:0;
        int endI = i<n-1? i+1:n-1;
        int startJ=j>0? j-1:0;
        int endJ = j<m-1? j+1:m-1;
        for (int f=startI; f<=endI; f++){
            for (int k=startJ; k<=endJ; k++){
                if (!(f==i && k==j)){
                    if (arr[f][k]>=arr[i][j]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
