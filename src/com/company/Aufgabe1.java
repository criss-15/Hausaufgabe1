package com.company;

import java.util.ArrayList;
import java.util.List;

public class Aufgabe1 {

    /* die Methode rechnet die nicht ausreichende Noten;
    Input:ein array von Noten;
    Output: ein array mit nicht ausreichende Noten;
     */

    public static List<Integer> nichtausreichendeNoten(List<Integer> notenList){
        List<Integer> nicht_reichende_noten = new ArrayList<>();
        for(int i: notenList) {
            if (i < 40)
                nicht_reichende_noten.add(i);
        }
        return nicht_reichende_noten;

    }

    /* die Methode rechnet den Durchschnittswert;
    Input: ein array von Noten;
    Output: die Durchschnittsnote;
     */
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


    /* die Methode rechnet die abgerundete Noten
    Input: ein array von Noten;
       Output: ein Array mit abgerundete Noten;
     */
    public static List<Integer> abgerundeteNoten(List<Integer> notenList) {
        List<Integer> abgerundete_noten = new ArrayList<>();   //creeam lista de note rotunjite
        for (int note : notenList) {
            if (note > 40) {      //cazul in care nota este peste 40
                if ((note % 10) % 5 == 0)      //daca ultima cifra din nota este multiplu de 5, adica 0 sau 5
                    abgerundete_noten.add(note);
                if ((note % 10) < 3) {       //daca ultima cifra este 1 sau 2
                    note = note - (note % 10);
                    abgerundete_noten.add(note);
                } else {
                    if ((note % 10) >= 3 && (note % 10) < 5) {      //daca ultima cifra este 3 sau 4
                        note = note + (5 - (note % 10));
                        abgerundete_noten.add(note);
                    }
                }
                if ((note % 10) < 8 && (note % 10) > 5) {     //daca ultima cifra este 6 sau 7
                    note = note - ((note % 10) - 5);
                    abgerundete_noten.add(note);
                } else {
                    if ((note % 10) >= 8) {     //daca ultima cifra este 8 sau 9
                        note = note + (10 - (note % 10));
                        abgerundete_noten.add(note);
                    }
                }
            }
        }
        return abgerundete_noten;

    }

    /*
    die Methode rechnet die maximale abgerundete Note;
    Input: ein array von Noten;
    Output: die maximale abgerundete Note;
     */
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
