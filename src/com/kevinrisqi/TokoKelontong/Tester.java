/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kevinrisqi.TokoKelontong;
import java.util.Scanner;
/**
 *
 * @author Anonymous
 */
public class Tester {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        Scanner i = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah Barang : ");
        int jmlBarang = i.nextInt();
        System.out.println("=======================================");
        
        KeranjangBelanja kb = new KeranjangBelanja();
        
        for (int j = 0; j < jmlBarang; j++) {
            System.out.print("Masukkan Nama Barang : ");
            String nama = t.nextLine();
            System.out.print("Masukkan Jumlah Barang (Qty) : ");
            int qty = i.nextInt();
            System.out.print("Masukkan Harga Barang (Rp) : ");
            int harga = i.nextInt();
            System.out.println("------------------------------------");
            Barang b = new Barang(nama,qty,harga);
            kb.tambah(b);
        }
        kb.tampil();
    }
}
