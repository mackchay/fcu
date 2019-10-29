package com.example.fcu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main3.*
import java.lang.Math.sqrt
import kotlin.math.sqrt

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
    }

    fun check2(v: View) {



      var a = editText.text.toString().toFloat()
      var b = editText2.text.toString().toFloat()
      var c = editText3.text.toString().toFloat()
      var d = 0f
      var x1 = 0f
      var x2 = 0f
      var e = textView7.text.toString().toFloat()
      d = b*b - 4*a*c
      if (d>0)
        x1 = ((-b + sqrt(d))/2).toFloat()
        x2 = ((-b + sqrt(d))/2).toFloat()
      if (d==0f)
        x1 = -b/(2*a)

        textView5.text= x1.toString()
        textView6.text= x2.toString()

}








}
