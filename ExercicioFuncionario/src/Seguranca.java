public class Seguranca {
    private String setor;
    private boolean armado;

    public Seguranca(String nome, int idade, double salario, String setor, boolean armado) {
        super(nome, idade, salario);
        this.setor = setor;
        this.armado = armado;
    }
    public String getSetor() {
        return setor;
    }
    public void setArmado(boolean armado) {
        this.armado = armado;
    }
    @Override
    public void trabalhar() {
        System.out.println(getNome() + " está vigiando o setor " + setor ".");
    }
    public void armar() {
        System.out.println(getNome() + " está vigiando armado o setor " + setor ".");
    }
    public void vigiar() {
        System.out.println(getNome()+ "está vigiando.");
    }

}
