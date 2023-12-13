package br.edu.ifsp.scl.sdm.todolist.model.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import br.edu.ifsp.scl.sdm.todolist.model.entity.Task

// definição do Dao
@Dao
interface TaskDao {
    companion object {
        const val TASK_TABLE = "task"
    }

    // métodos DAO com CRUD
    @Insert // insert
    fun createTask(task: Task)
    @Query("SELECT * FROM $TASK_TABLE")
    fun retrieveTasks(): List<Task> // select
    @Update
    fun updateTask(task: Task) // update
    @Delete
    fun deleteTask(task: Task) // delete
}