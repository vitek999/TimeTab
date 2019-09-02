package ru.intelrug.timetab.data.network.dto

data class LessonDto(
    val id: Long,
    val groupId: Long,
    val typeId: Long,
    val week: Int,
    val day: Int,
    val number: Int,
    val count: Int,
    val teacherId: Long,
    val scienceId: Long,
    val auditory: String
)