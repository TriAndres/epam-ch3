package ru.practicum.lessonA.lessonA1.repository;

import ru.practicum.lessonA.lessonA1.model.Student;

import java.util.HashMap;

public class StudentRepositoryImpl implements StudentRepository {
    private final HashMap<Long, Student> students = new HashMap<>();

}