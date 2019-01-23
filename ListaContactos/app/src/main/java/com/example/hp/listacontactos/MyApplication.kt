package com.example.hp.listacontactos

import android.app.Application
import com.example.hp.listacontactos.Models.Contact

class MyApplication: Application() {
    companion object {
        val Contacts: ArrayList<Contact> = ArrayList()
    }
}