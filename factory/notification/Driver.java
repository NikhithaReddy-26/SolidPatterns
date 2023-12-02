package factory.notification;

public class Driver {

    public static void main(String[] args) {

        NotificationAttributes attributes = new NotificationAttributes(
                "9890098900","878787013","Your Mobile OTP : 35654 valid for 10 minus"
        );
        // Get an instance of the NotificationFactory
        NotificationFactory factory = NotificationFactory.getInstance();

//        Notification notification = NotificationFactory.createNotification(NotificationType.SMS);
//
//        notification.sendNotification(attributes);
//
//        notification = NotificationFactory.createNotification(NotificationType.EMAIL);
//
//        notification.sendNotification(attributes);
        Notification notification = factory.createNotification(NotificationType.SMS);
        notification.sendNotification(attributes);

        notification = factory.createNotification(NotificationType.EMAIL);
        notification.sendNotification(attributes);


    }
}
