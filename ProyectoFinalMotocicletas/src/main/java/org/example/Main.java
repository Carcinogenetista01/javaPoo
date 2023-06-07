package org.example;


import org.example.Driver.ControladorMotocicleta;
import org.example.Modelo.Motocicleta;
import org.example.Vista.Ventana;
import org.example.interfaz.MotocicletaDAO;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {

            URL musicURL = Main.class.getResource("/music.wav");
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(musicURL));

            clip.loop(Clip.LOOP_CONTINUOUSLY);

            Ventana view = new Ventana ("Motocicleta");
        ControladorMotocicleta controller = new ControladorMotocicleta(view);
            view.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                    clip.stop();
                }
            });
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException e) {
            e.printStackTrace();
        }
        }
    }
