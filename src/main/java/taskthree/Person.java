package taskthree;

public class Person {
    private String firstName;
    private String lastName;
    private String favoriteMovie;

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFavoriteMovie() {
        return favoriteMovie;
    }

    public void setFavoriteMovie(String favoriteMovie) {
        this.favoriteMovie = favoriteMovie;
    }

    public Person(String firstName, String lastName, String favoriteMovie) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.favoriteMovie = favoriteMovie;
    }
}
