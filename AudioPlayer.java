import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class AudioPlayer {
    // throws keyword helps to catch Exceptions as try/catch block would
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        // for audio files, search for YouTube audio library and download a file from https://studio.youtube.com/channel/UCTpgs88_9ai2lJqEXQWASaw/music
        // then convert the file from mp3 to wav format if need be since AudioInputStream class listen to wav files.

        // accepts user inputs
        Scanner scanner = new Scanner(System.in);

        // File file = new File("As You Fade Away - NEFFEX.wav");
        File file = new File("/home/jamezjaz/Downloads/Metro - Yung Logos.wav");
        // reads the file
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        // opens the wav file/clip
        clip.open(audioStream);
        // starts the clip/audio
        clip.start();
    }
}
