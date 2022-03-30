package com.example.databetweenactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun submit(view:View){
// do something
        val name = findViewById<EditText>(R.id.name_et)
        val age = findViewById<EditText>(R.id.age_et)
        val gender = findViewById<EditText>(R.id.gender_et)
        val address = findViewById<EditText>(R.id.address_et)

        val bundle = Bundle()
        bundle.putString("name", name.text.toString())
        bundle.putString("age", age.text.toString())
        bundle.putString("gender", gender.text.toString())
        bundle.putString("address", address.text.toString())
        val intent = Intent(this, Profile::class.java)
        intent.putExtras(bundle)
        startActivity(intent)

//        val message = name.text.toString()
//        val message1 = age.text.toString()
//        val message2 = gender.text.toString()
//        val message3 = address.text.toString()
//        val intent = Intent(this,
//            Profile::class.java).apply {
//            putExtra(EXTRA_MESSAGE, message,message1,message2,message3)
//        }
//        startActivity(intent)

        Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show()
    }
}