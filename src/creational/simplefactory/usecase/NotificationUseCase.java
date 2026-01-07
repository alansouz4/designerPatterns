package creational.simplefactory.usecase;

import creational.simplefactory.NotificationGateway;
import creational.simplefactory.controller.NotificationRequest;
import creational.simplefactory.controller.Response;
import creational.simplefactory.service.NotifyFactory;

public class NotificationUseCase {

    NotificationGateway notificationGateway;
    NotifyFactory notifyFactory;

    public void sendNotification(NotificationRequest request) {

        notificationGateway = notifyFactory.create(request.notificationType());

        notificationGateway.sendNotification(request.recipient(), request.message());

        new Response("Notificação enviada com sucesso!");
    }
}
