import java.util.Scanner;
public class BioskopWithScanner19 {
public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    int baris, kolom;
    String nama, next;

    String[][] penonton = new String[4][2];
    while (true) {
        System.out.print("masukkan nama penonton: ");
        nama = input.nextLine();
        System.out.print("masukkan baris: ");
        baris = input.nextInt();
        System.out.print("masukkan kolom: ");
        kolom = input.nextInt();
        input.nextLine();

        penonton[baris-1][kolom-1] = nama;

        System.out.println("apakah ada penonton lain? (y/n)");
        next = input.nextLine();
        if (next.equalsIgnoreCase("n")) {
            break;            
        }
        
    }
}    
}
