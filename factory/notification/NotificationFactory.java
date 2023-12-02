package factory.notification;

import java.util.HashMap;
import java.util.Map;

public class NotificationFactory {
//    private static final HashMap<NotificationType, Notification> factoryMap = new HashMap<>();
//
//    static {
//        // Will Take More about Creating Objects While we talk about Singleton Pattern
//        factoryMap.put(NotificationType.APP, new PushNotification());
//        factoryMap.put(NotificationType.EMAIL, new EmailNotification());
//        factoryMap.put(NotificationType.SMS, new SMSNotification());
//    }
//
//    public static Notification getInstance(NotificationType notificationType){
//        return factoryMap.get(notificationType);
//    }
private static Map<NotificationType, Notification> factoryMap;
    private Map<NotificationType, Notification> factoryMap;
    private static NotificationFactory instance;

    private NotificationFactory() {
        factoryMap = new HashMap<>();
        initializeFactory();
    }

    public static synchronized NotificationFactory getInstance() {
        if (instance == null) {
            instance = new NotificationFactory();
        }
        return instance;
    }

    private void initializeFactory() {
        // Register default notification types during construction.
        factoryMap.put(NotificationType.APP, new PushNotification());
        factoryMap.put(NotificationType.EMAIL, new EmailNotification());
        factoryMap.put(NotificationType.SMS, new SMSNotification());
    }

    public Notification createNotification(NotificationType type) {
        return factoryMap.get(type);
    }
}
