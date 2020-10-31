/*
 *
 * @author
 * NAMA     :   Adam Firdaus D
 * KELAS    :   IF2
 * NIM      :   10119078
 * DESKRIPSI:   Berisi codingan untuk mengubah huruf menjadi huruf besar dan kecil
 *
 */
package pboif2.pkg10119078.latihan27.hurufbesarkecil;
import java.util.Scanner;

/**
 *
 * @author ryzen
 */
public class PBOIF210119078Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama;

        Scanner scanner = new Scanner (System.in);
        System.out.printf("Masukan Kalimat: ");
        nama = scanner.nextLine();
        System.out.println("");
        
        String str1 = nama.toUpperCase();
        String str2 = nama.toLowerCase();
        
        System.out.println("=======Hasil Formatting=======");
        System.out.println("Huruf Besar: " + str1);
        System.out.println("Huruf Kecil: " + str2);
        
        
    }
    
}
