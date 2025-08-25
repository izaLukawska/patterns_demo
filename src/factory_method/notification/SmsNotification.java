package factory_method.notification;

public class SmsNotification implements Informable {

    @Override
    public void inform() {
        System.out.println("Sending SMS notification");
    }
}
