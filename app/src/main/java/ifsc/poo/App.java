package ifsc.poo;
import edu.princeton.cs.algs4.Draw;
import javax.swing.JFrame;

public class App {
    private Draw draw;

    public App() {
        draw = new Draw();
        draw.setCanvasSize(1000, 600); // Tamanho da janela
        draw.setXscale(0, 1000); // Escala eixo X
        draw.setYscale(0, 600); // Escala eixo Y
        draw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha janela ao encerrar
    }

    public static void main(String[] args) {
        App app = new App();
        app.draw.show(); // Mostra a janela
    }
}
