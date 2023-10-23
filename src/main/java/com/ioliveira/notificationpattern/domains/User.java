package com.ioliveira.notificationpattern.domains;

import com.ioliveira.notificationpattern.exceptions.NotificationException;
import com.ioliveira.notificationpattern.notification.Error;
import com.ioliveira.notificationpattern.notification.Notification;
import com.ioliveira.notificationpattern.notification.NotificationImpl;

public class User {
    private final String id;
    private final String name;
    private final String email;

    public User(final String id, final String name, final String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        validate();
    }

    private void validate() {
        final Notification notification = NotificationImpl.create();

        if (this.id == null || this.id.isBlank()) {
            notification.addError(new Error("id is required"));
        }
        if (this.name == null || this.name.isBlank()) {
            notification.addError(new Error("name is required"));
        }
        if (this.email == null || this.email.isBlank()) {
            notification.addError(new Error("email is required"));
        }

        if (notification.hasErrors()) {
            throw new NotificationException("Error to create user", notification);
        }
    }

    public String getId() {
        return id;
    }
}
