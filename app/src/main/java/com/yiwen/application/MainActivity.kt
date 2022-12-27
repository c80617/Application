package com.yiwen.application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yiwen.newlib.ShowMessage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val context = this
        val showMessage = ShowMessage()
        showMessage.showMessage(context,"ba ba ba ba ba ba ba")
    }
}