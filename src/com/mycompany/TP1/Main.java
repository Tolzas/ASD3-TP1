package com.mycompany.TP1;

import java.util.Scanner;

public class Main {

    public static void main(String... args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Combien voulez-vous de case dans votre tableau : ");
        int caseTab = scan.nextInt();
        System.out.println("Vous avez choisie de crer un tableau à " + caseTab + " case.");

        int [] S  = new int [caseTab];

        for(int i = 0 ;i<caseTab;i++){
            System.out.println("Veuillez rentrer la valeur que vous vouler rentrer à la place " + (i+1) + " dans votre tab de int :");
            int value = scan.nextInt();
            S[i] = value;
            System.out.println(S[i]);
        }
    }
}
