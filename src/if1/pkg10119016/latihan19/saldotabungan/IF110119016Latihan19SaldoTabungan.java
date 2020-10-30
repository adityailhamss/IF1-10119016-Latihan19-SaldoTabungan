/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119016.latihan19.saldotabungan;

import java.util.Scanner;


/**
 *
 * @author aditi
 * NAMA              : Aditya Ilham Subagja
 * KELAS             : IF1
 * NIM               : 10119016
 * Deskripsi Program : Program ini berisi program untuk menampilkan cara 
 * melakukan penghitungan saldo
 */
public class IF110119016Latihan19SaldoTabungan {
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
  double saldo_awal = 2500000;
        for (double i = 1; i <= 6; i++) {
            saldo_awal += Math.floor(saldo_awal * 0.15);
            System.out.printf("Saldo di bulan ke-%1$.0f Rp. %2$,.0f%n",i,saldo_awal);
        }
    }
}
