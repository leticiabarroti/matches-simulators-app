package me.dio.simulators

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.dio.simulators.databinding.ActivityDatailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDatailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDatailBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}