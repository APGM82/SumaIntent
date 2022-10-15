package com.example.sumaintent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.sumaintent.databinding.ActivityResultadoBinding


class Resultado : AppCompatActivity() {
    lateinit var binding: ActivityResultadoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityResultadoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var sum1=intent.getStringExtra("suma1")
        var sum2=intent.getStringExtra("suma2")

        binding.txtResultado.text=(Integer.parseInt(sum1)+Integer.parseInt(sum2)).toString()

        binding.btnVolver.setOnClickListener{
            finish()
        }
    }

}