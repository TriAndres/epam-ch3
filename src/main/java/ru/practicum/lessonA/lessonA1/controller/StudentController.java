package ru.practicum.lessonA.lessonA1.controller;

import ru.practicum.lessonA.lessonA1.memory.StudentMemory;
import ru.practicum.lessonA.lessonA1.memory.StudentMemoryImpl;

import java.io.File;

import static ru.practicum.lessonA.lessonA1.fileCSV.FileBackedStudentMemory.loadFromFileStudent;

public class StudentController {
    public static File file = new File("src\\main\\java\\ru\\practicum\\lessonA\\lessonA1\\fileCSV\\StudentFile.csv");
    public static StudentMemory getDefault() {
        return new StudentMemoryImpl();
    }

    public static StudentMemory detDefaultFile() {
        return loadFromFileStudent(file);
    }
}