package pekan7_2511531011;

public class MahasiswaADT_2511531011 {
	String nama_1011;
	String nim_1011;
	String prodi_1011;
	
	public MahasiswaADT_2511531011 (String nama_1011, String nim_1011, String prodi_1011) {
		this.nama_1011 = nama_1011;
		this.nim_1011 = nim_1011;
		this.prodi_1011 = prodi_1011;
	}
	
	//method getter
		public String getNama_1011() { return nama_1011; } 
		public String getNim_1011() { return nim_1011; } 
		public String getProdi_1011() { return prodi_1011; }
			
	//method setter
		public void setNama_1011(String nama_1011) { this.nama_1011 = nama_1011; }
		public void setNim_1011(String nim_1011) { this.nim_1011 = nim_1011; } 
		public void setProdi_1011(String prodi_1011) { this.prodi_1011 = prodi_1011; }
		
	//untuk cetak data mahasiswa
		@Override
		public String toString () {
			return nama_1011;
		}
		
	//compare untuk mempermudah sorting
		public int compareTo(MahasiswaADT_2511531011 mhs_1011) {
			return this.nama_1011.compareToIgnoreCase(mhs_1011.nama_1011);
		}

	public static void main(String[] args) {
		
		
	}
}
