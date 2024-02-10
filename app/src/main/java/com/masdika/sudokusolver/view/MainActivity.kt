package com.masdika.sudokusolver.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.masdika.sudokusolver.databinding.ActivityMainBinding
import com.masdika.sudokusolver.model.PlaySudokuViewModel
import com.masdika.sudokusolver.view.custom.SudokuBoardViews

class MainActivity : AppCompatActivity(), SudokuBoardViews.OnTouchListener {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: PlaySudokuViewModel
    private lateinit var sudokuBoardview: SudokuBoardViews
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        sudokuBoardview.registerListener(this)
        //viewModel = ViewModelProvider.of(this).get(PlaySudokuViewModel::class.java)
        viewModel = ViewModelProvider(this)[PlaySudokuViewModel::class.java]
        viewModel.sudokuGame.selectedCellLiveData.observe(
            this,
            Observer { updateSelectedCellUI(it) })

    }

    private fun updateSelectedCellUI(cell: Pair<Int, Int>?) = cell?.let {
        sudokuBoardview.updateSelectedCellUI(cell.first, cell.second)
    }

    override fun onCellTouched(row: Int, col: Int) {
        viewModel.sudokuGame.updateSelectedCell(row, col)
    }
}

