package com.example.passinginfo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        init()
    }


    private fun init(){
        button_new_user.setOnClickListener {


            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        button_login.setOnClickListener {

            var email = edit_text_email.text.toString()
            var password = edit_text_password.text.toString()


            if (email ==  "Admin" && password == "123456") {


                var intent = Intent(this, HomeActivity::class.java)
                intent.putExtra("Email", email)
                startActivity(intent)

            }

        }


    }
}