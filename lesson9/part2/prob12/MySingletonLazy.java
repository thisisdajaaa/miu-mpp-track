package lesson9.part2.prob12;

import java.util.Optional;

public class MySingletonLazy {
    private static MySingletonLazy instance = null;

    private MySingletonLazy(){}

    private static MySingletonLazy createInstance() {
        try {
            instance = new MySingletonLazy();
            return instance;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static MySingletonLazy getInstance() {
        return Optional.ofNullable(instance).orElseGet(MySingletonLazy::createInstance);
    }
}
