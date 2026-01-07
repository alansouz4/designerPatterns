package creational.simplefactory.service;

import creational.simplefactory.NotificationGateway;

import java.util.Objects;

public class NotifyFactory {

    public NotificationGateway create(String notificationType) {
        if (Objects.equals(notificationType, "sms")) {
            return new SmsNotification();
        }

        if (Objects.equals(notificationType, "email")) {
            return new EmailNotification();
        }

        if (Objects.equals(notificationType, "slack")) {
            return new SlackNotification();
        }

        throw new IllegalArgumentException();
    }
}
