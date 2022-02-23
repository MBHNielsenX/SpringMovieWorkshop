package com.example.movieworkshop.services;
import com.example.movieworkshop.model.Movie;
import com.example.movieworkshop.repositories.MovieRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class MovieService {
    static ArrayList<Movie> listOfMovies = new ArrayList<> (MovieRepository.getMovieData());
    static Random rd = new Random();

    public static String getFirstTitle() {
        return listOfMovies.get(0).getTitle();
    }

    public static String getRandomTitle() {
        return listOfMovies.get(rd.nextInt(listOfMovies.size() + 1)).getTitle();
    }

    public static String getTenSortByPopularity() {
        ArrayList<Movie> tenMovies = new ArrayList<Movie>();
        String sortedOutput = "";

        for (int i = 0; i < 10; i++) {
            tenMovies.add(listOfMovies.get(rd.nextInt(listOfMovies.size() + 1)));
        }
        Collections.sort(tenMovies);
        for (int i = 0; i < tenMovies.size(); i++) {
            sortedOutput = sortedOutput + " " + tenMovies.get(i).toString() + "\n";

        }

        return sortedOutput;
    }

    public static int howManyWonAwards() {
        int awardCounter = 0;

        for (int i = 0; i < listOfMovies.size(); i++) {
            if (listOfMovies.get(i).hasWonAward()) {
                awardCounter++;
            }
        }
        return awardCounter;
    }



}
