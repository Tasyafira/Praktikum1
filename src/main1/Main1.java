/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main1;

import java.util.Scanner;

/**
 *
 * @author MOKLET-1
 */
public class Main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("          Program Luas Bangun Datar          ");
        System.out.println("\n");
        
        boolean ulangi = true;
        while (ulangi){
            
        String[] produk = {" ", " Luas Lingkaran    ", " Luas Persegi            "};
        for (int i = 1; i < produk.length; i++)
            System.out.println("Kode "+i+produk[i]);
        System.out.print("Masukkan kode : ");
        int kode = input.nextInt();
        System.out.println("\n");
        switch(kode){
            case 1 :
                System.out.println("Menghitung Luas Lingkaran");
                Lingkaran1 hai = new Lingkaran1();
                hai.hitung();
                break;
            case 2 :
                System.out.println("Menghitung Luas Persegi");
                Persegi1 halo = new Persegi1();
                halo.hitung();
                break;
            default:
                System.out.println("Maaf, Kode Yang Anda Masukkan Tidak Tersedia");
                System.out.println("\n");
                break;
        }
        System.out.println("Apakah anda ingin menghitung lagi ? (ya/tidak)");
            String pilih = input.next();
            ulangi = pilih.equals("ya");
            System.out.println("---------------------------------------------");
        }
    }
    
}
