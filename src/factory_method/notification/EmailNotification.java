package factory_method.notification;

public class EmailNotification implements Informable {

    @Override
    public void inform() {
        System.out.println("Sending Email notification");
    }
}
