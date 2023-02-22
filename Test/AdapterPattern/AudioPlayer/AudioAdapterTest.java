package AdapterPattern.AudioPlayer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AudioAdapterTest {

    @Test
    void test(){

        AudioPlayer audioPlayer = new AudioAdapter();
        AudioAdapter audioAdapter = new AudioAdapter();

        audioPlayer.playMP3("Metallica - Nothing Else Matters.mp3");
        audioAdapter.play("vlc","file2.vlc");

    }

}