package com.ioliveira.notificationpattern.exceptions;

import com.ioliveira.notificationpattern.notification.Error;
import com.ioliveira.notificationpattern.notification.Notification;

import java.util.List;

public class NotificationException extends RuntimeException {
    private final List<Error> errors;

    public NotificationException(final String message, final Notification notification) {
        super(message);
        this.errors = notification.errors();
    }

    public List<Error> getErrors() {
        return errors;
    }
}
