package com.example.hp.listacontactos.Views

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import com.example.hp.listacontactos.MyApplication
import com.example.hp.listacontactos.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contacts = MyApplication.Contacts
        val adapter= ArrayAdapter(this, android.R.layout.simple_list_item_1,contacts)
        ContactView.adapter= adapter

    }
    fun showNewContactActivity(view: View){
        val intent:Intent=Intent(this,NewContactActivity::class.java)
        startActivity(intent)
    }
}
