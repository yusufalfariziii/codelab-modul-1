package org.example;

import java.util.Scanner;//  Import kelas Scanner dari paket java.util untuk menerima input dari pengguna

public class Main { // Deklarasi variabel students dengan tipe yang menyimpan NIM (String) sebagai kunci dan nama mahasiswa (String) sebagai nilai

    private static final Scanner scanner = new Scanner(System.in); //

    public static void main(String[] args) {
        while (true) { //disini saya menggunakan looping untuk membuat sebuah menu dari sistem login liberalri yang mana menu dari sistem liberaliri itu

            System.out.println("----- Sistem Login Library -----");
            System.out.println("1. Login sebagai Mahasiswa");
            System.out.println("2. Login sebagai Admin");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) { //switch ini kegunaannya untuk menampilkan pilihan atas yang mana ketika kita memilih login sebagai mahasiswa
                case 1:
                    loginMahasiswa();
                    break;
                case 2:
                    loginAdmin();
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan sistem!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    private static void loginMahasiswa() { //kita disuruh memasukan nim
        System.out.print("Masukkan NIM: ");
        String nim = scanner.next();

        if (nim.length() != 15) { // ketika sebuat user memasukan nim kurang dari 15 makan akan muncul
            System.out.println("Panjang NIM harus 15 karakter!");
            return;  // Jika NIM ditemukan dalam daftar mahasiswa dan memiliki panjang 15 karakter, cetak pesan berhasil
        }

        System.out.println("Login sebagai mahasiswa dengan NIM " + nim + " berhasil!");
    }

    private static void loginAdmin() {  // Jika username dan password yang dimasukkan sesuai dengan adminUsername dan adminPassword, cetak pesan berhasil
        System.out.print("Masukkan Username: ");
        String username = scanner.next();
        System.out.print("Masukkan Password: ");
        String password = scanner.next(); // Menerima input dari pengguna berupa nomor opsi dalam bentuk String

        if (username.equals("admin") && password.equals("admin")) {
            System.out.println("Login sebagai admin berhasil!");  // Jika, cetak pesan bahwa pengguna admin ditemukan

        } else {
            System.out.println("Username atau password salah!");  // Jika, cetak pesan bahwa pengguna admin tidak ditemukan
        }
    }
}