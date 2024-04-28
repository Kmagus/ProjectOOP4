package oop4;

import java.util.Scanner;

public class ArrayDimensi {
    public void datateman() {
        String teman[] = {"Arya", "Linda", "Komang", "Bagus"};
        
        for (int i = 0; i < teman.length; i++) {
            System.out.println("Data ke-" + i + ": " + teman[i]);
        }
    }
    
    public void temandata() {
        String[] tm = new String[4];
        Scanner dtIN = new Scanner(System.in);
        
        for (int i=0; i < tm.length; i++) {
            System.out.print("Masukkan Nama Teman ke-" + (i+1) + ": ");
            tm[i] = dtIN.nextLine();
        }
        
        System.out.println("Nama Teman");
        for (int i=0; i < tm.length; i++) {
            System.out.println((i+1) + ": " + tm[i]);
        }
    }
}





