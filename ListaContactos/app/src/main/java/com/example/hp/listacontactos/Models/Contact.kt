package com.example.hp.listacontactos.Models

class Contact(val phoneNumber: String, val name: String, val email: String) {
    override fun toString(): String {
        return "Nombre:$name - #:$phoneNumber"
    }
}