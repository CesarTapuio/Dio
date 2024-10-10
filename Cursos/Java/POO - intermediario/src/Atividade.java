
//- Atributos: `nome`, `duracao` (em minutos), `caloriasGastas`.

public class Atividade {

    private String nome;
    // Duração em minutos
    private int duracao;
    private float caloriasGastas;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracao() {
        return this.duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public float getCaloriasGastas() {
        return this.caloriasGastas;
    }

    public void setCaloriasGastas(float calorias) {
        this.caloriasGastas = calorias;
    }



    
}
