package aveek.com.designpatterns.repository

import aveek.com.designpatterns.builder.Student

interface IStoreRepository {
    fun saveStudentData(student: Student) : Boolean
    fun updateStudentData(student: Student) : Int
    fun deleteStudentData (student: Student) : Boolean
}