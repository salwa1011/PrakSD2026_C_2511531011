package pekan6_2511531011;

public class Lagu_2511531011 {
	//mendefinisikan class node
		String judul_1011;
		String penyanyi_1011;
		Lagu_2511531011 next_1011;
		Lagu_2511531011 prev_1011;
		
		//konstruktor
		public Lagu_2511531011 (String judul_1011, String penyanyi_1011) {
			this.judul_1011 = judul_1011;
			this.penyanyi_1011 = penyanyi_1011;
			this.next_1011 = null;
			this.prev_1011 = null;	
		}
		
		//method getter
		public String getJudul_1011() { return judul_1011; } //get judul
		public String getPenyanyi_1011() { return penyanyi_1011; } //get penyanyi
		public Lagu_2511531011 getPointer_1011() { return next_1011; } //get pointer
		
		//method setter
		public void setJudul_1011(String judul_1011) { this.judul_1011 = judul_1011; } //set judul
		public void setPenyanyi_1011(String penyanyi_1011) { this.penyanyi_1011 = penyanyi_1011; } //set penyanyi
		public void setPointer_1011(Lagu_2511531011 next_1011) { this.next_1011 = next_1011; } //set pointer
		
		//untuk cetak data lagu
		@Override
		public String toString () {
			return "Judul Lagu: " + judul_1011 + ", Penyanyi: " + penyanyi_1011;
		}

}
