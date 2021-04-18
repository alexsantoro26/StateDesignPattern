/**
 * State Design Pattern
 * Code written by Alex Santoro
 */

public class HomeState implements State {
    private TV tv;

    public HomeState(TV tv) {
        this.tv = tv;
    }

    /**
     * Press methods either change the TV state or display a message stating the TV is already in the selected state
     */
    @Override
    public void pressHomeButton() {
        System.out.println("TV is already on the home screen\n");
    }

    @Override
    public void pressNetflixButton() {
        System.out.println("Loading Netflix...\n");
        tv.setState(tv.getNetflixState());
    }

    @Override
    public void pressHuluButton() {
        System.out.println("Loading Hulu...\n");
        tv.setState(tv.getHuluState());
    }

    @Override
    public void pressMovieButton() {
        System.out.println("You must pick an app to show movies.\n");
    }

    @Override
    public void pressTVButton() {
        System.out.println("You must pick an app to show tv shows.\n");
    }
}