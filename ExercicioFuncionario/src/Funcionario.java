public class Funcionario {

    private Sting nome;
    private int idade;
    private double salario;

    public Funcionario(String nome, String idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
     }
     public String getNome() {
        return nome;
     }
     public void setNome(String nome) {
        this.nome = nome;
     }
     public String getIdade() {
        return idade;
     }
     public void setIdade(String idade) {
            this.idade = idade;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void exibirInformaçoes() {
        Sistem.out.println("Nome " + nome);
        Sistem.out.println("Idade " + idade);
        System.out.println("Salário " + salario);
     }
     public void trabalhar() { 
        System.out.println ("Está trabalhando.");
     }
     }
    
