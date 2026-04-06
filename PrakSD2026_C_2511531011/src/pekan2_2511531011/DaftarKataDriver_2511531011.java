package pekan2_2511531011;

public class DaftarKataDriver_2511531011 {

	public static void main(String[] args) {
		DaftarKata_2511531011 al = new DaftarKata_2511531011();
		
		// Menambah elemen
		al.tambah_2511531011("Kami");
		al.tambah_2511531011("Informatika");
		
		// Menyisipkan elemen pada index 1
		al.tambahPada_2511531011(1, "Mahasiswa");
		
		// Cetak isi awal
		System.out.println("Awal	: " + al);
		
		// Mengubah elemen (index 1)
		al.ubahElemen_2511531011(1, "Departemen");
		System.out.println("Setelah ubah: " + al);
		
		// Menghapus elemen (hapus index 0)
		String terhapus = al.hapusElemen_2511531011(0);
		System.out.println("Terhapus	: " + terhapus);
		System.out.println("Setelah Hapus	: " + al);
		
		// Iterasi pada ArrayList (cetak setiap elemen)
		System.out.println("Iterasi:");
		al.iterasiCetak_2511531011();
		System.out.println();

	}

}
