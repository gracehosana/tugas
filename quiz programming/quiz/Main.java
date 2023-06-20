package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import quiz.menu_makanan.Mie;
import quiz.menu_makanan.Soto;
import quiz.menu_minuman.Dingin;



public class Main {
    private static ArrayList<Makanan> daftarMenuMakanan = new ArrayList<>();
    private static ArrayList<Minuman> daftarMenuMinuman = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Hello!");

        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu Utama");
            System.out.println("Pilih!");
            System.out.println("0. Tambah Menu");
            System.out.println("1. Lihat Menu");
            System.out.print("Pilih: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 0:
                    tambahMenu();
                    break;
                case 1:
                    lihatMenu();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != -1);
    }

    private static void tambahMenu() {
        Scanner scanner = new Scanner(System.in);
        int jenisMenu;

        System.out.println("\nTambah Menu");
        System.out.println("0. Tambah Makanan");
        System.out.println("1. Tambah Minuman");
        System.out.print("Pilih: ");
        jenisMenu = scanner.nextInt();

        switch (jenisMenu) {
            case 0:
                tambahMakanan();
                break;
            case 1:
                tambahMinuman();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }

    private static void tambahMakanan() {
        Scanner scanner = new Scanner(System.in);
        int jenisMakanan;

        System.out.println("\nTambah Makanan");
        System.out.println("0. Soto");
        System.out.println("1. Mie");
        System.out.print("Pilih: ");
        jenisMakanan = scanner.nextInt();
        scanner.nextLine(); // Membersihkan newline character

        String namaMakanan, hargaMakanan;
        System.out.print("Masukkan nama makanan: ");
        namaMakanan = scanner.nextLine();
        System.out.print("Masukkan harga makanan: ");
        hargaMakanan = scanner.nextLine();

        switch (jenisMakanan) {
            case 0:
                daftarMenuMakanan.add(new Soto(namaMakanan, hargaMakanan));
                System.out.println("Soto berhasil ditambahkan!");
                break;
            case 1:
                daftarMenuMakanan.add(new Mie(namaMakanan, hargaMakanan));
                System.out.println("Mie berhasil ditambahkan!");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }

    private static void tambahMinuman() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nTambah Minuman");
        String namaMinuman, hargaMinuman;
        System.out.print("Masukkan nama minuman: ");
        namaMinuman = scanner.nextLine();
        System.out.print("Masukkan harga minuman: ");
        hargaMinuman = scanner.nextLine();

        daftarMenuMinuman.add(new Dingin(namaMinuman, hargaMinuman));
        System.out.println("Minuman dingin berhasil ditambahkan!");
    }

    private static void lihatMenu() {
        Scanner scanner = new Scanner(System.in);
        int mode;

        System.out.println("\nLihat Menu");
        System.out.println("0. Ascending");
        System.out.println("1. Descending");
        System.out.print("Pilih: ");
        mode = scanner.nextInt();

        if (mode == 0) {
            Collections.sort(daftarMenuMakanan, Comparator.comparing(Makanan::getNama));
            Collections.sort(daftarMenuMinuman, Comparator.comparing(Minuman::getNama));
        } else if (mode == 1) {
            Collections.sort(daftarMenuMakanan, Comparator.comparing(Makanan::getNama).reversed());
            Collections.sort(daftarMenuMinuman, Comparator.comparing(Minuman::getNama).reversed());
        } else {
            System.out.println("Pilihan tidak valid.");
            return;
        }

        System.out.println("\nDaftar Menu Makanan:");
        for (Makanan makanan : daftarMenuMakanan) {
            System.out.println(makanan.getNama() + " - " + makanan.getHarga());
        }

        System.out.println("\nDaftar Menu Minuman:");
        for (Minuman minuman : daftarMenuMinuman) {
            System.out.println(minuman.getNama() + " - " + minuman.getHarga());
        }
    }
}
