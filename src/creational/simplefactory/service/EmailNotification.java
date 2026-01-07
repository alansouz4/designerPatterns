package creational.simplefactory.service;

import creational.simplefactory.NotificationGateway;

public class EmailNotification implements NotificationGateway {

    @Override
    public void sendNotification(String recipient, String message){
        // logica para envio de notificacao via email
    };
}
