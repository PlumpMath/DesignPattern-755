package template;

/**
 * Cricket game extends game template
 */
public class Cricket extends Game {
    @Override
    protected void initialize() {
        System.out.println("Cricket Game Initialized.");
    }

    @Override
    protected void startPlay() {
        System.out.println("Cricket Game Started.");
    }

    @Override
    protected void endPlay() {
        System.out.printf("Cricket Game Finished.");
    }
}
