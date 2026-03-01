package ru.practicum.lessonA.lessonA1.fileCSV;

import ru.practicum.lessonA.lessonA1.model.Student;

public class CSV {
    public String toString(String student) {
        String[] line = student.split("/");
        return String.join(",",
                line[0],
                line[1],
                line[2],
                line[3],
                line[4],
                line[5],
                line[6],
                line[7],
                line[8],
                line[9]
        );
    }

    public void fromString(FileBackedStudentMemory memory, String script) {
        String[] line = script.split(",");
        memory.createStudent(
                new Student(
                        Long.parseLong(line[0]),
                        line[1],
                        line[2],
                        line[3],
                        line[4],
                        line[5],
                        line[6],
                        line[7],
                        line[8],
                        line[9]
                )
        );
    }
}