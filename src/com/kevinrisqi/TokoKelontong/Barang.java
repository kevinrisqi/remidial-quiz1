/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kevinrisqi.TokoKelontong;

/**
 *
 * @author Anonymous
 */
public class Barang {
    String namaBarang;
    int qty;
    int harga;
    int total;

    public Barang(String namaBarang, int qty, int harga) {
        this.namaBarang = namaBarang;
        this.qty = qty;
        this.harga = harga;
    }
    
    public int hitungHargaTotal(){
        return total = qty*harga;
    }
    
    public void tampil(){
        System.out.println("|"+namaBarang+"\t\t\t|"+qty+"\t\t|"+harga+"\t\t|"+hitungHargaTotal()+"\t\t\t|");
    }
    
    
}
