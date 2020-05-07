package com.jws.mango.core.exception;

public class MangoException extends RuntimeException {
    public MangoException() {
        super();
    }

    public MangoException(String message) {
        super(message);
    }

    public MangoException(String message, Throwable cause) {
        super(message, cause);
    }
}
