package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
      //Problem1
    System.out.println("Problem1");
    List<Integer> note = new ArrayList<>(Arrays.asList(32,56,45,88,25,61,67,49));
    Aufgabe1 obj1=new Aufgabe1();
    System.out.print(obj1.nichtausreichendeNoten(note).toString());
    System.out.println(obj1.durchschnittsWert(note));
    System.out.println(obj1.abgerundeteNoten(note).toString());
    System.out.println(obj1.maximaleAbgNote(note));


        //Problem2
        System.out.println(" ");
    System.out.println("Problem 2");
    int array[]={1,2,5,6,3,7,1,9,5};
    int array2[]={30,25,40,100,5,1,7};
    int array3[]={7,4,3,2,90,25,1,99};
    Aufgabe2 obj=new Aufgabe2();
    System.out.println(obj.getMax(array,9));
    System.out.println(obj.getMax(array2,7));
    System.out.println(obj.getMax(array3,8));
    System.out.println(obj.getMin(array,9));
    System.out.println(obj.getMin(array2,7));
    System.out.println(obj.getMin(array3,8));
    System.out.println(obj.maxSum(array,9));
    System.out.println(obj.maxSum(array2,7));
    System.out.println(obj.maxSum(array3,8));
    System.out.println(obj.minSum(array,9));
    System.out.println(obj.minSum(array2,7));
    System.out.println(obj.minSum(array3,8));

        //Problema3
        System.out.println(" ");
        System.out.println("Problema3");
        Aufgabe3 obj3=new Aufgabe3();
        int [] arr1 = new int[]{8,7,0,0,0,0,0,0,0};
        int [] arr2 = new int[]{1,3,0,0,0,0,0,0,0};
        int [] arr3 = new int[]{8,3,0,0,0,0,0,0,0};
        int [] arr4 = new int[]{5,4,0,0,0,0,0,0,0};
        int [] arr5 = new int[]{2,3,6,0,0,0,0,0,0};
        int [] arr6 = new int[]{2,3,6,0,0,0,0,0,0};
        System.out.println(Arrays.toString(obj3.summe_array(arr1,arr2)));
        System.out.println(Arrays.toString(obj3.diff_array(arr3,arr4)));
        System.out.println(Arrays.toString(obj3.mul_array(arr5,2)));
        System.out.println(Arrays.toString(obj3.division_array(arr6,2)));


        //Problema4
        System.out.println(" ");
        System.out.println("Problema4");
        Aufgabe4 obj4 = new Aufgabe4();
        List<Integer> preis_tastatur = new ArrayList<>(Arrays.asList(15, 45, 20));
        List<Integer> preis_usb = new ArrayList<>(Arrays.asList(8, 12, 20, 25));
        System.out.println(obj4.billigsteTastatur(preis_tastatur));
        System.out.println(obj4.teuersteGegenstand(preis_tastatur, preis_usb));
        System.out.println(obj4.teuersteUSB(preis_usb, 18));
        System.out.println(obj4.gekaufteProdukte(preis_tastatur, preis_tastatur, 60));
        System.out.println(obj4.gekaufteProdukte(preis_tastatur, preis_usb, 5));


    }
}
