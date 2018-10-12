package aveek.com.designpatterns.repository

import aveek.com.designpatterns.builder.Student
import io.realm.Realm

class DatabaseRepository : IStoreRepository {

    private var realm: Realm = Realm.getDefaultInstance()

    override fun saveStudentData(student: Student): Boolean {
        try {
            realm.executeTransaction {
                realm.insertOrUpdate(student)
            }
        } catch (e: Exception) {
            return false
        } finally {
            if (realm!=null) realm.close()
        }
        return true
    }

    override fun updateStudentData(student: Student): Int {
        return 1
    }

    override fun deleteStudentData(student: Student): Boolean {
        return true
    }
}