package oop4;

import java.util.Scanner;

public class MultiArray {
    String[][] BukuTeman;
    Scanner dtIN = new Scanner(System.in);
    
    public MultiArray(int rows, int cols) {
        BukuTeman = new String[rows][cols];
    }
    
    public void isidata() {
        System.out.println("Input Data Teman");
        System.out.println("~~~~~~~~~~~~~~~");
        for (int i = 0; i < BukuTeman.length; i++) {
            System.out.println("Data teman ke-" + (i + 1));
            System.out.print("Nama: ");
            BukuTeman[i][0] = dtIN.nextLine();
            System.out.print("Alamat: ");
            BukuTeman[i][1] = dtIN.nextLine();
            System.out.print("No. Telepon: ");
            BukuTeman[i][2] = dtIN.nextLine();
            System.out.println();
        }
    }
    
    public void lihatdata() {
        System.out.println("Data Teman");
        System.out.println("~~~~~~~~~~~");
        for (int i = 0; i < BukuTeman.length; i++) {
            System.out.println("Data teman ke-" + (i + 1));
            System.out.println("Nama: " + BukuTeman[i][0]);
            System.out.println("Alamat: " + BukuTeman[i][1]);
            System.out.println("No. Telepon: " + BukuTeman[i][2]);
            System.out.println();
        }
    }
    
    public void editdata(int idx) {
        if (idx >= 0 && idx < BukuTeman.length) {
            System.out.println("Edit Data Teman");
            System.out.println("~~~~~~~~~~~~~~~");
            System.out.print("Nama: ");
            BukuTeman[idx][0] = dtIN.nextLine();
            System.out.print("Alamat: ");
            BukuTeman[idx][1] = dtIN.nextLine();
            System.out.print("No. Telepon: ");
            BukuTeman[idx][2] = dtIN.nextLine();
            System.out.println("Data teman berhasil diubah.");
        } else {
            System.out.println("Indeks tidak valid.");
        }
    }
    
    public void hapusdata(int idx) {
        if (idx >= 0 && idx < BukuTeman.length) {
            for (int i = idx; i < BukuTeman.length - 1; i++) {
                BukuTeman[i] = BukuTeman[i + 1];
            }
            System.out.println("Data teman berhasil dihapus.");
        } else {
            System.out.println("Indeks tidak valid.");
        }
    }
}
