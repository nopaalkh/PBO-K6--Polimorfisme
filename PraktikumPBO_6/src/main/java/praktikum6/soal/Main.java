/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6.soal;

/**
 *
 * @author hp
 */
public class Main {
    public static void main(String[] args) {
        // Buat objek dari kelas turunan Produk
        Buku buku = new Buku("Cerita Ramayana", 100000);
        Elektronik elektronik = new Elektronik("Headset", 200000);
        Pakaian pakaian = new Pakaian("Flanel", 250000);

        // Buat keranjang belanja
        KeranjangBelanja keranjang = new KeranjangBelanja();
        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(elektronik);
        keranjang.tambahProduk(pakaian);

        // Tampilkan detail produk dan total harga
        keranjang.tampilkanDetailProduk();
        System.out.println("Total Harga Setelah Diskon: Rp" + keranjang.hitungTotalHargaSetelahDiskon());
    }
}
