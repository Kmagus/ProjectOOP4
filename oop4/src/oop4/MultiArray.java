package oop4;

import java.util.Scanner;

/**
 *
 * @author AGUS PRAMANA
 */
public class MultiArray {
    int jdata = 4;
    String bukuteman[][] new String[][4];
    
    Scanner dtIN = new Scanner(System.in);
    public void isidata (){
    
    }
    public void lihatdata() {
        System.out.println("Data Teman");
        System.out.println("~~~~~~~~~~~");
        int no = 0;
        for(int i=0; i<bukuteman.length; i++) {
            no++;
            System.out.print(no+". ");
            for (int j=0; j<bukuteman[i].length; j++){
                System.out.println(no+". "+bukuteman[i][j]+" ");
            }  
            System.out.println("");
        }
    }
    public void editdata() {
    }
    public void hapusdata(int idx){
    }
}
