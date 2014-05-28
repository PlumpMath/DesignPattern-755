package template;

/**
 * Football game extends game template
 */
public class Football extends Game {

    @Override
    protected void initialize() {
        System.out.println("Football Game Initialized.");
    }

    @Override
    protected void startPlay() {
        System.out.printf("Football Game Started.");
    }

    @Override
    protected void endPlay() {
        System.out.println("Football Game Finished.");
    }
}
