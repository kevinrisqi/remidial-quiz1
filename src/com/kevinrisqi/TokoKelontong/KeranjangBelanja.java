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
    Barang listBrg[];
    int index;
    
    public KeranjangBelanja(){
        int jmlBarang = 1;
        this.listBrg = new Barang[jmlBarang];
    }
    
    void tambah(Barang b){
        if(index < listBrg.length){
            listBrg[index] = b;
            index++;
        }
        else{
            System.out.println("Data sudah penuh");
        }
    }
}
