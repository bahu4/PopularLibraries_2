package com.example.popularlibraries_2.hw5;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "users_base")
public class Users {
    @PrimaryKey(autoGenerate = true)
    public int id;
    public String name;
    public String surname;
    public int age;
    @Override
    public String toString() {
        return "User{" +
                " id=" + id +
                ", name=' " + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
