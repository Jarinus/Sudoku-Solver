package org.sudoku.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import org.sudoku.model.LogicModule;

public class SudokuGrid extends JPanel implements LogicModule {
	private static final long serialVersionUID = 5777613012269223482L;
	private SudokuBox[] boxes;
	
	public SudokuGrid() {
		setLayout(new GridLayout(3, 3));
		setBorder(new LineBorder(Color.BLACK, 2));
		
		boxes = new SudokuBox[9];
		for(int i = 0; i < boxes.length; i++) {
			boxes[i] = new SudokuBox();
			add(boxes[i]);
		}
	}
	
	public SudokuBox[] getBoxes() {
		return boxes;
	}
	
	public SudokuBox getBox(int index) {
		if(index < 0 || index > 8) {
			System.out.println("Bad value at getBox(" + index + ") in SudokuGrid : " + index);
			return null;
		}
		return boxes[index];
	}
	
	public int getValue(int boxIndex, int cellIndex) {
		return getBox(boxIndex).getValue(cellIndex);
	}
}