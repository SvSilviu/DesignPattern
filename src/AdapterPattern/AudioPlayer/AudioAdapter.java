package AdapterPattern.AudioPlayer;

public class AudioAdapter implements AudioPlayer {

    private MP3Player mp3Player = new MP3Player();

    @Override
    public void playMP3(String fileName) {
        mp3Player.playMP3(fileName);
    }

    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            playMP3(fileName);
        } else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            System.out.println("Converting - " + audioType + " to MP3........");
            System.out.println("Playing MP3 file - " + fileName);
        } else {
            System.out.println("Invalid audio format");
        }
    }


}
