package com.javadesignpatterns.structural.bridge;

/**
 * Created by VIRAL on 10/18/2015.
 */
public class BridgeDemo {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setClassification("Action");
        movie.setRuntime("2:15");
        movie.setTitle("John Wick");
        movie.setYear("2014");

        Formatter formatter = new PrintFormatter();
        Printer moviePrinter = new MoviePrinter(movie);
        System.out.println(moviePrinter.print(formatter));

        Formatter htmlFormatter = new HtmlFormatter();
        System.out.println(moviePrinter.print(htmlFormatter));
    }
}
