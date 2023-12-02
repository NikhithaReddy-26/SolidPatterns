public class CheckInstances {

    public static void main(String[] args) {
        // Lazy Initialization
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();

        System.out.println("LazySingleton-1 : " + lazySingleton1);
        System.out.println("LazySingleton-2 : " + lazySingleton2);

        // Eager Initialization
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();

        System.out.println("EagerSingleton-1 : " + eagerSingleton1);
        System.out.println("EagerSingleton-2 : " + eagerSingleton2);
    }
}
