package com.example.passinginfo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        init()
    }


    private fun init(){
        button_reg.setOnClickListener {


            var intent = Intent(this, LoginActivity::class.java )

            startActivity(intent)
        }

        button_login.setOnClickListener {

            var intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }


    }



}