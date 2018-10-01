/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117096.latihan25.ejaannama;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA         : Miftah Muhammad Sidqi
 * NIM          : 10117096
 * KELAS        : PBO3
 * DESKRIPSI    : Program ini berisi program untuk mengeja nama atau kata
 */
public class PBO310117096Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //        deklarasi variabel
        String nama;
        int panjang; // variabel untuk menampung jumlah huruf 
        char huruf; //menampung satu karakter
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Masukkan nama depan Anda untuk dieja : ");
        nama = scn.next();
        panjang = nama.length(); //jumlah huruf akan digunakan dalam looping
        
        System.out.println("\nEjaan untuk "+" \""+nama+"\" adalah : ");
        /*
        * Jangan gunakan i <= panjang, karena akan 'string index out of range'
        */
//        proses looping per huruf
        for (int i = 0; i < panjang; i++) {
            System.out.println("Huruf ke-"+(i+1)+" : "+nama.charAt(i));
        }
    }
    
}
