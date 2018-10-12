package aveek.com.designpatterns.builder;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class Student extends RealmObject {

    @PrimaryKey
    private String name;
    @Required
    private String address;
    @Required
    private String email;
    private String phoneNumber;
    private String passportNumber;
    private int age;

    public Student(){

    }

    private Student(final StudentBuilder builder) {
        name = builder.name;
        address = builder.address;
        email = builder.email;
        phoneNumber = builder.phoneNumber;
        passportNumber = builder.passportNumber;
        age = builder.age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + name +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", passportNumber='" + passportNumber + '\'' +
                ", age='" + age + '\'' +
                '}';
    }


    public static class StudentBuilder {
        private String name;
        private String address;
        private String email;
        private String phoneNumber;
        private String passportNumber;
        private int age;

        public StudentBuilder(String name, String address, String email){
            this.name = name;
            this.address = address;
            this.email = email;
        }

        public StudentBuilder setPhoneNumber(final String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public StudentBuilder setPassportNumber(final String passportNumber) {
            this.passportNumber = passportNumber;
            return this;
        }

        public StudentBuilder setAge(final int age) {
            this.age = age;
            return this;
        }

        public Student create() {
            return new Student(this);
        }
    }
}
