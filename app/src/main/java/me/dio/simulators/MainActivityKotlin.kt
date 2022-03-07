package me.dio.simulators

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.dio.simulators.databinding.ActivityMainBinding

class MainActivityKotlin : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        //val tvHello : TextView = findViewById<TextView>(R.id.tvHello)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)//root mesmo que layout.activity_main

        // binding.tvHello.text = "Teste"
    }
}
