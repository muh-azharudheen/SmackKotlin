package com.azharudhen.smack_kotlin.Controllers.Controller.Controller.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.azharudhen.smack_kotlin.R

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun loginLoginBtnClicked(view: View){

    }

    fun loginCreateBtnClicked(view: View){
        val intent = Intent(this, CreateUserActivity::class.java)
        startActivity(intent)
    }

}
