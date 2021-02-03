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
public class Lingkaran1 {
    void hitung(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nilai Jari-Jari = ");
        int jari = input.nextInt();
        
        System.out.println("Nilai phi = 22/7");
        
        int luas = jari * jari * 22 / 7;
        System.out.println("Luas Lingkaran = "+luas);
    }
}
