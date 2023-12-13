package br.edu.ifsp.scl.sdm.todolist.model.entity

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

// entity que corresponde a uma tabela no banco de dados

@Parcelize
@Entity
data class Task ( // entity Task que corresponde uma tabela
    @PrimaryKey
    var time: Long = INVALID_TIME,
    var name: String = "",
    var done: Int = TASK_DONE_FALSE
): Parcelable {
    companion object {
        const val INVALID_TIME = -1L // definição de constante
        const val TASK_DONE_TRUE = 1 // definição de constante
        const val TASK_DONE_FALSE = 0 // definição de constante
    }
}