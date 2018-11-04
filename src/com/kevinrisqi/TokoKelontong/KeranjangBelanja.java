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
    private int jmlBarang;
    private int index;


    KeranjangBelanja(int jmlBarang) {
        this.listBrg = new Barang[jmlBarang];
    }

    Barang listBrg[];
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
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("|Nama Barang\t\t|"+"Qty\t\t|"+"Harga\t\t|"+"Total Harga\t\t|");
        System.out.println("--------------------------------------------------------------------------------");
        for (Barang b : listBrg) {
            b.tampil();
            //b.totalBelanja();
        }
        //Barang c = new Barang();
        //c.totalBelanja();
        System.out.println("--------------------------------------------------------------------------------");
    }
}
