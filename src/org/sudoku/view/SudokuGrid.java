package org.sudoku.view;

import javax.swing.JPanel;

import org.sudoku.model.LogicModule;

public class SudokuGrid extends JPanel implements LogicModule {
	private static final long serialVersionUID = 5777613012269223482L;
	private SudokuBox[] boxes;
	
	public SudokuGrid() {
		boxes = new SudokuBox[9];
		for(int i = 0; i < boxes.length; i++) {
			boxes[i] = new SudokuBox();
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