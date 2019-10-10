/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulg10115557latihan28gantikata;

import java.util.Scanner;

/**
 *
 * @author 10115557 / rayan / PBO Ulg / pertemuan 2 / latihan 28
 */
public class PBOULG10115557Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kalimat,kalimat1,kalimat2;
        
        System.out.println("====Program Mengganti====");
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nMasukkan Kalimat : ");
        kalimat = scanner.nextLine();
        System.out.print("Ganti Kata : ");
        kalimat1 = scanner.nextLine();
        System.out.print("Menjadi Kata : ");
        kalimat2 = scanner.nextLine();
        
        System.out.println("====Hasil Formatting====");
        System.out.println("Kalimat Awal : " + kalimat);
        System.out.println("Kalimat Awal : " + kalimat.replace(kalimat1,kalimat2));
    } 
}
