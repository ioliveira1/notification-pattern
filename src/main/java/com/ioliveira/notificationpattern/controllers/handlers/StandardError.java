package com.ioliveira.notificationpattern.controllers.handlers;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ioliveira.notificationpattern.notification.Error;

import java.time.LocalDateTime;
import java.util.List;

public record StandardError(
        @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
        LocalDateTime timestamp,
        String message,
        String path,
        List<Error> errors
) {
}
