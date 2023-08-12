package com.utspraktikum.utspraktikum.soal1;

public class Hotel {
    int noKtp;
    String nama;
    String alamat;
    int noKamar;

    public Hotel(int noKtp, String nama, String alamat, int noKamar) {
        this.noKtp = noKtp;
        this.nama = nama;
        this.alamat = alamat;
        this.noKamar = noKamar;
    }

    public void infoTamu() {
        System.out.println("-- Informasi Tamu --");
        System.out.println("No KTP: " + noKtp);
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("No Kamar: " + noKamar);
    }

    public void waktuCheckin(String waktu) {
        System.out.println("Waktu Check-in: " + waktu);
    }

    public void waktuCheckout(String waktu) {
        System.out.println("Waktu Check-out: " + waktu);
    }

    public void infoPembayaran(double jumlah) {
        System.out.println("\n-- Informasi Pembayaran --");
        System.out.println("Total Pembayaran: " + jumlah);
    }

    public void pesananMakanan(String pesanan) {
        System.out.println("Pesanan Makanan: " + pesanan);
    }
}
