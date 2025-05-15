package ifsc.poo;
import edu.princeton.cs.algs4.Draw;

public class Navio {
    private Grade grade;
    private int tamanho;
    private int linha, coluna;
    private boolean vertical;

    public Navio(Grade grade, int tamanho, int linha, int coluna, boolean vertical) {
        this.grade = grade;
        this.tamanho = tamanho;
        this.linha = linha;
        this.coluna = coluna;
        this.vertical = vertical;
    }

    public void desenhar(Draw draw) {
        int baseX = grade.getX();
        int baseY = grade.getY();
        int celula = 40;

        draw.setPenColor(Draw.BLUE);
        draw.setPenRadius();

        for (int i = 0; i < tamanho; i++) {
            int x = baseX + (coluna + (vertical ? 0 : i)) * celula;
            int y = baseY + (linha + (vertical ? i : 0)) * celula;
            draw.filledSquare(x + celula / 2, y + celula / 2, celula / 2);
        }
    }

    public static void main(String[] args) {
        Draw draw = new Draw();

        Grade gradeJogador = new Grade(50, 100);
        Grade gradeInimigo = new Grade(550, 100);

        gradeJogador.desenhar(draw);
        gradeInimigo.desenhar(draw);

        Navio navio1 = new Navio(gradeJogador, 5, 3, 2, true);
        Navio navio2 = new Navio(gradeJogador, 4, 0, 0, false);
        Navio navio3 = new Navio(gradeJogador, 3, 5, 1, true);
        Navio navio4 = new Navio(gradeJogador, 3, 7, 0, false);
        Navio navio5 = new Navio(gradeJogador, 2, 9, 3, false);

        navio1.desenhar(draw);
        navio2.desenhar(draw);
        navio3.desenhar(draw);
        navio4.desenhar(draw);
        navio5.desenhar(draw);
    }
}
