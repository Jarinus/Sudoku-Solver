package org.sudoku.model;


import org.sudoku.view.SudokuBox;
import org.sudoku.view.SudokuCell;
import org.sudoku.view.SudokuFrame;
import org.sudoku.view.SudokuGrid;

public class SolverModule {
	private static SudokuFrame sudokuFrame;
	private static int[][][] possibilities;
	private static SudokuCell[][] cells;
	
	public SolverModule(SudokuFrame sudokuFrame) {
		SolverModule.sudokuFrame = sudokuFrame;
		act();
	}

	public boolean act() {
		possibilities = new int[9][9][9];
		cells = new SudokuCell[9][9];
		for(int box = 0; box < possibilities.length; box++) {
			for(int cell = 0; cell < possibilities[box].length; cell++) {
				cells[box][cell] = getCell(box, cell);
				possibilities[box][cell] = getPossibilities(cells[box][cell]);
				if(possibilities[box][cell].length == 1) {
					setValue(possibilities[box][cell][0], box, cell);
				}
			}
		}
		return false;
	}
	
	private void setValue(int value, int boxIndex, int cellIndex) {
		getGrid().getBox(boxIndex).getCell(cellIndex).setValue(value);
	}
	
	private int[] getPossibilities(SudokuCell cell) {
		int[] temp = new int[9];
		int index = 0;
		// Check for numbers 1 through 9.
		for(int i = 1; i <= 9; i++) {
			//int value = cell.getValue();
			boolean possible = false;
			//TODO: Finish.
			/*
			if(checkRow(i))
				possible = true;
			if(checkColumn(i))
				possible = true;
			if(checkBox(i))
				possible = true;
			*/
			if(possible) {
				temp[index] = i;
				index++;
			}
		}
		return temp;
	}
	
	private SudokuGrid getGrid() {
		return sudokuFrame.getGrid();
	}
	
	private SudokuBox getBox(int boxIndex) {
		return getGrid().getBox(boxIndex);
	}
	
	private SudokuCell getCell(int boxIndex, int cellIndex) {
		return getBox(boxIndex).getCell(cellIndex);
	}
}
