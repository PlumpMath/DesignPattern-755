package adapter;

/**
 * {@code MediaAdapter} implements {@code MediaPlayer}. This class works as a bridge between {@code MediaPlayer}
 * interface and {@code AdvancedMediaPlayer} interface.
 */
public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(MediaTypes audioType) {
        switch (audioType) {
            case VLC:
                advancedMediaPlayer = new VlcPlayer();
                break;
            case MP4:
                advancedMediaPlayer = new Mp4Player();
                break;
            default:
                throw new AssertionError("Invalid media type.");
        }
    }

    @Override
    public void play(MediaTypes audioType, String filename) {
        switch (audioType) {
            case VLC:
                advancedMediaPlayer.playVlc(filename);
                break;
            case MP4:
                advancedMediaPlayer.playMp4(filename);
                break;
        }
    }
}
