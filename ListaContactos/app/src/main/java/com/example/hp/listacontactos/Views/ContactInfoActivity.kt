package com.example.hp.listacontactos.Views

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.hp.listacontactos.MyApplication
import com.example.hp.listacontactos.R
import kotlinx.android.synthetic.main.activity_contact_info.*

class ContactInfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_info)
        val item = intent.getIntExtra("itemToGet")

    }

}
