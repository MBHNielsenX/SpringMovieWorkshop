package com.example.movieworkshop.controllers;

import com.example.movieworkshop.model.Movie;
import com.example.movieworkshop.services.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class MovieController {

    @GetMapping("/")
    public static String index () {
        return "<h1> Welcome to my movie sorting website </h1>";
    }

    @GetMapping("/getFirst")
    public static String first () {
        return "The title of the first movie is: " + MovieService.getFirstTitle() ;
    }

    @GetMapping("/getRandom")
    public static String rand () {
        return "Here is a random movie title: " + MovieService.getRandomTitle();
    }

    @GetMapping("/getTenSortByPopularity")
    public String ten () {
        return "Here are the ten movies sorted by popularity: " + "\n" + MovieService.getTenSortByPopularity();
    }


}
