package ru.practicum.lessonA.lessonA1.memory;

import ru.practicum.lessonA.lessonA1.model.Student;

import java.util.List;

public interface StudentMemory {
    List<Student> getStudentAll();
    Student createStudent(Student student);
    void updateStudent(Student student);
    Student getStudentById(long id);
    void deleteStudentById(long id);
    void deleteStudentAll();
}