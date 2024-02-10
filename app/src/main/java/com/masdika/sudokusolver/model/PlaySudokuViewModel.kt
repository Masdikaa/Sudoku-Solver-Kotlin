package com.masdika.sudokusolver.model

import androidx.lifecycle.ViewModel
import com.masdika.sudokusolver.game.SudokuGame

class PlaySudokuViewModel : ViewModel() {
    val sudokuGame = SudokuGame()
}