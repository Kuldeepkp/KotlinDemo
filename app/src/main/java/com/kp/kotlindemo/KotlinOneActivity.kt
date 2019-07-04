package com.kp.kotlindemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_kotlin_one.*

class KotlinOneActivity : AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_one)
        textView.text = "Hello Kuldeep!!!!"
        textView.setOnClickListener{
            Toast.makeText(this@KotlinOneActivity,textView.text,Toast.LENGTH_SHORT).show()
        }

       /* val button = Button(this)
        button.layoutParams = ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT,ConstraintLayout.LayoutParams.WRAP_CONTENT)
        button.text = "Click Me"*/
        button.text = "Click Me"
        button.setOnClickListener(){
            Toast.makeText(this@KotlinOneActivity,button.text,Toast.LENGTH_SHORT).show()
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }
    }
}
