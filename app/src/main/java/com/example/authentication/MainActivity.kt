package com.example.authentication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var etEmail: EditText
    lateinit var etpassword: EditText
    lateinit var btnLogin: Button
    lateinit var btSignUp: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castViews()
        login()
        sign()


    }

    fun castViews() {
        etEmail = findViewById(R.id.etEmail)
        etpassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)
        btSignUp = findViewById(R.id.btnSignUp)


    }

    fun sign() {
        btSignUp.setOnClickListener {
            val intent = Intent(baseContext, Signup::class.java)
            startActivity(intent)
        }
   }

    fun login(){
             btnLogin.setOnClickListener{
                 val intent=Intent(baseContext,Signup::class.java)
                 startActivity(intent)


}}}