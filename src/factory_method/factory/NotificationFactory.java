package factory_method.factory;

import factory_method.notification.Informable;

public abstract class NotificationFactory {

    public abstract Informable createNotification();
}
