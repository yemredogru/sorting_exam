package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[3];
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci sayı :");
        array[0]=input.nextInt();
        System.out.println("İkinci sayı :");
        array[1]=input.nextInt();
        System.out.println("Üçüncü sayı :");
        array[2]=input.nextInt();
        int temp;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[j]>array[i]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));




    }
}
