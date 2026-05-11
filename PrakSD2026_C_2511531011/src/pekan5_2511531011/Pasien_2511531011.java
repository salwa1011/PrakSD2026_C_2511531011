package pekan5_2511531011;

public class Pasien_2511531011 {
	//atribut pasien
	String namaPasien_1011;
	String keluhan_1011;
	int nomor_1011;
	
	Pasien_2511531011 next_1011;
	
	//konstruktor pasien
	Pasien_2511531011(String namaPasien_1011, String keluhan_1011, int nomor_1011) {
		this.namaPasien_1011 = namaPasien_1011;
		this.keluhan_1011 = keluhan_1011;
		this.nomor_1011 = nomor_1011;
		
		//pointer ke node berikutnya
		this.next_1011 = null;
	}
	
	//method getter
	public String getNama_2511531011() { return namaPasien_1011; } //get nama
	public String getKeluhan_2511531011() { return keluhan_1011; } //get keluhan
	public int getNomor_2511531011() { return nomor_1011; } //get nomor
	public Pasien_2511531011 getPointer_2511531011() { return next_1011; } //get pointer
	
	//method setter
	public void setNama_2511531011(String nama_1011) { this.namaPasien_1011 = nama_1011; } //set nama
	public void setKeluhan_2511531011(String keluhan_1011) { this.keluhan_1011 = keluhan_1011; } //set keluhan
	public void setNomor_2511531011(int nomor_1011) { this.nomor_1011 = nomor_1011; } //set nomor
	public void setPointer_2511531011(Pasien_2511531011 next_1011) { this.next_1011 = next_1011; } //set pointer
	
	//untuk cetak data pasien
	@Override
	public String toString () {
		return "Nama Pasien: " + namaPasien_1011 + ", Keluhan: " + keluhan_1011 + ", Nomor antrian: " + nomor_1011;
	}
}
