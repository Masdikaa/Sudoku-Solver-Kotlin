package com.masdika.sudokusolver

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.masdika.sudokusolver.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        binding.btnFill1.setOnClickListener(this)
        binding.btnFill2.setOnClickListener(this)
        binding.btnFill3.setOnClickListener(this)
        binding.btnFill4.setOnClickListener(this)
        binding.btnFill5.setOnClickListener(this)
        binding.btnFill6.setOnClickListener(this)
        binding.btnFill7.setOnClickListener(this)
        binding.btnFill8.setOnClickListener(this)
        binding.btnFill9.setOnClickListener(this)
        binding.btnDelete.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_fill_1 -> {
                Toast.makeText(this, "1", Toast.LENGTH_SHORT).show()
            }

            R.id.btn_fill_2 -> {
                Toast.makeText(this, "2", Toast.LENGTH_SHORT).show()
            }

            R.id.btn_fill_3 -> {
                Toast.makeText(this, "3", Toast.LENGTH_SHORT).show()
            }

            R.id.btn_fill_4 -> {
                Toast.makeText(this, "4", Toast.LENGTH_SHORT).show()
            }

            R.id.btn_fill_5 -> {
                Toast.makeText(this, "5", Toast.LENGTH_SHORT).show()
            }

            R.id.btn_fill_6 -> {
                Toast.makeText(this, "6", Toast.LENGTH_SHORT).show()
            }

            R.id.btn_fill_7 -> {
                Toast.makeText(this, "7", Toast.LENGTH_SHORT).show()
            }

            R.id.btn_fill_8 -> {
                Toast.makeText(this, "8", Toast.LENGTH_SHORT).show()
            }

            R.id.btn_fill_9 -> {
                Toast.makeText(this, "9", Toast.LENGTH_SHORT).show()
            }

            R.id.btn_delete -> {
                Toast.makeText(this, "Del", Toast.LENGTH_SHORT).show()
            }
        }
    }

}

