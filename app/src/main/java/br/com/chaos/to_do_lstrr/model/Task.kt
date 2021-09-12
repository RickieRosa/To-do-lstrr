package br.com.chaos.to_do_lstrr.model

data class Task(
    val title: String,
    val description: String,
    val hour: String,
    val date: String,
    val id: Int = 0
)
