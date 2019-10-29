package com.example.fcu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun DDoS(v: View){
        var next: Intent = Intent(this,Main2Activity::class.java)
        startActivity(next)






    }
}



