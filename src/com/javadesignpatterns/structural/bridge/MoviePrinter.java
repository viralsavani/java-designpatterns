package com.javadesignpatterns.structural.bridge;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by VIRAL on 10/18/2015.
 */
public class MoviePrinter extends Printer {

    private Movie movie;

    public MoviePrinter(Movie movie){
        this.movie = movie;
    }

    @Override
    protected List<Detail> getDetails() {
        List<Detail> details = new ArrayList<>();

        details.add(new Detail("Title", movie.getTitle()));
        details.add(new Detail("Runtime", movie.getRuntime()));
        details.add(new Detail("Year", movie.getYear()));

        return details;
    }

    @Override
    protected String getHeader() {
        return movie.getClassification();
    }
}
