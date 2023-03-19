
import java.util.logging.Level;
import java.util.logging.Logger;

public class Hebra extends Thread {

    private final char caracter;
    private final int veces;

    public Hebra(char c, int v) {
        this.caracter = c;
        this.veces = v;
    }

    @Override
    public void run() {
        for (int i = 0; i < veces; i++) {
            System.out.print(this.caracter + " - ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hebra.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
