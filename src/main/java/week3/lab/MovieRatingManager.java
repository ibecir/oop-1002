package week3.lab;

import java.util.ArrayList;

public class MovieRatingManager {
    enum MovieRating {
        G, PG, PG13, R
    }

    public static void addRating(ArrayList<MovieRating> ratings, MovieRating rating) {
        ratings.add(rating);
    }

    public static void showRatings(ArrayList<MovieRating> ratings) {
        for (MovieRating rating : ratings) {
            System.out.println("Rating: " + rating);
        }
    }

    public static void main(String[] args) {
        ArrayList<MovieRating> ratings = new ArrayList<>();
        addRating(ratings, MovieRating.G);
        addRating(ratings, MovieRating.R);
        showRatings(ratings);
    }
}