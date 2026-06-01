package pekan8_2511531011;

public class dataLagu_2511531011 {
			//mendefinisikan class node
			String judul_1011;
			String penyanyi_1011;
			int durasi_1011;
			
			//konstruktor
			public dataLagu_2511531011 (String judul_1011, String penyanyi_1011, int durasi_1011) {
				this.judul_1011 = judul_1011;
				this.penyanyi_1011 = penyanyi_1011;
				this.durasi_1011 = durasi_1011;
			}
			
			//method getter
			public String getJudul_1011() { return judul_1011; } //get judul
			public String getPenyanyi_1011() { return penyanyi_1011; } //get penyanyi
			public int getdurasi_1011() { return durasi_1011; } //get durasi
						
			//method setter
			public void setJudul_1011(String judul_1011) { this.judul_1011 = judul_1011; } //set judul
			public void setPenyanyi_1011(String penyanyi_1011) { this.penyanyi_1011 = penyanyi_1011; } //set penyanyi
			public void setDurasi_1011(int durasi_1011) { this.durasi_1011 = durasi_1011; } //set durasi
			
			//untuk cetak data lagu
			@Override
			public String toString () {
				return "Judul Lagu: " + judul_1011 + " - " + penyanyi_1011 + " Durasi: " + durasi_1011;
			}

}
