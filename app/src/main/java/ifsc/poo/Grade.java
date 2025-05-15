package ifsc.poo;
import edu.princeton.cs.algs4.Draw;

public class Grade {
    private int x;
    private int y;

    public Grade(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void desenhar(Draw draw) {
        int celula = 40;
        draw.setPenColor(Draw.BLACK);
        draw.setPenRadius();


        for (int i = 0; i <= 10; i++) {
            draw.line(x, y + i * celula, x + 10 * celula, y + i * celula); // horizontal
            draw.line(x + i * celula, y, x + i * celula, y + 10 * celula); // vertical
        }
    }
}
