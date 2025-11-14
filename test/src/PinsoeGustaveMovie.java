public class PinsoeGustaveMovie {
//    Instance variables
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
        int start = 0;
        int end = 0;

        // Process each section separated by commas
        while (end < movieData.length()) {
            // Find the next comma or end of string
            end = findNextSeparator(movieData, start, ',');
            String section = "";
            if (end == -1) {
                section = movieData.substring(start);
                end = movieData.length();
            } else {
                section = movieData.substring(start, end);
            }

            // Find the colon that separates section name from value
            int colonIndex = section.indexOf(':');
            if (colonIndex != -1) {
                String sectionName = section.substring(0, colonIndex);
                String sectionValue = section.substring(colonIndex + 1);

                // Process each section based on its name
                if (sectionName.equals("Title")) {
                    title = sectionValue;
                } else if (sectionName.equals("Released")) {
                    releasedYear = stringToInt(sectionValue);
                } else if (sectionName.equals("Rating")) {
                    rating = sectionValue;
                } else if (sectionName.equals("People")) {
                    parsePeople(sectionValue);
                } else if (sectionName.equals("Genre")) {
                    parseGenres(sectionValue);
                }
            }

            start = end + 1;
            if (start > movieData.length()) break;
        }
    }

    private void parsePeople(String peopleData) {
        int start = 0;
        int end = 0;
        int peopleCount = 0;
        String[] tempPeople = new String[20]; // Temporary storage

        // Split people by dash
        while (end < peopleData.length()) {
            end = findNextSeparator(peopleData, start, '-');
            String person = "";
            if (end == -1) {
                person = peopleData.substring(start);
                end = peopleData.length();
            } else {
                person = peopleData.substring(start, end);
            }

            tempPeople[peopleCount] = person;
            peopleCount++;
            start = end + 1;
            if (start > peopleData.length()) break;
        }

        // Director is always the last person
        if (peopleCount > 0) {
            director = tempPeople[peopleCount - 1];
        }

        // Stars are all people except the last one (director)
        int starCount = Math.min(peopleCount - 1, 10);
        for (int i = 0; i < starCount; i++) {
            stars[i] = tempPeople[i];
        }
    }

    private void parseGenres(String genresData) {
        int start = 0;
        int end = 0;
        int genreCount = 0;

        // Split genres by dash
        while (end < genresData.length() && genreCount < 5) {
            end = findNextSeparator(genresData, start, '-');
            String genre = "";
            if (end == -1) {
                genre = genresData.substring(start);
                end = genresData.length();
            } else {
                genre = genresData.substring(start, end);
            }

            genres[genreCount] = genre;
            genreCount++;
            start = end + 1;
            if (start > genresData.length()) break;
        }
    }

    // method to find next separator
    private int findNextSeparator(String str, int startIndex, char separator) {
        for (int i = startIndex; i < str.length(); i++) {
            if (str.charAt(i) == separator) {
                return i;
            }
        }
        return -1; // Not found
    }

    //  method to convert String to int
    private int stringToInt(String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9') {
                result = result * 10 + (c - '0');
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
