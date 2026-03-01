package ru.practicum.lessonA.lessonA1;

import ru.practicum.lessonA.lessonA1.memory.StudentMemoryImpl;
import ru.practicum.lessonA.lessonA1.model.Student;

public class StudentMain {
    public static void main(String[] args) {
        StudentMemoryImpl st = new StudentMemoryImpl();
        Student student = new Student(1,"1","2","3","4","5","6","7","8","9");

    }
}
