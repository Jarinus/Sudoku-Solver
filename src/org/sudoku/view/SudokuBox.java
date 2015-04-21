package org.sudoku.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class SudokuBox extends JPanel {
	private static final long serialVersionUID = 5611486841947899453L;
	private SudokuCell[] cells;
	
	public SudokuBox() {
		setLayout(new GridLayout(3, 3));
		setBorder(new LineBorder(Color.BLACK));
		
		cells = new SudokuCell[9];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				int temp = ((i * 3) + j);
				cells[temp] = new SudokuCell(j, i);
				cells[temp].setValue(temp + 1);
				add(cells[temp]);
				//System.out.println(temp + " - X: " + j + " - Y: " + i);
			}
		}
	}
	
	public SudokuCell[] getCells() {
		return cells;
	}
	
	public SudokuCell getCell(int index) {
		if(index < 0 || index > 8) {
			System.out.println("Bad index value at getCell(" + index + ") in SudokuBox : " + index + " (Use 0 - 8)");
			return null;
		}
		return cells[index];
	}
	
	public int getValue(int cellIndex) {
		return getCell(cellIndex).getValue();
	}
}