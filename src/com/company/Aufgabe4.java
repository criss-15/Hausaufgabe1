package com.company;

import java.util.ArrayList;
import java.util.List;

public class Aufgabe4 {

    /* die Methode gibt die billigste Tastatur
    Input: ein array mit Tastatur Preise
    Output: die billigste Tastatur;
     */
    public static int Ubung1(List<Integer> preiseTastaturen) {
        int min = preiseTastaturen.get(0);
        for (int i : preiseTastaturen) {
            if (i < min)
                min = i;
        }
        return min;
    }


    /* die Methode gibtden teuersten Gegenstand;
    Input: zwei arrays mit Preise von Tastaturen und USB
    Output: teuersten Gegenstand;
     */
    public static int Ubung2(List<Integer> listeTastatur, List<Integer> listeUSB){
        int billigsteGegenstand = 0;
        int billigsteTastatur;
        int billigsteUSB;
        billigsteTastatur=Ubung1(listeTastatur);
        billigsteUSB=Ubung1(listeUSB);
        if(billigsteTastatur > billigsteUSB)
            return billigsteGegenstand = billigsteTastatur;
        else
            return billigsteGegenstand = billigsteUSB;
    }


    /* die Methode gibt den teuersten USB den die Person kaufen kann
    Input: array von Preise;
    Output: teuerste gekaufte USB
     */
    public static int Ubung3(List<Integer> preiseUSB, int buget){
       int gekaufte_produkte = 0;
       for(int i : preiseUSB) {
           if(i < buget && gekaufte_produkte < i)
               gekaufte_produkte = i;
       }
        return gekaufte_produkte;
    }

    /* die Methode rechnet die teuersten Gegenstande diegekauft werden konnen
    Input: zwei arrays von Preise und den budget
    Output: die gekaufte Produkte;
     */
    public static int gekaufteProdukte(List<Integer> preiseTastauren, List<Integer> preiseUSB, int buget){
        int maximal = -1;
        for(int i=0; i<preiseTastauren.size(); i++){
            for(int j=0; j<preiseTastauren.size(); j++) {
                if (preiseTastauren.get(i) + preiseUSB.get(j) > maximal && preiseTastauren.get(i) + preiseUSB.get(j) <= buget)
                    maximal = preiseTastauren.get(i) + preiseUSB.get(j);

            }
        }
        return maximal;

    }



}
