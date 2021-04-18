/**
 * State Design Pattern
 * Code written by Alex Santoro
 */

import java.util.ArrayList;
import java.util.List;

public class NetflixState implements State {
    private TV tv;
    private List<String> movies;
    private List<String> tvShows;

    public NetflixState(TV tv) {
        this.tv = tv;

        movies = new ArrayList<String>();
        movies.add("Bad Trip");
        movies.add("Jumanji");
        movies.add("The Laundromat");
        movies.add("Over the Moon");

        tvShows = new ArrayList<String>();
        tvShows.add("Peaky Blinders");
        tvShows.add("Shameless");
        tvShows.add("Alone");
        tvShows.add("The 100");
    }

    /**
     * Press methods either change the TV state or display a message stating the TV is already in the selected state
     */
    @Override
    public void pressHomeButton() {
        System.out.println("Loading the home screen...\n");
        tv.setState(tv.getHomeState());
    }

    @Override
    public void pressNetflixButton() {
        System.out.println("We are already in Netflix\n");
    }

    @Override
    public void pressHuluButton() {
        System.out.println("Loading Hulu...\n");
        tv.setState(tv.getHuluState());
    }

    @Override
    public void pressMovieButton() {
        System.out.println("Netflix Movies:");
        showChoices(movies);
    }

    @Override
    public void pressTVButton() {
        System.out.println("Netflix TV Shows:");
        showChoices(tvShows);
    }

    /**
     * displays a list of possible choices 
     * @param choices the choices displayed
     */
    private void showChoices(List<String> choices) {
        for (String s : choices) {
            System.out.println("- " + s);
        }
        System.out.println();
    }
}