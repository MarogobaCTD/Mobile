package main.java;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public interface Acao {

    void Tocar() throws LineUnavailableException, UnsupportedAudioFileException, IOException;
    void Contar();
    void Mover() throws Exception;
    void Pintar();

}
