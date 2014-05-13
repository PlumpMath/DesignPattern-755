package adapter;

/**
 * {@code VlcPlayer} implements {@code AdvancedMediaPlayer}
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Play vlc file: " + fileName + ".");
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Vlc player cannot play mp4 file.");
    }
}
