package com.company;

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
        int max=array[0];
        int min=array[0];
        int[] dizi=new int [2];
        for(int i=1;i<=array.length-1;i++){
            dizi[0]=max<array[i]?max=array[i]:max;
            dizi[1]=min>array[i]?min=array[i]:min;
        }
        System.out.println("En küçük sayı :"+dizi[1]);
        System.out.println("En büyük sayı :"+dizi[0]);
    }
}
