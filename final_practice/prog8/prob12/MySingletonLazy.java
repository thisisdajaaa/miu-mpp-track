package final_practice.prog8.prob12;

import java.util.Optional;

public class MySingletonLazy {
    private static MySingletonLazy instance = null;

    private MySingletonLazy() {
    }

    private static MySingletonLazy createInstance() {
        if (instance == null) instance = new MySingletonLazy();
        return instance;
    }

    public static MySingletonLazy getInstance() {
        return Optional.ofNullable(instance).orElseGet(MySingletonLazy::createInstance);
    }
}
