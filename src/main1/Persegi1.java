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
public class Persegi1 {
    void hitung(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Panjang sisi = ");
        int s = input.nextInt();
        
        int luas = s * s;
        System.out.println("Luas Persegi = "+luas);
    }
}
