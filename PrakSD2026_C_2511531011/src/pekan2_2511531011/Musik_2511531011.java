package pekan2_2511531011;

public class Musik_2511531011 {
	String judulLagu_1011;
	String penyanyi_1011;
	String durasi_1011;
	
	//Konstruktor
	Musik_2511531011(String judulLagu, String penyanyi, String durasi) {
		this.judulLagu_1011 = judulLagu;
		this.penyanyi_1011 = penyanyi;
		this.durasi_1011 = durasi;
	}
	
	@Override
	public String toString () {
		return "Judul: " + judulLagu_1011 + ", Penyanyi: " + penyanyi_1011 + ", Durasi: " + durasi_1011;
	}
	
	//getter
	public String getJudul_1011() {
		return judulLagu_1011;
	}
	
	public String getPenyanyi_1011() {
		return penyanyi_1011;
	}
	
	public String getDurasi_1011() {
		return durasi_1011;
	}
	
	//Setter
	public void setJudul_1011(String judulLagu) {
		this.judulLagu_1011 = judulLagu;
	}
	
	public void setPenyanyi_1011(String penyanyi) {
		this.penyanyi_1011 = penyanyi;
	}
	
	public void setDurasi_1011(String durasi) {
		this.durasi_1011 = durasi;
	}
}
