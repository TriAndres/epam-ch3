package ru.practicum.lessonA.lessonA1.exception;

public class NullException extends RuntimeException {
    public NullException(String message, Throwable cause) {
        super(message, cause);
    }
}