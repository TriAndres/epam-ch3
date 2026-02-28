package ru.practicum.lessonA.lessonA1.memory;

import ru.practicum.lessonA.lessonA1.model.Student;

import java.util.HashMap;
import java.util.List;

public class StudentMemoryImpl implements StudentMemory {
    private final HashMap<Long, Student> students = new HashMap<>();

    @Override
    public List<Student> getStudentAll() {
        return List.of();
    }

    @Override
    public Student createStudent(Student student) {
        return null;
    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public Student getStudentById(long id) {
        return null;
    }

    @Override
    public void deleteStudentById(long id) {

    }

    @Override
    public void deleteStudentAll() {

    }
}