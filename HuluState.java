/**
 * State Design Pattern
 * Code written by Alex Santoro
 */

import java.util.ArrayList;
import java.util.List;

public class HuluState implements State {
    private TV tv;
    private List<String> movies;
    private List<String> tvShows;

    public HuluState(TV tv) {
        this.tv = tv;

        movies = new ArrayList<String>();
        movies.add("Run");
        movies.add("Unhinged");
        movies.add("The Interview");
        movies.add("King Kong");

        tvShows = new ArrayList<String>();
        tvShows.add("Lost");
        tvShows.add("Game of Thrones");
        tvShows.add("Greys Anatomy");
        tvShows.add("Stranger things");
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
        System.out.println("Loading Netflix...\n");
        tv.setState(tv.getNetflixState());
    }

    @Override
    public void pressHuluButton() {
        System.out.println("We are already in Hulu\n");
    }

    @Override
    public void pressMovieButton() {
        System.out.println("Hulu Movies:");
        showChoices(movies);
    }

    @Override
    public void pressTVButton() {
        System.out.println("Hulu TV Shows:");
        showChoices(tvShows);
    }

    /**
     * Displays a list of possible choices
     * @param choices the choices displayed
     */
    private void showChoices(List<String> choices) {
        for (String s : choices) {
            System.out.println("- " + s);
        }
        System.out.println();
    }
}