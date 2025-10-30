public class Cordenador extends Funcionario {
    private String equipe;
    private String setor;
    public Coordenador( String nome, Int Idade, double salario, String equipe, String setor) {
        super(nome, idade, salario);
        this.equipe = equipe;
        this.setor = setor;
    }
    public String getEquipe() {
        return equipe;
    }
    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }
    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    @Override
    public void exibirinformacoes() {
        System.out.println(getNome() + "Setor " + setor + ".");
    }
    public void liderar() {
        System.out.println(getNome() + " está liderando." )
    }