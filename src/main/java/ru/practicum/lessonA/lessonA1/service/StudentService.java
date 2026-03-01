package ru.practicum.lessonA.lessonA1.service;

import ru.practicum.lessonA.lessonA1.model.Student;

public interface StudentService {
    void createStudent();
    void updateStudent();
    void getStudentById();
    void deleteStudentById();
    void deleteStudentAll();

   //a) список студентов заданного факультета;
   void getStudentAllA();

   //b) списки студентов для каждого факультета и курса;
   void getStudentAllB();

   //c) список студентов, родившихся после заданного года;
   void getStudentAllC();

   //d) список учебной группы.
   void getStudentAllD();

}