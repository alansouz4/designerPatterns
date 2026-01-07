package creational.simplefactory.controller;

import creational.simplefactory.usecase.NotificationUseCase;

public class NotificationController {

    NotificationUseCase notificationUseCase;

    Response sendNotification(NotificationRequest request) {

        notificationUseCase.sendNotification(request);

        return new Response("Notificação enviada com sucesso!");
    }
}
