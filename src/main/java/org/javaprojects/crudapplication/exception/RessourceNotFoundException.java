package org.javaprojects.crudapplication.exception;

public class RessourceNotFoundException extends RuntimeException{
    private static final long seriaLVersionUID = 1L;
    public RessourceNotFoundException(String message) {
        super(message);
    }
}
