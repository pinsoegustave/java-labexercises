public class PinsoeGustaveMovie {
    private String title;
    private int releasedYear;
    private String rating;
    private String[] stars;
    private String director;
    private String[] genres;

    public PinsoeGustaveMovie(String movieData) {
//        Initialize arrays
        stars = new String[10];
        genres = new String[5];

//        Parse the movie data string
        parseMovieData(movieData);
    }

    private void parseMovieData(String movieData) {
        String[] sections = split(movieData, ',');

        for (String section : sections) {
            if (section.length() == 0) continue;

            // Find the colon that separates section name from value
            int colonIndex = section.indexOf(':');
            if (colonIndex == -1) continue;

            String sectionName = section.substring(0, colonIndex);
            String sectionValue = section.substring(colonIndex + 1);

            // Process each section based on its name
            if (sectionName.equals("Title")) {
                title = sectionValue;
            } else if (sectionName.equals("Released")) {
                releasedYear = Integer.parseInt(sectionValue);
            } else if (sectionName.equals("Rating")) {
                rating = sectionValue;
            } else if (sectionName.equals("People")) {
                parsePeople(sectionValue);
            } else if (sectionName.equals("Genre")) {
                parseGenres(sectionValue);
            }
        }
    }

//    method to get people
    private void parsePeople(String peopleData) {
        // Split people by dash
        String[] people = split(peopleData, '-');

        // Director is always the last person
        director = people[people.length - 1];

        // Stars are all people except the last one who is a director
        int starCount = Math.min(people.length - 1, 10);
        for (int i = 0; i < starCount; i++) {
            stars[i] = people[i];
        }
    }

//    method to get genres
    private void parseGenres(String genresData) {
        // Split genres by dash
        String[] genreArray = split(genresData, '-');

        int genreCount = Math.min(genreArray.length, 5);
        for (int i = 0; i < genreCount; i++) {
            genres[i] = genreArray[i];
        }
    }

    // method to check separators
    private String[] split(String str, char separator) {
        // Count how many separators we have
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == separator) {
                count++;
            }
        }

        String[] result = new String[count];
        int currentIndex = 0;
        int start = 0;

        for (int i = 0; i <= str.length(); i++) {
            if (i == str.length() || str.charAt(i) == separator) {
                result[currentIndex] = str.substring(start, i);
                currentIndex++;
                start = i + 1;
            }
        }

        return result;
    }

    // Accessor methods
    public String getTitle() {
        return title;
    }

    public int getReleasedYear() {
        return releasedYear;
    }

    public String getRating() {
        return rating;
    }

    public String[] getStars() {
        return stars;
    }

    public String getDirector() {
        return director;
    }

    public String[] getGenres() {
        return genres;
    }

}
