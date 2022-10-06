package com.example.pertemuandua

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.pertemuandua.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener{
            val email = binding.etEmail.text.toString()
            val password = binding.etPassword.text.toString()
            if (email.equals("abed@gmail.com") && password.equals("1972009")){
                Toast.makeText(this, resources.getString(R.string.msg_success), Toast.LENGTH_SHORT).show()
            } else {
                Snackbar.make(this, binding.button, resources.getString(R.string.msg_failed_login), Snackbar.LENGTH_LONG).show()
            }
        }
    }
}