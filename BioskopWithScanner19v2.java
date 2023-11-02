import java.util.Scanner;
public class BioskopWithScanner19v2 {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int baris, kolom, pilihan;
    String nama, next;
    String[][] penonton = new String[5][2];
    boolean tersedia = false;

    penonton[0][0] = "Amin";
    penonton[0][1] = "Bena";
    penonton[1][0] = "Candra";
    penonton[1][1] = "Dela";
    penonton[2][0] = "Eka";
    penonton[2][1] = "Farhan";
    penonton[3][0] = "Gisel";
    penonton[3][1] = "Hana";
        
    while (true) {
    System.out.println("DaftarMenu");
    System.out.println("1. Masukkan data penonton");
    System.out.println("2. Tampilkan daftar penonton");
    System.out.println("3. Exit");
    
    System.out.print("pilih menu yang diinginkan: ");
    pilihan = sc.nextInt();

    switch (pilihan) {
        case 1:
        for(int i = 0; i < penonton.length; i++){
        for(int j = 0; j < penonton[i].length; j++){
        if(penonton[i][j]=="***"){
        penonton[i][j] = null;
        }
        }
        }    
        while (true) {
            tersedia = false;
            for (int i = 0; i < penonton.length; i++) {
                for (int j = 0; j < penonton[i].length; j++) {
                    if (penonton[i][j] == null) {
                        tersedia = true;
                        break;
                    }
                }
            }
        if(tersedia){
        System.out.print("masukkan nama penonton: ");
        nama = sc.next();
        sc.nextLine();
        System.out.print("masukkan baris: ");
        baris = sc.nextInt();
        System.out.print("masukkan kolom: ");
        kolom = sc.nextInt();

        if(penonton[baris-1][kolom-1] != null){
            System.out.println("Baris "+(baris)+" kolom "+(kolom)+" tidak tersedia.");
            continue;
        }
            penonton[baris-1][kolom-1] = nama;
            System.out.println("Masukkan Nama Penonton Lainnya? (y/n): ");
            next=sc.next();

            if (next.equalsIgnoreCase("y")) {
                continue;
            }else if(next.equalsIgnoreCase("n")) {
                break;
            }
        }else{
            System.out.println("penonton sudah penuh");
            break;
        }
            break;            
        }
        break;

        case 2:
        for(int i= 0; i<penonton.length; i++){
            for(int j=0; j<penonton[i].length; j++){
            if(penonton[i][j]==null){
                penonton[i][j]= "***";
            }
        }
            System.out.println("Penonton baris ke-"+(i+1)+": "+String.join(", ",penonton[i]));
        }
        System.out.print("Tekan 0 untuk kembali: ");
        int kbl=sc.nextInt();
        if(kbl==0) break;
        break;

        case 3:
        System.exit(0);
        }    
    }    
}
}
