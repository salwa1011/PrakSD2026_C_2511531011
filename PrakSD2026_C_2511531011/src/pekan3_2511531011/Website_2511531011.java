package pekan3_2511531011;

public class Website_2511531011 {
	String judul_1011;
	String URL_1011;
	
	//Konstruktor
	Website_2511531011(String judul, String URL) {
		this.judul_1011 = judul;
		this.URL_1011 = URL;
	}
	
	@Override
	public String toString () {
		return "Judul: " + judul_1011 + ", URL: " + URL_1011;
	}
	
	//getter
	public String getJudul_1011() {
		return judul_1011;
	}
	
	public String getURL_1011() {
		return URL_1011;
	}
	
	
	//Setter
	public void setJudul_1011(String judul) {
		this.judul_1011 = judul;
	}
	
	public void setURL_1011(String URL) {
		this.URL_1011 = URL;
	}
}
