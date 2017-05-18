package Java2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by larryg on 5/18/17.
 */
public class MoviesApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the movie app.");
        app();
    }

    public static void app(){
        Input userInput = new Input();

        int menuSelect = userInput.getInt(0, 6, menu());
        switch (menuSelect){
            case 0:
                System.out.println("Have a nice day.");
                System.exit(0);
                break;
            case 1:
                System.out.println(all());
                break;
            case 2:
                System.out.println(catagoryFinder("animated"));
                break;
            case 3:
                System.out.println(catagoryFinder("drama"));
                break;
            case 4:
                System.out.println(catagoryFinder("horror"));
                break;
            case 5:
                System.out.println(catagoryFinder("scifi"));
                break;
            case 6:
                addMovie();
                break;
        }
        app();
    }


    public static String menu(){
        return "What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "6 - add a movie\n" +
                "\n" +
                "Enter your choice:";

    }

    public static String all(){
        String allMovies = "";
        for(Movie movie: MoviesArray.findAll()){
            allMovies += movie.getName() + " -- " + movie.getCategory() + "\n";
        }
        return allMovies;
    }

    public static String catagoryFinder(String catagory){
        String moviesCatagory = "";
        for(Movie movie: MoviesArray.findAll()){
            if(movie.getCategory().equals(catagory)){
                moviesCatagory += movie.getName() + " -- " + movie.getCategory() + "\n";
            }
        }
        return moviesCatagory;
    }

    public static void addMovie(){
        Input userInput = new Input();
        int length = MoviesArray.findAll().length;
        String newName = userInput.getString("What is the name of the movie?");
        String newCategory = userInput.getString("What category is the movie classified as?");
        Movie[] copy = Arrays.copyOf(MoviesArray.findAll(), length + 1);
        copy[length]= new Movie (newName, newCategory);
    }




}
