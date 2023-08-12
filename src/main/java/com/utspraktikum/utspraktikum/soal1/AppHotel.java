package com.utspraktikum.utspraktikum.soal1;

public class AppHotel {
    public static void main(String[] args) {
        var hotel = new Hotel(1234567890, "Ika Tania", "Jl. Kembaran", 101);

        hotel.infoTamu();
        hotel.waktuCheckin("2023-08-12 14:00");
        hotel.waktuCheckout("2023-08-14 12:00");
        hotel.pesananMakanan("Nasi Goreng, Ayam Goreng");
        hotel.infoPembayaran(150000);
    }
}
