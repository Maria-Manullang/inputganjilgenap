package com.Pertemuan10;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        System.out.print("Masukkan jumlah array: ");
        Scanner input=new Scanner(System.in);

        int jumlah=input.nextInt();
        int []arrayInt=new int[jumlah];
        array obj=new array();
        arrayInt=obj.inputArray(jumlah);

        obj.tampilkanArray(arrayInt);
    }
    public int[] inputArray(int jumlah){
        int []arrayInt=new int[jumlah];
        Scanner input=new Scanner(System.in);
        for(int i=0; i<jumlah; i++){
            System.out.println(" ");
            System.out.print("Masukkan indeks ke "+(i+1)+" = ");
            arrayInt[i]=input.nextInt();
            if(arrayInt[i]%2==1){
                System.out.println("Ganjil");
            }else{
                System.out.println("Genap");
            }
        }
        return arrayInt;
    }

    public void tampilkanArray(int[]arrayInt){
      for(int i=0;i<arrayInt.length;i++){
          System.out.println(" ");
          System.out.print(+arrayInt[i]+1 +" ");
      }
    }
}

