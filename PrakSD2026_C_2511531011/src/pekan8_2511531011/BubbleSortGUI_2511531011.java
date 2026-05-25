package pekan8_2511531011;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

import pekan7_2511531011.InsertionGUI_2511531011;

public class BubbleSortGUI_2511531011 extends JFrame {
	private static final long serialVersionUID = 1L;
	private int[] array_1011;
	private JLabel[] labelArray_1011;
	private JButton stepButton_1011, resetButton_1011, setButton_1011;
	private JTextField inputField_1011;
	private JPanel panelArray_1011;
	private JTextArea stepArea_1011;
	
	private int i = 1, j;
	private boolean sorting_1011 = false;
	private int stepCount_1011 = 1;
	
	/**
	 * Create the frame.
	 */
	public BubbleSortGUI_2511531011() {
		setTitle("Bubble Sort langkah per langkah");
		setSize(750, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		//panel input
		JPanel inputPanel_1011 = new JPanel(new FlowLayout());
		inputField_1011 = new JTextField(30);
		setButton_1011 = new JButton("Set Array");
		inputPanel_1011.add(new JLabel ("Masukkan angka (pisahkan dengan koma): "));
		inputPanel_1011.add(inputField_1011);
		inputPanel_1011.add(setButton_1011);
		
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
		stepArea_1011 = new JTextArea(8,60);
		stepArea_1011.setEditable(false);
		stepArea_1011.setFont(new Font("Monospaced", Font.PLAIN, 14));
		JScrollPane scrollPane_1011 = new JScrollPane(stepArea_1011);
		
		// tambahkan panel ke frame
		add(inputPanel_1011, BorderLayout.NORTH);
		add(panelArray_1011, BorderLayout.CENTER);
		add(controlPanel_1011, BorderLayout.SOUTH);
		add(scrollPane_1011, BorderLayout.EAST);
		
		// event set array
		setButton_1011.addActionListener(e -> setArrayFromInput_1011());
		
		// event langkah selanjutnya
		stepButton_1011.addActionListener(e -> performStep_1011());
		
		// event reset
		resetButton_1011.addActionListener(e -> reset_1011());

	}
	
	private void setArrayFromInput_1011() {
		String text_1011 = inputField_1011.getText().trim();
		if (text_1011.isEmpty()) return;
		String[] parts_1011 = text_1011.split(", ");
		array_1011 = new int [parts_1011.length];
		try {
			for (int k = 0; k < parts_1011.length; k++) {
				array_1011[k] = Integer.parseInt(parts_1011[k].trim());
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "Masukkan hanya angka "
					+ "yang dipisahkan dengan koma!", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		i = 0;
		j = 0;
		stepCount_1011 = 1;
		sorting_1011 = true;
		stepButton_1011.setEnabled(true);
		stepArea_1011.setText("");
		panelArray_1011.removeAll();
		labelArray_1011 = new JLabel[array_1011.length];
		for (int k = 0; k < array_1011.length; k++) {
			labelArray_1011[k] = new JLabel(String.valueOf(array_1011[k]));
			labelArray_1011[k].setFont(new Font("Arial", Font.BOLD, 24));
			labelArray_1011[k].setOpaque(true);
			labelArray_1011[k].setBackground(Color.WHITE);
			labelArray_1011[k].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			labelArray_1011[k].setPreferredSize(new Dimension(50, 50));
			labelArray_1011[k].setHorizontalAlignment(SwingConstants.CENTER);
			panelArray_1011.add(labelArray_1011[k]);
		}
		panelArray_1011.revalidate();
		panelArray_1011.repaint();
	}
	
	private void performStep_1011() {
		if (!sorting_1011 || i >= array_1011.length - 1) {
			sorting_1011 = false;
			stepButton_1011.setEnabled(false);
			JOptionPane.showMessageDialog(this, "Sorting selesai!");
			return;
		}
		resetHighLights_1011();
		StringBuilder stepLog_1011 = new StringBuilder();
		labelArray_1011[j].setBackground(Color.CYAN);
		labelArray_1011[j + 1].setBackground(Color.CYAN);
		if (array_1011[j] > array_1011[j + 1]) {
			//swap
			int temp_1011 = array_1011[j];
			array_1011[j] = array_1011[j + 1]; 
			array_1011[j + 1] = temp_1011;
			labelArray_1011[j].setBackground(Color.RED);
			labelArray_1011[j + 1].setBackground(Color.RED);
			stepLog_1011.append("langkah").append(stepCount_1011).append(": Menukar elemen ke-")
				.append(j).append(" (").append(array_1011[j + 1]).append(") dengan ke-")
				.append(j + 1).append(" (").append(array_1011[j]).append(")\n");
		} else {
			stepLog_1011.append("langkah").append(stepCount_1011).append(": Tidak ada pertukaran antara ke-")
				.append(j).append(" dan ke-").append(j + 1).append("\n");			
		}
		stepLog_1011.append("Hasil: ").append(arrayToString_1011(array_1011)).append("\n\n");
		stepArea_1011.append(stepLog_1011.toString());
		updateLabels_1011();
		j++;
		if (j >= array_1011.length - i - 1) {
			j = 0;
			i++;
		}
		stepCount_1011++;
		if (i >= array_1011.length - 1) {
			sorting_1011 = false;
			stepButton_1011.setEnabled(false);
			JOptionPane.showMessageDialog(this, "Sorting selesai!");
		}
	}
	
	private void updateLabels_1011() {
		for (int k = 0; k < array_1011.length; k++) {
			labelArray_1011[k].setText((String.valueOf(array_1011[k])));
		}
	}
	
	private void resetHighLights_1011() {
		for (JLabel label_1011 : labelArray_1011) {
			label_1011.setBackground(Color.WHITE);
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
		i = 0;
		j = 0;
		stepCount_1011 = 1;
	}
	
	private String arrayToString_1011(int[] arr_1011) {
		StringBuilder sb_1011 = new StringBuilder();
		for (int k = 0; k < arr_1011.length; k++) {
			sb_1011.append(arr_1011[k]);
			if (k < arr_1011.length - 1) sb_1011.append(", ");
		}
		return sb_1011.toString();
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			BubbleSortGUI_2511531011 gui_1011 = new BubbleSortGUI_2511531011();
			gui_1011.setVisible(true);
		});
	}

}
