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
    int index;
    int jmlBarang;

    KeranjangBelanja(int jmlBarang) {
        this.jmlBarang = jmlBarang;
    }
    
    Barang listBrg[] = new Barang[10];
    
    void tambah(Barang b){
        if(index < listBrg.length){
            listBrg[index] = b;
            index++;
        }
        else{
            System.out.println("Data sudah penuh");
        }
    }
    
    void tampil(){
        System.out.println("Nama Barang\t\t"+"Qty\t\t"+"Harga\t\t"+"Total Harga\t\t");
        for (Barang b : listBrg) {
            b.tampil();
            //System.out.println("===============================");
        }
    }
}
