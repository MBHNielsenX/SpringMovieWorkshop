package com.example.movieworkshop.repositories;

import com.example.movieworkshop.model.Movie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MovieRepository {
    public static ArrayList<Movie> getMovieData() {
        ArrayList<Movie> movieList = new ArrayList<Movie>();
        File movieFile = new File("src/main/resources/imdb-data.csv");
        try {
            Scanner sc = new Scanner(movieFile);
            sc.nextLine();
            while (sc.hasNextLine()){
                String movieDetails = sc.nextLine();
                String[] stringAsArray = movieDetails.split(";");
                int year = Integer.parseInt(stringAsArray[0]);
                int length = Integer.parseInt(stringAsArray[1]);
                String title = stringAsArray[2];
                String subject = stringAsArray[3];
                int popularity = Integer.parseInt(stringAsArray[4]);
                String awards = stringAsArray[5];

                Movie movie = new Movie(year,length,title,subject,popularity,awards);
                movieList.add(movie);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return movieList;
    }
}
