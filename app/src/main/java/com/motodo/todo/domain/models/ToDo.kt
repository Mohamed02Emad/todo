package com.motodo.todo.domain.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity
data class ToDo(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    var title: String = "",
    var hasAlarm : Boolean = false,
    var alarmTime : String? = null,
    var isDone : Boolean = false,
    var date : Date = Date(),
    var remindBefore : RemindBefroeTime = RemindBefroeTime.DO_NOT,
    var priority: Priority = Priority.NONE
)

enum class RemindBefroeTime{
    ONE_DAY , ONE_HOUR , FIFTEEN_MINUTE , DO_NOT
}

enum class Priority{
    LOW, MEDIUM, HIGH , NONE
}
