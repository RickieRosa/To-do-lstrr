package br.com.chaos.to_do_lstrr.datasource

import br.com.chaos.to_do_lstrr.model.Task

object TaskDataSource {
    private val list = arrayListOf<Task>()

    fun getList() = list

    fun insertTask(task: Task) {
        list.add(task.copy(id = list.size +1))
    }
}