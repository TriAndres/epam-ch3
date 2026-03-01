package ru.practicum.lessonA.lessonA1.exception;

public class StudentSaveException extends RuntimeException {
    public StudentSaveException(String message) {
        super(message);
    }
}