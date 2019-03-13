package pl.lach;

import java.util.Comparator;

public enum MovieComparators {

    TITLE("TITLE", Comparator.comparing(Movie::getTitle)),
    RATING("RATING", Comparator.comparing(Movie::getRating).reversed()),
    YEAR("YEAR", Comparator.comparing(Movie::getYear).reversed()),;


    private final String name;
    private final Comparator<Movie> comparator;

    MovieComparators(String name, Comparator<Movie> comparator) {
        this.name = name;
        this.comparator = comparator;
    }

    public String getName() {
        return name;
    }

    public Comparator<Movie> getComparator() {
        return comparator;
    }

    public static Comparator<Movie> convert(String name) {
        name=name.toUpperCase();
        MovieComparators[] values = MovieComparators.values();
        for (MovieComparators value : values) {
            if (value.getName().equals(name)) return value.getComparator();
        }
        throw new IllegalArgumentException("That type of sorting don't exist");
    }
}
