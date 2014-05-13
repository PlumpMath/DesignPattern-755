package adapter;

/**
 * {@code AudioPlayer} only supports mp3 media type.
 */
public class AudioPlayer implements MediaPlayer{

    private MediaAdapter mediaAdapter;

    @Override
    public void play(MediaTypes audioType, String filename) {
        switch (audioType) {
            case MP3:
                System.out.println("Playing mp3 file: " + filename + ".");
                break;
            default:
                mediaAdapter = new MediaAdapter(audioType);
                mediaAdapter.play(audioType, filename);
        }
    }
}
