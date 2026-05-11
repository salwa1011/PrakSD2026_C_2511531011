package pekan5_2511531011;

import java.util.Scanner;

public class RumahSakit_2511531011 {

    //membuat head linked list
    private Pasien_2511531011 head_1011;

    //menyimpan antrian terakhir
    private int last_1011;

    //menghitung jumlah
    private int jmlPasien_1011;

    //konstruktor rs
    public RumahSakit_2511531011() {
        head_1011 = null;
        last_1011 = 0;
        jmlPasien_1011 = 0;
    }

    // insert di tail / tambah pasien di akhir linked list
    public void daftarkan_2511531011(String namaPasien_1011, String keluhan_1011) {
        //nomor antrian bertambah
        last_1011++;
        // membuat node pasien baru
        Pasien_2511531011 baru = new Pasien_2511531011(namaPasien_1011, keluhan_1011, last_1011);
        // jika linked list kosong
        if (head_1011 == null) {
            // pasien baru jadi head
            head_1011 = baru;
        } else {
            // traversal sampai node terakhir
            Pasien_2511531011 curr_1011 = head_1011;
            while (curr_1011.getPointer_2511531011() != null) {
                curr_1011 = curr_1011.getPointer_2511531011();
            }
            // sambungkan node terakhir ke node baru
            curr_1011.setPointer_2511531011(baru);
        }

        jmlPasien_1011++;
        System.out.println("Pasien berhasil didaftarkan!");
        System.out.println("Nomor Antrian : " + last_1011);
    }

    // delete head / panggil pasien terdepan
    public void panggil_2511531011() {
        // cek apakah antrian kosong
        if (head_1011 == null) {
            System.out.println("Antrian kosong.");
            return;
        }

        // menyimpan pasien yang dipanggil
        Pasien_2511531011 dipanggil_1011 = head_1011;
        // head digeser ke node berikutnya
        head_1011 = head_1011.getPointer_2511531011();
        jmlPasien_1011--;
        System.out.println("Pasien yang dipanggil:");
        System.out.println(dipanggil_1011);
    }

    // menampilkan semua antrian pasien
    public void tampilkanAntrian_1011() {
        // cek apakah list kosong
        if (head_1011 == null) {
            System.out.println("Antrian masih kosong.");
            return;
        }

        Pasien_2511531011 curr_1011 = head_1011;

        int posisi_1011 = 1;

        System.out.println("Daftar Antrian Pasien:");

        // traversal linked list
        while (curr_1011 != null) {

            System.out.println("Posisi " + posisi_1011 + " -> " + curr_1011);
            curr_1011 = curr_1011.getPointer_2511531011();
            posisi_1011++;
        }
    }
    // mencari pasien berdasarkan nama
    public void cariPasien_1011(String namaCari_1011) {

        // cek apakah list kosong
        if (head_1011 == null) {

            System.out.println("Antrian kosong.");
            return;
        }

        Pasien_2511531011 curr_1011 = head_1011;
        int posisi_1011 = 1;
        boolean ditemukan_1011 = false;
        // traversal untuk pencarian data
        while (curr_1011 != null) {

            // pencarian tanpa membedakan huruf besar kecil
            if (curr_1011.getNama_2511531011().equalsIgnoreCase(namaCari_1011)) {
                System.out.println("Pasien ditemukan pada posisi " + posisi_1011);
                System.out.println(curr_1011);
                ditemukan_1011 = true;
                break;
            }
            curr_1011 = curr_1011.getPointer_2511531011();
            posisi_1011++;
        }
        // jika data tidak ditemukan
        if (!ditemukan_1011) {
            System.out.println("Pasien dengan nama " + namaCari_1011 + " tidak ditemukan.");
        }
    }

    // cek status antrian
    public void cekStatusAntrian_1011() {
        // jika antrian kosong
        if (head_1011 == null) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Jumlah pasien : " + jmlPasien_1011);
            System.out.println("Pasien terdepan : " + head_1011);
        }
    }

    // method untuk menampilkan menu
    public static void tampilkanMenu_1011() {
        System.out.println("\n=== Antrian Rumah Sakit 2511531013 ===");
        System.out.println("1. Daftarkan Pasien");
        System.out.println("2. Panggil Pasien");
        System.out.println("3. Tampilkan Antrian");
        System.out.println("4. Cari Pasien");
        System.out.println("5. Cek Status Antrian");
        System.out.println("6. Keluar");
        System.out.print("Pilihan : ");
    }
    public static void main(String[] args) {
        Scanner input_1011 = new Scanner(System.in);
        RumahSakit_2511531011 rs_1011 = new RumahSakit_2511531011();
        int pilihan_1011;
        do {
            tampilkanMenu_1011();
            pilihan_1011 = input_1011.nextInt();
            input_1011.nextLine();
            switch (pilihan_1011) {
                case 1:
                    System.out.print("Masukkan Nama Pasien : ");
                    String namaPasien_1011 = input_1011.nextLine();
                    System.out.print("Masukkan Keluhan : ");
                    String keluhan_1011 = input_1011.nextLine();
                    rs_1011.daftarkan_2511531011(namaPasien_1011, keluhan_1011);
                    break;
                case 2:
                    rs_1011.panggil_2511531011();
                    break;
                case 3:
                    rs_1011.tampilkanAntrian_1011();
                    break;
                case 4:
                    System.out.print("Masukkan nama pasien yang dicari : ");
                    String namaCari_1011 = input_1011.nextLine();
                    rs_1011.cariPasien_1011(namaCari_1011);
                    break;
                case 5:
                    rs_1011.cekStatusAntrian_1011();
                    break;
                case 6:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan_1011 != 6);
        input_1011.close();
    }
}