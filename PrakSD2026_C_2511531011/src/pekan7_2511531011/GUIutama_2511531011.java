package pekan7_2511531011;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.*;

public class GUIutama_2511531011 extends JFrame {

	private static final long serialVersionUID = 1L;
	private MahasiswaADT_2511531011[] array_1011;
	private JLabel[] labelArray_1011;
	private JButton stepButton_1011, resetButton_1011, setButton_1011;
	private JTextField inputField_1011;
	private JPanel panelArray_1011;
	private JTextArea stepArea_1011;
	private JComboBox<String> sortingPick_1011;
	
	private int i_1011 = 1, pass_1011 = 0;
	private boolean sorting_1011 = false;
	private int stepCount_1011 = 1;

	/**
	 * Create the frame.
	 */
	public GUIutama_2511531011() {
		setTitle("Sorting Mahasiswa");
		setSize(950, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		
		//panel input
		JPanel inputPanel_1011 = new JPanel(new FlowLayout());
		inputField_1011 = new JTextField(40);
		setButton_1011 = new JButton("Set Array");
		inputPanel_1011.add(new JLabel ("Masukkan data (Nama-NIM-Prodi): "));
		inputPanel_1011.add(inputField_1011);
		inputPanel_1011.add(setButton_1011);
		
		sortingPick_1011 = new JComboBox<>();
		sortingPick_1011.setModel(new DefaultComboBoxModel<>(new String[] {
				"Insertion Sort", "Selection Sort", "Bubble Sort"
		}));
		inputPanel_1011.add(new JLabel("Pilih Sorting: "));
		inputPanel_1011.add(sortingPick_1011);
		
		//panel array visual
		panelArray_1011 = new JPanel();
		panelArray_1011.setLayout(new FlowLayout());
		
		//panel kontrol
		JPanel controlPanel_1011 = new JPanel();
		stepButton_1011 = new JButton("Langkah selanjutnya");
		resetButton_1011 = new JButton("Reset");
		stepButton_1011.setEnabled(false);
		controlPanel_1011.add(stepButton_1011);
		controlPanel_1011.add(resetButton_1011);
		
		//Area text untuk log langkah-langkah
		stepArea_1011 = new JTextArea(30,60);
		stepArea_1011.setEditable(false);
		stepArea_1011.setFont(new Font("Monospaced", Font.PLAIN, 14));
		JScrollPane scrollPane_1011 = new JScrollPane(stepArea_1011);
		getContentPane().add(controlPanel_1011, BorderLayout.SOUTH);
		getContentPane().add(scrollPane_1011, BorderLayout.EAST);
		getContentPane().add(inputPanel_1011, BorderLayout.WEST);
	
		// tambahkan panel ke frame
		getContentPane().add(inputPanel_1011, BorderLayout.NORTH);
		getContentPane().add(panelArray_1011, BorderLayout.CENTER);
		
		
		// event set array
		setButton_1011.addActionListener(e -> setArrayFromInput_1011());
		
		// event langkah selanjutnya
		stepButton_1011.addActionListener(e -> {
			String pilihan_1011 = sortingPick_1011.getSelectedItem().toString();
			switch (pilihan_1011) {
			case "Insertion Sort":
				performInsertionStep_1011();
				break;
			case "Selection Sort":
				performSelectionStep_1011();
				break;
			case "Bubble Sort":
				performBubbleStep_1011();
				break;
			}
		});
		
		// event reset
		resetButton_1011.addActionListener(e -> reset_1011());

	}
	
	//set input 
	private void setArrayFromInput_1011() {
		String text_1011 = inputField_1011.getText().trim();
		if (text_1011.isEmpty()) return;
		try {
			String[] data_1011 = text_1011.split(", ");
			array_1011 = new MahasiswaADT_2511531011[data_1011.length];
			for (int k = 0; k < data_1011.length; k++) {
				String[] bagian_1011 = data_1011[k].split("-");
				array_1011[k] = new MahasiswaADT_2511531011(bagian_1011[0], bagian_1011[1], bagian_1011[2]);
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "Format Salah! \n"
					+ "Contoh: Aliifah-1011-IF", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
	//reset variabel sorting
		i_1011 = 1;
		pass_1011 = 0;
		stepCount_1011 = 1;
		sorting_1011 = true;
		stepButton_1011.setEnabled(true);
		stepArea_1011.setText("");
		
	//tampilkan data
		panelArray_1011.removeAll();
		labelArray_1011 = new JLabel[array_1011.length];
		for (int k = 0; k < array_1011.length; k++) {
			labelArray_1011[k] = new JLabel(array_1011[k].toString());
			labelArray_1011[k].setFont(new Font("Arial", Font.BOLD, 14));
			labelArray_1011[k].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			labelArray_1011[k].setPreferredSize(new Dimension(180, 50));
			labelArray_1011[k].setHorizontalAlignment(SwingConstants.CENTER);
			panelArray_1011.add(labelArray_1011[k]);
		}
		panelArray_1011.revalidate();
		panelArray_1011.repaint();
	}
	
	//insertion sort
	private void performInsertionStep_1011() {
		if (i_1011 < array_1011.length && sorting_1011) {
			MahasiswaADT_2511531011 key_1011 = array_1011[i_1011];
			int j = i_1011 - 1;
			
			StringBuilder stepLog_1011 = new StringBuilder();
			stepLog_1011.append("Langkah ").append(stepCount_1011).append(": Memasukkan ").append(key_1011).append("\n");
			
			while (j >= 0 && array_1011[j].compareTo(key_1011) > 0) {
				array_1011[j + 1] = array_1011[j];
				j--;
			}
			array_1011[j + 1] = key_1011;
			
			logStep_1011("InsertionSort");
			updateLabels_1011();
			i_1011++;
			checkFinished_1011(i_1011>=array_1011.length);
		}
	}
		
	private void performSelectionStep_1011() {
		if (pass_1011 < array_1011.length - 1 && sorting_1011) {
		int min_1011 = pass_1011;
		for (int k = pass_1011 + 1; k < array_1011.length; k++) {
			if (array_1011[k].compareTo(array_1011[min_1011]) < 0) {
				min_1011 = k;
			}
		}
		MahasiswaADT_2511531011 temp_1011 = array_1011[pass_1011];
		array_1011[pass_1011] = array_1011[min_1011];
		array_1011[min_1011] = temp_1011;
		
		logStep_1011("Selection Sort");
		updateLabels_1011();
		pass_1011++;
		checkFinished_1011(pass_1011 >= array_1011.length - 1);
		}
	}
	
	private void performBubbleStep_1011() {
		if (pass_1011 < array_1011.length - 1 && sorting_1011) {
		for (int k = 0; k < array_1011.length - 1 - pass_1011; k++) {
				if (array_1011[k].compareTo(array_1011[k + 1]) > 0) {
					MahasiswaADT_2511531011 temp_1011 = array_1011[k];
					array_1011[k] = array_1011[k + 1];
					array_1011[k + 1] = temp_1011;
				}
		}
		logStep_1011("Bubble Sort");
		updateLabels_1011();
		pass_1011++;
		checkFinished_1011(pass_1011 >= array_1011.length - 1);
		}
	}
	
	//update label
	private void updateLabels_1011() {
		for (int k = 0; k < array_1011.length; k++) {
			labelArray_1011[k].setText((array_1011[k].toString()));
		}
	}
	
	//log step
	private void logStep_1011(String metode_1011) {
		stepArea_1011.append("Langkah " + stepCount_1011 + " : ");
		stepArea_1011.append(arrayToString_1011() + "\n");
		stepCount_1011++;
	}
	
	//cek finish
	private void checkFinished_1011(boolean selesai_1011) {
		if (selesai_1011) {
			sorting_1011 = false;
			stepButton_1011.setEnabled(false);
			JOptionPane.showMessageDialog(this, "Sorting Selesai!");
		}
	}
	
	private void reset_1011() {
		inputField_1011.setText("");
		panelArray_1011.removeAll();
		panelArray_1011.revalidate();
		panelArray_1011.repaint();
		stepArea_1011.setText("");
		stepButton_1011.setEnabled(false);
		sorting_1011 = false;
		i_1011 = 1;
		pass_1011 = 0;
		stepCount_1011 = 1;
	}
	
	private String arrayToString_1011() {
		StringBuilder sb_1011 = new StringBuilder();
		sb_1011.append("[");
		for (int k = 0; k < array_1011.length; k++) {
			sb_1011.append(array_1011[k].toString());
			if (k < array_1011.length - 1) sb_1011.append(", ");
		}
		sb_1011.append("]");
		return sb_1011.toString();
	}
	
	public static void main (String[] args) {
		new GUIutama_2511531011().setVisible(true);
	}

}
