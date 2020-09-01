package com.remreren.hover

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var mBtnOpenHover: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mBtnOpenHover = findViewById(R.id.btn_open_popup)
        mBtnOpenHover.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        if (view?.id == mBtnOpenHover.id) {
            // open hover
        }
    }
}