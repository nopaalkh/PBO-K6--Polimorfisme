/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6.soal;

/**
 *
 * @author hp
 */
import java.util.ArrayList;

class KeranjangBelanja {
    private ArrayList<Produk> produkList;

    public KeranjangBelanja() {
        produkList = new ArrayList<>();
    }

    public void tambahProduk(Produk produk) {
        produkList.add(produk);
    }

    public double hitungTotalHargaSetelahDiskon() {
        double total = 0;
        for (Produk produk : produkList) {
            total += produk.getHarga() - produk.hitungDiskon();
        }
        return total;
    }

    public void tampilkanDetailProduk() {
        for (Produk produk : produkList) {
            System.out.println("Nama Produk: " + produk.getNama());
            System.out.println("Harga Asli: Rp" + produk.getHarga());
            System.out.println("Diskon: Rp" + produk.hitungDiskon());
            System.out.println("Harga Setelah Diskon: Rp" + (produk.getHarga() - produk.hitungDiskon()));
        }
    }
}

