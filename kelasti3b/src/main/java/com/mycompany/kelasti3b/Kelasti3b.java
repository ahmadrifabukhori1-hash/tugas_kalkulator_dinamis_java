/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kelasti3b;

/**
 *
 * @author Yahahaha
 */
public class Kelasti3b {

    public static void main(String[] args) {
        int hasil = penjumlahan(50,49);
        
        int hkurang = pengurangan(1, 50);
        int hkali = kali(2,2);
        int hbagi = pembagian(9,2);
        int hmodulus = modulus(10,3);
        
        System.out.println("hasil penjumlahan = " + hasil);
        System.out.println("hasil pengurangan = " +hkurang);
        System.out.println("hasil perkalian = " +hkali);
        System.out.println("hasil pembagian = " +hbagi);
        System.out.println("sisa bagi = " +hmodulus);
        System.out.println("hasil pengurangan tetapi nilainya langsung = "+pengurangan(40,41));
        
       
        }
    
    public static int penjumlahan (int angka1, int angka2) {
    return angka1+angka2;
}
    
    public static int pengurangan (int angka1, int angka2){
    return angka1-angka2;
    
    }
    public static int pembagian (int angka1, int angka2){
    return angka1/angka2;
    
    }
    public static int kali (int angka1, int angka2){
    return angka1*angka2;
    
    }
    public static int modulus ( int angka1, int angka2) {
       return angka1%angka2;
    }
}
