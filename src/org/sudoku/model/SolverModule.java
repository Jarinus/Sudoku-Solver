package org.sudoku.model;


import org.sudoku.view.SudokuBox;
import org.sudoku.view.SudokuCell;
import org.sudoku.view.SudokuFrame;
import org.sudoku.view.SudokuGrid;

public class SolverModule {
	private static SudokuFrame sudokuFrame;
	
	public SolverModule(SudokuFrame sudokuFrame) {
		SolverModule.sudokuFrame = sudokuFrame;
		act();
	}

	public boolean act() {
		for(SudokuBox box : getGrid().getBoxes()) {
			
		}
		return false;
	}
	
	private void setValue(int value, int boxIndex, int cellIndex) {
		getGrid().getBox(boxIndex).getCell(cellIndex).setValue(value);
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
