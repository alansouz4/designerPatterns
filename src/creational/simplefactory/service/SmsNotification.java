package creational.simplefactory.service;

import creational.simplefactory.NotificationGateway;

public class SmsNotification implements NotificationGateway {

    @Override
    public void sendNotification(String recipient, String message){
        // logica para envio de notificacao via email
    };
}
