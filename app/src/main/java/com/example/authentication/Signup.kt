package com.example.authentication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner

class Signup : AppCompatActivity() {
    lateinit var etName:EditText
    lateinit var spGender:Spinner
    lateinit var etEmail:EditText
    lateinit var etPhonenumber:EditText
    lateinit var etpassword:EditText
    lateinit var btnSignup2:Button
    lateinit var btnLogin2:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        castViews()
        Signup2()
        login2()

    }
    fun castViews(){
        etName=findViewById(R.id.etName)
        spGender=findViewById(R.id.spGender)
        etEmail=findViewById(R.id.etEmail)
        etPhonenumber=findViewById(R.id.etPhonenumber)
        etpassword=findViewById(R.id.etPassword)
        btnSignup2=findViewById(R.id.btnSignup2)
        btnLogin2=findViewById(R.id.btnLogin2)


        val genders = arrayOf("Female", "Male", "it", "Others")
        val gendersAdapter = ArrayAdapter<String>(baseContext, android.R.layout.simple_spinner_item, genders)
        gendersAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item,)
        spGender.adapter = gendersAdapter



    }
    fun Signup2(){
        btnSignup2.setOnClickListener {
            val intent=Intent(baseContext,Signup::class.java)
            startActivity(intent)
        }
    }
    fun login2(){
        btnLogin2.setOnClickListener {
            val intent=Intent(baseContext,MainActivity::class.java)
            startActivity(intent)
        }
    }


}