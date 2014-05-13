package adapter;

/**
 * {@code Mp4} implements {@code AdvancedMediaPlayer}
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Mp4 player cannot play vlc file.");
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file: " + fileName + ".");
    }
}
