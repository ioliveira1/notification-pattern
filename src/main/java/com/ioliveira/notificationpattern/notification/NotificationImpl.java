package com.ioliveira.notificationpattern.notification;

import java.util.ArrayList;
import java.util.List;

public record NotificationImpl(List<Error> errors) implements Notification {

    public static Notification create() {
        return new NotificationImpl(new ArrayList<>());
    }

    @Override
    public void addError(final Error error) {
        this.errors.add(error);
    }

    @Override
    public boolean hasErrors() {
        return !this.errors.isEmpty();
    }
}
