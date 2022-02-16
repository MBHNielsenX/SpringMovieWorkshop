package com.example.movieworkshop.services;
import com.example.movieworkshop.model.Movie;
import com.example.movieworkshop.repositories.MovieRepository;

import java.util.ArrayList;
import java.util.Random;


public class MovieService {
    static ArrayList<Movie> listOfMovies = new ArrayList<> (MovieRepository.getMovieData());


    public static String getFirstTitle() {

        return listOfMovies.get(0).getTitle();
    }

    public static String getRandomTitle() {
        Random rd = new Random();

        return listOfMovies.get(rd.nextInt(listOfMovies.size() + 1)).getTitle();
    }

}
