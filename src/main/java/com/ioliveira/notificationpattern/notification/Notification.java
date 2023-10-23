package com.ioliveira.notificationpattern.notification;

import java.util.List;

public interface Notification {
    void addError(final Error error);

    boolean hasErrors();

    List<Error> errors();
}
