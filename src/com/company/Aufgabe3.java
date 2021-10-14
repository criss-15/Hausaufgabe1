package com.company;

public class Aufgabe3 {
    public static int[] summe_array(int[] arr1, int[] arr2){
        int t=0; //rest
        int s=0; //summe
        int[] arr3 = new int[arr1.length+1];
        for(int i=arr1.length-1; i>=0; i--){ //parcurgem invers pentru ca adunam
            s=arr1[i] + arr2[i] + t;
            arr3[i+1]= s % 10; //incepem de la pozitia 9 si mergem catre prima pozitie adica 0;
            t = s / 10;  //in t stocam ce merge mai departe
        }
        arr3[0] = t; //pe prima pozitie punem ce a mers mai departe
        return arr3;
    }

    public static int[] diff_array(int[] arr1, int[] arr2){
        int[] arr3=new int[arr1.length];
        int i=0;

        if(arr1[i]> arr2[i]){ //cand nu te imprumuti
            for(i=arr1.length-1; i>=0; i--){
                if(arr1[i]>=arr2[i]){
                    arr3[i]=arr1[i]-arr2[i];
                }else{
                    arr3[i] = arr1[i]+10-arr2[i]; //+10 ca am imprumutat
                    arr1[i-1]--; //ne-am imprumutat de aici
                }
            }
        }
        else{
            for(i=arr2.length-1; i>=0; i--){
                if(arr2[i]>=arr1[i]){
                    arr3[i]=arr2[i]-arr1[i];
                }
                else{
                    arr3[i]=arr2[i]+10-arr1[i];
                    arr2[i-1]--;
                }
            }
        }
        return arr3;
    }
    public static int[] mul_array(int[] arr1, int n){
        int[] arr3=new int[arr1.length+1];
        for(int i=arr1.length-1; i>=0; i--){
            arr3[i+1]=arr1[i] *n; //punem pe pozitia urmatoare pt ca putem avea 12, 15
        }
        for(int i=arr3.length-1; i>0; i--){
            arr3[i-1]= arr3[i-1]+ arr3[i]/10;
            arr3[i]= arr3[i]%10;
        }
        return arr3;
    }
    public static int[] division_array(int[] arr1, int n){
        int[] arr3=new int[arr1.length];
        int t = 0;
        for(int i=0; i< arr1.length-1; i++){ //nu mai merge invers pt ca nr devine mai mic
            int d = t * 10 + arr1[i]; //t e restul
            arr3[i]=d / n; //punem partea intreaga
            t= d% n; //restul stocam in t
        }
        return arr3;
    }
}
