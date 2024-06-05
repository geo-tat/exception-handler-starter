package com.geotat.starter.exception;

import lombok.Getter;

@Getter
public class OrderStatusValidException extends RuntimeException {
    private final String message;

    public OrderStatusValidException(String message) {
        this.message = message;
    }
}