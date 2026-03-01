package ru.practicum.lessonA.lessonA1.fileCSV;

import ru.practicum.lessonA.lessonA1.exception.StudentSaveException;
import ru.practicum.lessonA.lessonA1.memory.StudentMemory;
import ru.practicum.lessonA.lessonA1.model.Student;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static ru.practicum.lessonA.lessonA1.controller.StudentController.getDefault;

public class FileBackedStudentMemory implements StudentMemory {
    private final StudentMemory studentMemory;
    private final File file;

    public FileBackedStudentMemory(File file) {
        this.studentMemory = getDefault();
        this.file = file;
    }

    public void saveStudent() {
        CSV csv = new CSV();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, StandardCharsets.UTF_8))){

            writer.write("id,firstName,lastName,middleName,dateOfBirth,address,phone,faculty,course,group");
            if (!studentMemory.getStudentAll().isEmpty()) {
                for (String student : studentMemory.getStudentAll()) {
                    writer.write(csv.toString(student));
                }
            }

        } catch (IOException e) {
            throw new StudentSaveException("Ошибка при записи.");
        }
    }

    @Override
    public List<String> getStudentAll() {
        List<String> list = studentMemory.getStudentAll();
        saveStudent();
        return list;
    }

    @Override
    public Student createStudent(Student student) {
        Student student1 = studentMemory.createStudent(student);
        saveStudent();
        return student1;
    }

    @Override
    public void updateStudent(Student student) {
        studentMemory.updateStudent(student);
        saveStudent();
    }

    @Override
    public Student getStudentById(long id) {
        Student student = studentMemory.getStudentById(id);
        saveStudent();
        return student;
    }

    @Override
    public void deleteStudentById(long id) {
        studentMemory.deleteStudentById(id);
        saveStudent();
    }

    @Override
    public void deleteStudentAll() {
        studentMemory.deleteStudentAll();
        saveStudent();
    }

    public static FileBackedStudentMemory loadFromFileStudent(File file) {
        FileBackedStudentMemory memory = new FileBackedStudentMemory(file);
        CSV csv = new CSV();
        try (BufferedReader reader = new BufferedReader(new FileReader(file, StandardCharsets.UTF_8))){
            while (reader.ready()) {
                csv.fromString(memory, reader.readLine());
            }
        } catch (IOException e) {
            throw new StudentSaveException("Ошибка при Чтении.");
        }
        return memory;
    }
}