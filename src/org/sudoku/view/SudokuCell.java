package org.sudoku.view;

import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class SudokuCell extends JPanel {
	private static final long serialVersionUID = -8027145405769761645L;
	private String value;
	private int x,
				y;
	private JLabel text;
	
	public SudokuCell(int x, int y) {
		setPreferredSize(new Dimension(20, 20));
		this.x = x;
		this.y = y;
		resetValue();
		text = new JLabel("", SwingConstants.CENTER);
		text.setBorder(BorderFactory.createEmptyBorder( -3 /*top*/, 0, 0, 0 ));
		add(text);
	}
	
	public void setValue(int value) {
		if(value < 1 | value > 9)
			return;
		this.value = Integer.toString(value);
		text.setText(Integer.toString(value));
	}
	
	public void resetValue() {
		value = null;
	}
	
	public int getValue() {
		return Integer.parseInt(value);
	}
	
	public int[] getCoords() {
		int[] temp = {x, y};
		return temp;
	}
}