package com.company;

import java.util.ArrayList;
import java.util.List;

public class Aufgabe1 {

    public static List<Integer> nichtausreichendeNoten(List<Integer> notenList){
        List<Integer> nicht_reichende_noten = new ArrayList<>();
        for(int i: notenList) {
            if (i < 40)
                nicht_reichende_noten.add(i);
        }
        return nicht_reichende_noten;

    }

    public static double durchschnittsWert(List<Integer> notenList) {
        double durchschnittsNote;
        int sum=0;
        for(int i: notenList)
        {
            sum=sum+i;
        }
        durchschnittsNote = sum/notenList.size();
        return durchschnittsNote;
    }

    public static List<Integer> abgerundeteNoten(List<Integer> notenList) {
        List<Integer> abgerundete_noten = new ArrayList<>();
        for (int note : notenList) {
            if (note > 40) {
                if ((note % 10) % 5 == 0)
                    abgerundete_noten.add(note);
                if ((note % 10) < 3) {
                    note = note - (note % 10);
                    abgerundete_noten.add(note);
                } else {
                    if ((note % 10) >= 3 && (note % 10) < 5) {
                        note = note + (5 - (note % 10));
                        abgerundete_noten.add(note);
                    }
                }
                if ((note % 10) < 8 && (note % 10) > 5) {
                    note = note - ((note % 10) - 5);
                    abgerundete_noten.add(note);
                } else {
                    if ((note % 10) >= 8) {
                        note = note + (10 - (note % 10));
                        abgerundete_noten.add(note);
                    }
                }
            }
        }
        return abgerundete_noten;

    }

    public static int maximaleAbgNote(List<Integer> abgerundeteNoten){
        List<Integer> abgerundete_noten=new ArrayList<>();
        int maxNote=39;
        abgerundete_noten=abgerundeteNoten(abgerundeteNoten);
        for(int i:abgerundete_noten)
        {
            if(i > maxNote)
                maxNote=i;
        }
        return maxNote;
    }
}
