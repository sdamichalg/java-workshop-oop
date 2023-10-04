package pl.sda.mg.oop.enums.continents;

public enum Continent {
    NORTH_AMERICA(24709000),
    SOUTH_AMERICA(17840000),
    AFRICA(30370000),
    EUROPE(10180000),
    ASIA(44660000),
    AUSTRALIA(8600000),
    ANTARCTICA(14000000);

    private final int area; //km2

    Continent(int area) {
        this.area = area;
    }


    public int getArea() {
        return area;
    }

    public static Continent getLargestContinent() {
        Continent[] continents = Continent.values();
        Continent largestContinent = continents[0];

        for (Continent continent : continents) {
            if (continent.getArea() > largestContinent.getArea()) {
                largestContinent = continent;
            }
        }

        return largestContinent;
    }

    public static Continent getSmallestContinent() {
        Continent[] continents = Continent.values();
        Continent smallestContinent = continents[0];

        for (Continent continent : continents) {
            if (continent.getArea() < smallestContinent.getArea()) {
                smallestContinent = continent;
            }
        }

        return smallestContinent;
    }
}
