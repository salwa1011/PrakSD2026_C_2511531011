package pekan3_2511531011;

import java.util.ArrayList;

class Siswa_1011 {
	String nama_1011;
	int nim_1011;
	
	public Siswa_1011(String nama_1011, int nim_1011) {
		this.nama_1011 = nama_1011;
		this.nim_1011 = nim_1011;
	}
	
	@Override
	public String toString() {
		return "Nim: " + nim_1011 + ", Nama: " + nama_1011;
	}
}
	
public class SiswaStack_2511531011 {
	private ArrayList<Siswa_1011> stack_1011;
	
	public SiswaStack_2511531011() {
		stack_1011 = new ArrayList<>();
	}
	
	public void push_1011(Siswa_1011 mhs_1011) {
		stack_1011.add(mhs_1011);
	}
	
	public Siswa_1011 pop_1011() {
		if (!isEmpty_1011()) {
			return stack_1011.remove(stack_1011.size() - 1);
		} else {
			return null;
		}
	}
	
	public Siswa_1011 peek_1011() {
		if (!isEmpty_1011()) {
			return stack_1011.get(stack_1011.size() - 1);
		} else {
			return null;
		}
	}
	
	public boolean isEmpty_1011() {
		return stack_1011.isEmpty();
	}
	
	public void tampilkanSiswa_1011() {
		for (int i_1011 = stack_1011.size() - 1; i_1011 >= 0; i_1011--) {
			System.out.println(stack_1011.get(i_1011));
		}
	}
	
	public static void main(String[] agrs) {
		SiswaStack_2511531011 studentStack_1011 = new SiswaStack_2511531011();
		
		Siswa_1011 mhs1_1011 = new Siswa_1011("Ali", 1);
		Siswa_1011 mhs2_1011 = new Siswa_1011("Boby", 2);
		Siswa_1011 mhs3_1011 = new Siswa_1011("Charles", 3);
		
		studentStack_1011.push_1011(mhs1_1011);
		studentStack_1011.push_1011(mhs2_1011);
		studentStack_1011.push_1011(mhs3_1011);
		
		System.out.println("Siswa di dalam stack: ");
		studentStack_1011.tampilkanSiswa_1011();
		
		System.out.println("Siswa teratas " + studentStack_1011.peek_1011());
		System.out.println("mengeluarkan siswa teratas dari stack: " + studentStack_1011.pop_1011());
		System.out.println("Daftar siswa setelah di pop: ");
		studentStack_1011.tampilkanSiswa_1011();
	}
	
}
