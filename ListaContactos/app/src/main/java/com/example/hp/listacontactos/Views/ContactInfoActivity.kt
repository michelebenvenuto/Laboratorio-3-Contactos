package com.example.hp.listacontactos.Views

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.view.View
import com.example.hp.listacontactos.MyApplication
import com.example.hp.listacontactos.R
import kotlinx.android.synthetic.main.activity_contact_info.*
import java.util.jar.Manifest

class ContactInfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_info)
        val item = intent.getIntExtra("itemToGet",0)
        val itemToShow= MyApplication.Contacts[item]
        nameView.setText(itemToShow.name)
        phoneNumberView.setText(itemToShow.phoneNumber)
        emailView.setText(itemToShow.email)

        phoneNumberView.setOnClickListener {
            val phoneIntent: Intent= Intent(Intent.ACTION_DIAL)
            phoneIntent.setData(Uri.parse("tel:${phoneNumberView.text}"))
            startActivity(phoneIntent)
        }

    }
    fun retrun(view: View){
        val intent: Intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }

}
