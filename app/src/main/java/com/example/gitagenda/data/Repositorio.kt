package com.example.gitagenda.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "repositorio")
data class Repositorio(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    val nomeRepositorio: String,
    val urlGithub: String,
    val ultimoCommitFeito: String,
    val tituloDaTarefa: String

): Serializable
