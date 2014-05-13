package adapter;

/**
 * Demonstrate adapter pattern
 */
public class Demo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play(MediaTypes.MP3, "bang bang.mp3");
        audioPlayer.play(MediaTypes.MP4, "scientist.mp4");
        audioPlayer.play(MediaTypes.VLC, "hero.vlc");
    }
}
