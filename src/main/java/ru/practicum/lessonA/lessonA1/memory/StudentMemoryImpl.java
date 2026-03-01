package ru.practicum.lessonA.lessonA1.memory;

import ru.practicum.lessonA.lessonA1.exception.NullException;
import ru.practicum.lessonA.lessonA1.model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentMemoryImpl implements StudentMemory {
    private final HashMap<Long, Student> students = new HashMap<>();

    @Override
    public List<String> getStudentAll() {
        List<String> list = new ArrayList<>();
        if (!students.isEmpty()) {
            for (Student value : students.values()) {
                list.add(value.toString());
            }
        }
        return new ArrayList<>(list);
    }

    @Override
    public Student createStudent(Student student) {
        try {
            students.put(student.getId(), student);
        } catch (NullPointerException e) {
            throw new NullException("null", e);
        }
        return student;
    }

    @Override
    public void updateStudent(Student student) {
        try {
            if (students.containsKey(student.getId())) {
                Student oldStudent = students.get(student.getId());
                oldStudent.setFirstName(student.getFirstName());
                oldStudent.setLastName(student.getLastName());
                oldStudent.setMiddleName(student.getMiddleName());
                oldStudent.setDateOfBirth(student.getDateOfBirth());
                oldStudent.setAddress(student.getAddress());
                oldStudent.setPhone(student.getPhone());
                oldStudent.setFaculty(student.getFaculty());
                oldStudent.setCourse(student.getCourse());
                oldStudent.setGroup(student.getGroup());
                students.put(oldStudent.getId(), oldStudent);
            }
        } catch (NullPointerException e) {
            throw new NullException("null", e);
        }
    }

    @Override
    public Student getStudentById(long id) {
        Student student = null;
        if (students.containsKey(id)) {
            student = students.get(id);
        }
        return student;
    }

    @Override
    public void deleteStudentById(long id) {
        students.remove(id);
    }

    @Override
    public void deleteStudentAll() {
        students.clear();
    }
}