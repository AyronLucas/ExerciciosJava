
public class Robo {

    public int codigo;
    public String nome;
    public int ataque;
    public int defesa;
    public int energiaAtual;
    public int vitorias;
    public int derrotas;
    public int pontos;
    public int combate;

    Robo(int codigo, String nome, int ataque, int defesa) {
        this.codigo = codigo;
        this.nome = nome;
        this.ataque = ataque;
        this.defesa = defesa;
        this.energiaAtual = 100;
        this.vitorias = 0;
        this.derrotas = 0;
        this.pontos = 0;
        this.combate = 0;
    }

    public void receberDano(int dano) {
        energiaAtual = energiaAtual - dano;

        if (energiaAtual < 0) {
            energiaAtual = 0;
        }
    }

    public void registrarVitoria() {
        vitorias = vitorias + 1;
        pontos = pontos + 3;
    }

    public void registrarDerrota() {
        derrotas = derrotas + 1;
    }

    public void registrarEmpate() {
        pontos = pontos + 1;
        combate = combate + 1;
    }

}
