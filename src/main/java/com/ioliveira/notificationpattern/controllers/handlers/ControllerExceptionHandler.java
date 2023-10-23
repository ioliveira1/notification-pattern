package com.ioliveira.notificationpattern.controllers.handlers;

import com.ioliveira.notificationpattern.exceptions.NotificationException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(NotificationException.class)
    public ResponseEntity<StandardError> notificationException(
            final NotificationException exception,
            final HttpServletRequest request) {

        final StandardError standardError = new StandardError(
                LocalDateTime.now(),
                exception.getMessage(),
                request.getRequestURI(),
                exception.getErrors()
        );

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(standardError);
    }

}
