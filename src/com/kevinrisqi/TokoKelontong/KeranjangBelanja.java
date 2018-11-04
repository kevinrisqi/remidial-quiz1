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
public class KeranjangBelanja {
    Barang listBrg[] = new Barang[2];
    int index;
    
    void tambah(Barang b){
        if(index < listBrg.length){
            listBrg[index] = b;
            index++;
        }
        else{
            System.out.print("Data sudah penuh");
        }
    }
    void tampil(){
        System.out.println("Nama Barang\t\t"+"Qty\t\t"+"Harga\t\t"+"Total Harga\t\t");
        for (Barang b : listBrg) {
            b.tampil();
        }
    }
}
