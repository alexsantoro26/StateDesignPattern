
/**
 * State Design Pattern
 * Code written by Alex Santoro
 */

public class TV {
    private State state;
    private State homeState;
    private State netflixState;
    private State huluState;

    /**
     * Default Constructor
     */
    public TV() {
        homeState = new HomeState(this);
        netflixState = new NetflixState(this);
        huluState = new HuluState(this);

        state = homeState;
    }

    /**
     * Sets the state of the TV
     * @param state the state called
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * Getters for States associated with the TV
     */
    public State getHomeState(){
        return homeState;
    }

    public State getNetflixState() {
        return netflixState;
    }

    public State getHuluState() {
        return huluState;
    }

    /**
     * Press method that calls the home button
     */
    public void pressHomeButton() {
        state.pressHomeButton();
    }

    /**
     * Press method that calls the Netflix button
     */
    public void pressNetflixButton() {
        state.pressNetflixButton();
    }

    /**
     * Press method that calls the Hulu button
     */
    public void pressHuluButton() {
        state.pressHuluButton();
    }

    /**
     * Press method that calls the movie button
     */
    public void pressMovieButton() {
        state.pressMovieButton();
    }

    /**
     * Press method that calls the TV button
     */
    public void pressTVButton() {
        state.pressTVButton();
    }
}