package br.edu.ifsp.dmo.listadecontatos.model

import java.util.LinkedList

object ContactDAO {

    private val dataset = mutableListOf<Contact>()

    fun insert(contact: Contact) {
        dataset.add(Contact(contact.name, contact.phone))
    }

    fun findAll(): List<Contact> {
        return dataset.sortedBy {it.name}
    }
}