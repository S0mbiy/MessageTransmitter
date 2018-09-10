package messagetransmitter;

import java.io.File;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class VentanaTablero extends JFrame {

    public VentanaTablero() {
        super("Damas Inglesas");
        final JFXPanel fxPanel = new JFXPanel();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.add(new Panel(this));
        this.pack();
        this.setVisible(true);
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        VentanaTablero ven = new VentanaTablero();
        ven.Play();
    }

    private static String hexConv(String hex) {
        String str = "";
        for (int i = 0; i < hex.length(); i += 2) {
            String tmp = hex.substring(i, i + 2);
            str = str + (char) Integer.parseInt(tmp, 16);
        }
        return str;
    }

    private void Play() {
        String path = "C:\\Users\\Sergio Alvarado\\Documents\\Tec\\Videojuegos\\SourceressAcademy (2)\\Assets\\Audio\\backMusicSound.mp3";
        Media hit = new Media(new File(path).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(hit);
        mediaPlayer.play();
    }
}
