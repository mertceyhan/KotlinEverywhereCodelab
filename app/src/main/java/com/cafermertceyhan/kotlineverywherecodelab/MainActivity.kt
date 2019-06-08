package com.cafermertceyhan.kotlineverywherecodelab

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username = intent.getStringExtra("username")
        val email = intent.getStringExtra("email")

        //   8 - Get password value from intent
        val password = intent.getStringExtra("password")

        tv_hello_user.text = getString(R.string.hello_user, username)
        tv_user_email.text = getString(R.string.your_email, email)

        //  9 - Set R.string.your_password value to tv_user_password
        tv_user_password.text = getString(R.string.your_password, password)
    }
}
