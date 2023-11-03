import java.util.Scanner;
import java.util.Arrays;

public class Praktikum10v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] buku = new String[10][5]; //  [10][5]
        
        buku[0][0] = "buku-1";
        buku[1][0] = "buku-2";
        buku[2][0] = "buku-3";

        buku[0][1] = "Harry Potter volume 1"; // title
        buku[1][1] = "Harry Potter volume 2";
        buku[2][1] = "Harry Potter volume 3";

        buku[0][2] = "J.K. Rowling"; // author
        buku[1][2] = "J.K. Rowling";
        buku[2][2] = "J.K. Rowling";

        buku[0][3] = "Gramedia";
        buku[1][3] = "Gramedia";
        buku[2][3] = "Gramedia";

        buku[0][4] = "300"; // String
        buku[1][4] = "320";
        buku[2][4] = "340";

        for (int i = 0; i < 3; i++) { // Changed the loop condition
            System.out.println("Book " + buku[i][0] + ":");
            System.out.println("Title\t\t: " + buku[i][1]);
            System.out.println("Author\t\t: " + buku[i][2]);
            System.out.println("Publisher\t: " + buku[i][3]);
            System.out.println("Page Count\t: " + buku[i][4]);
            System.out.println();
        }
    }
}