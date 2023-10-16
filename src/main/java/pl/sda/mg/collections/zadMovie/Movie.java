package pl.sda.mg.collections.zadMovie;

public class Movie {
    private String title;
    private int yearsOfRelease;

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", yearsOfRelease=" + yearsOfRelease +
                '}';
    }

    public Movie(String title, int yearsOfRelease) {
        this.title = title;
        this.yearsOfRelease = yearsOfRelease;
    }

    public String getTitle() {
        return title;
    }

    public int getYearsOfRelease() {
        return yearsOfRelease;
    }
}
