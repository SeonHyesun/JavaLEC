package ba.coder.hyesun.day2;

import javax.swing.JOptionPane;

public class InputVal {
	public static int getInt() {
		String input = JOptionPane.showInputDialog("�Է�");
		int result = Integer.parseInt(input);
		return result;

	}
	public static double getDouble() {
		String input = JOptionPane.showInputDialog("�Է�");
		double result = Double.parseDouble(input);
		return result;

	}

}
