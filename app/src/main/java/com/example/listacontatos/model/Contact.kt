package com.example.listadecontatos.model

class Contact(val name: String, val phone: String){

    override fun toSring(): String {
        return "Contato{name:'$name',phone:'$phone'}"
    }
}