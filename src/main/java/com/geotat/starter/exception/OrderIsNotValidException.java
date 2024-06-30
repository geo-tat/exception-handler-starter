package com.geotat.starter.exception;

import lombok.Getter;

@Getter
public class OrderIsNotValidException extends RuntimeException {
    private final String message;

    public OrderIsNotValidException(String message) {
        this.message = message;
    }
}
