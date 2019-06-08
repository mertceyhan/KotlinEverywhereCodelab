package com.cafermertceyhan.kotlineverywherecodelab

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        btn_sign_up.setOnClickListener {

            val username = et_username.text.toString()
            val email = et_email.text.toString()

            // TODO 6 - Define a password variable and get its value from et_password.

            // TODO 7 - Call startMainActivity function
        }
    }


    private fun startMainActivity(username: String, email: String, password: String) {

        if (password.length < 6) {
            Toast.makeText(this, getString(R.string.password_error), Toast.LENGTH_SHORT).show()
        } else {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("username", username)
            intent.putExtra("email", email)
            intent.putExtra("password", password)
            startActivity(intent)
            finish()
        }
    }
}
