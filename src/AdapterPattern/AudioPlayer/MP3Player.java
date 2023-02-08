package AdapterPattern.AudioPlayer;

public class MP3Player implements AudioPlayer {

    @Override
    public void playMP3(String fileName) {
        System.out.println("Playing MP3 file - " + fileName);
    }
}
