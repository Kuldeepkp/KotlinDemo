package com.kp.kotlindemo

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val userList = ArrayList<User>();
        val user = User("Aashish","MaharajGunj")
        userList.add(user)
        userList.add(user)
        userList.add(user)
        userList.add(user)
        userList.add(user)
        userList.add(user)
        userList.add(user)
        userList.add(user)
        userList.add(user)
        recyclerView.adapter = CustomAdapter(userList)
        //recyclerView.setOnTouchListener(Recycl)
       // openDialog(btnShow)

    }
    private fun openDialog(btnShow: Button) {
        btnShow.setOnClickListener(){
            val alertDialog = AlertDialog.Builder(this)
            alertDialog.setMessage("Do you Want to Open Browser")
            alertDialog.setTitle("Caution!!!")
            alertDialog.setPositiveButton("Yes",DialogInterface.OnClickListener(){
                dialogInterface, i ->dialogInterface.dismiss()
                startActivity(Intent(this,WebViewActivity::class.java))
            })
            alertDialog.setNegativeButton("No",DialogInterface.OnClickListener(){
                dialogInterface, i -> dialogInterface.dismiss()
            })
            alertDialog.create().show()
        }
    }
}
