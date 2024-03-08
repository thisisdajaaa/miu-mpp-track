package lesson7.demo;

public enum Planet {
    MERCURY("mercury"),
    VENUS("venus"),
    MARS("mars"),
    EARTH("earth"),
    JUPITER("jupiter"),
    SATURN("saturn"),
    URANUS("uranus"),
    NEPTUNE("neptune"),
    PLUTO("pluto");


    private final String name;

    Planet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Planet getValue(String value) {
        for (Planet planet : Planet.values()) {
            if (planet.getName().equals(value)) {
                return planet;
            }
        }

        return null;
    }
}
