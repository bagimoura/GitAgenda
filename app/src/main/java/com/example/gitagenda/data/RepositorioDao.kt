package com.example.gitagenda.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface RepositorioDao {
    @Insert
    suspend fun inserir(repositorio: Repositorio)

    @Query("SELECT * FROM repositorio ORDER BY id ASC")
    suspend fun listarTodos(): List<Repositorio>

    @Query("SELECT * FROM repositorio WHERE id = :id")
    suspend fun buscarPorId(id: Int): Repositorio?

    @Update
    suspend fun atualizar(repositorio: Repositorio)

    @Delete
    suspend fun deletar(repositorio: Repositorio)
}