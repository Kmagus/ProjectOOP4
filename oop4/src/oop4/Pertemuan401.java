package oop4;

/**
 *
 * @author AGUS PRAMANA
 */
public class Pertemuan401 {
    public static void main(String[] args) {
        BukuTeman BTeman = new BukuTeman ();
        String ul = "YA";
        do{
            System.out.println("A. View Data");
            System.out.println("B. Add Data");
            System.out.println("C. Edit Data");
            System.out.println("D. Delete Data");
            System.out.println("E. Exit");
            System.out.print("Choose Option (A/B/C/D/E): ");
            String mPIL = BTeman.dtIN.nextLine();
            switch (mPIL) {
            case "A":
                BTeman.viewdata();
                break;
            case "B":
                BTeman.Storedata();
                break;
            case "C":
                BTeman.Update(0);
                break;
            case "D":
                BTeman.Destroy(0);
                break;
            case "E":
                ul = "tidak";
                break;
            default:
                System.out.println("Type A/B/C/D/E");
                break;
            }
            
        }while(ul.equals("YA"));
    }
}
