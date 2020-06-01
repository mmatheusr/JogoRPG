package music;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

public class Music {
    
    private URL urlBackground;
    private URL urlreplace;
    private AudioClip audioBackground;
    private AudioClip audioReplace;
    
    public Music(){
        urlBackground = getClass().getResource("/music/musica.wav");
        urlreplace = getClass().getResource("/music/troca.wav");
        audioBackground = Applet.newAudioClip(urlBackground);
        audioReplace = Applet.newAudioClip(urlreplace);
    }
    
    public void background(){
        audioBackground.play();
    }
    
    public void replace(){
        audioReplace.play();
    }   
}