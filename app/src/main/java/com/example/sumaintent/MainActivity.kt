package com.example.sumaintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sumaintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

      binding.btnSuma.setOnClickListener{
          var inte: Intent = Intent(this,Resultado::class.java)
          inte.putExtra("suma1",binding.txtSumando1.text.toString())
          inte.putExtra("suma2",binding.txtSumando2.text.toString())
          startActivity(inte)
        }
    }
}