package factory_method.factory;

import factory_method.notification.Informable;
import factory_method.notification.SmsNotification;

public class SmsNotificationFactory extends NotificationFactory{

    @Override
    public Informable createNotification() {
        return new SmsNotification();
    }
}
