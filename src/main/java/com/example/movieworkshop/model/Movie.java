package com.example.movieworkshop.model;
import java.util.*;

public class Movie implements Comparable<Movie>{
    private int year;
    private int length;
    private String title;
    private String subject;
    private int popularity;
    private boolean hasWonAward;

    public Movie(int year, int length, String title, String subject, int popularity, String hasWonAward) {
        this.year = year;
        this.length = length;
        this.title = title;
        this.subject = subject;
        this.popularity = popularity;
        if (hasWonAward.equals("Yes")){
            this.hasWonAward = true;
        } else {
            this.hasWonAward = false;
        }

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public boolean hasWonAward() {
        return hasWonAward;
    }

    public void setHasWonAward(boolean hasWonAward) {
        this.hasWonAward = hasWonAward;
    }


    @Override
    public int compareTo(Movie compareMov) {
        int comparePopularity = ((Movie)compareMov).getPopularity();
        //  For Ascending order
        return this.popularity - comparePopularity;

        // For Descending order do like this
        // return compareage-this.studentage;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", popularity=" + popularity +
                '}';
    }
}
