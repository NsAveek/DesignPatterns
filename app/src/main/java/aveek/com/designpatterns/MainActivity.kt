package aveek.com.designpatterns

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import aveek.com.designpatterns.builder.Student

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val student  = Student.StudentBuilder("Aveek","Dhaka,Bangladesh","aveek@email.com").create()

        Log.d("Student is ", student.toString())

        val student1  = Student.StudentBuilder("Rahman","Kuala lumpur, Malaysia","rahman@email.com")
                .setAge(30)
                .create()
        Log.d("Student1 is ", student1.toString())

        val student2  = Student.StudentBuilder("Max","Jakarta, Indonesia","max@email.com")
                .setAge(30)
                .setPhoneNumber("+08722348234")
                .create()
        Log.d("Student2 is ", student2.toString())
    }
}
