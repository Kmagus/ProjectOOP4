package oop4;

import java.util.Scanner;

/**
 *
 * @author AGUS PRAMANA
 */
public class BukuTeman {
    private int brs = 10;
    private int klm = 3;
    private int raktif = 0;
    private String[][] BT = new String[brs][klm];
    
    Scanner dtIN = new Scanner(System.in);
    
    public void Storedata(){
        int idx=0;
        raktif++;
        if(raktif > brs){
            System.out.println("Data Sudah Penuh");
            return;
        }
        if(raktif>0){
            idx=raktif-1;
        }
        System.out.print("Menambahkan Data Teman");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Nama Teman: ");
        BT[idx][0] = dtIN.nextLine(); 
        
        System.out.print("Alamat: ");
        BT[idx][1] = dtIN.nextLine();
        
        System.out.print("No Telpone: ");
        BT[idx][2] = dtIN.nextLine();

        viewdata(); 
    }
    
    public void Update(int idx){
        if(idx >= 0 && idx < raktif){
            System.out.print("Update Data Teman");
            System.out.println("~~~~~~~~~~~~~~~~~");
            System.out.print("Nama Teman: ");
            BT[idx][0] = dtIN.nextLine(); 
        
            System.out.print("Alamat: ");
            BT[idx][1] = dtIN.nextLine();
        
            System.out.print("No Telpone: ");
            BT[idx][2] = dtIN.nextLine();

            viewdata(); 
        } else {
            System.out.println("Indeks tidak valid");
        }
    }
    
    public void Destroy(int idx){
        if(idx >= 0 && idx < raktif){
            for(int i = idx; i < raktif - 1; i++){
                BT[i][0] = BT[i+1][0];
                BT[i][1] = BT[i+1][1];
                BT[i][2] = BT[i+1][2];
            }
            raktif--;
            System.out.println("Data berhasil dihapus");
        } else {
            System.out.println("Indeks tidak valid");
        }
    }
    
    public void viewdata(){
        int posbrs= 0;
        System.out.println("Daftar Teman");
        System.out.println("~~~~~~~~~~~");
        for(int i=0; i<raktif; i++ ){
            posbrs++;
            System.out.println(posbrs + ". " + BT[i][0] + " " + BT[i][1] + " " + BT[i][2]);
            System.out.println("record number " + i);
            System.out.println("Nama        :  " +BT[i][0]);
            System.out.println("Alamat      :  " +BT[i][1]);
            System.out.println("NO Telpone  :  " +BT[i][2]);
        }
    } 
}
