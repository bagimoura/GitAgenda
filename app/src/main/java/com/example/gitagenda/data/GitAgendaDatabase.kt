package com.example.gitagenda.data

import android.content.Context
import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.Room

@Database(entities = [Repositorio::class], version = 1)
abstract class GitAgendaDatabase: RoomDatabase() {
    abstract fun repositorioDao() : RepositorioDao

    companion object{
        @Volatile
        private var INSTANCE: GitAgendaDatabase? = null

        fun getInstance(context: Context): GitAgendaDatabase{
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    GitAgendaDatabase::class.java,
                    "git_agenda_database"
                ).build()

                INSTANCE = instance
                instance
            }
        }
    }
}