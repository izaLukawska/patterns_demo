package factory_method.factory;

import factory_method.notification.EmailNotification;
import factory_method.notification.Informable;

public class EmailNotificationFactory extends NotificationFactory{

    @Override
    public Informable createNotification() {
        return new EmailNotification();
    }
}
