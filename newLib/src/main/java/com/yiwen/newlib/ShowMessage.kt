package com.yiwen.newlib

import android.content.Context
import android.widget.Toast

class ShowMessage {
    fun showMessage(context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
        Toast.makeText(context, "==============================", Toast.LENGTH_SHORT).show()
    }
}