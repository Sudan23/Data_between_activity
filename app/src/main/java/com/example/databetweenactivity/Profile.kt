package com.example.databetweenactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        var name_pro_tv = findViewById<TextView>(R.id.name_pro_tv)
        var age_pro_tv = findViewById<TextView>(R.id.age_pro_tv)
        var gender_pro_tv = findViewById<TextView>(R.id.gender_pro_tv)
        var address_pro_tv = findViewById<TextView>(R.id.address_pro_tv)

        val bundle = intent.extras
        if(bundle !=null) {
            name_pro_tv.text = "Name : ${bundle.getString("name")}"
            age_pro_tv.text = "Age : ${bundle.getString("age")}"
            gender_pro_tv.text = "Gender : ${bundle.getString("gender")}"
            address_pro_tv.text = "Address : ${bundle.getString("address")}"
            }
    }
}