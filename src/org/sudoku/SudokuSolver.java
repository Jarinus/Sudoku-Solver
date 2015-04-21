package org.sudoku;

import org.sudoku.model.LogicModule;
import org.sudoku.model.SolverModule;
import org.sudoku.view.SudokuFrame;

public class SudokuSolver extends Thread implements LogicModule {
	private static SudokuFrame sudokuFrame;
	private static SolverModule solverModule;
	public static boolean suspended;
	
	public static void main(String[] args) {
		sudokuFrame = new SudokuFrame();
		solverModule = new SolverModule(sudokuFrame);
		suspended = true;
	}
	
	public void startSolver() {
		suspended = false;
		notifyAll();
	}
	
	public void pauseSolver() {
		suspended = true;
	}
	
	public void run() {
		if(suspended) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			if(solverModule.act())
				pauseSolver();
		}
	}
}