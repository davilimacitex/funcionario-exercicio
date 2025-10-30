public class Professor extends Funcionario {
   private String disciplina;
private int aulasSemana;
  private int alunos;

  Professor(String nome, int idade, double salario, String disciplina, int alasSemana, int alunos) {
    super(nome, idade, salario);
    this.disciplina = disciplina;
    this.aulasSemana = aulasSemana;
    this alunos= alunos;
  }
public String getDisciplina() {
    return disciplina;
}
public void setDisciplina(String disciplina){
    this.disciplina = disciplina;
}
public int getAulasSemana() {
    return aulasSemana;
}
public void setAulasSemana(int aulasSemana) {
    this.aulasSemana = aulasSemana;
}
public int getAlunos() {
    return alunos;
}
public void setAlunos(int alunos) {
    this.alunos = alunos;
}
@Override
public void trabalhar() {
    System.out.println(getNome() + "Está dando aulas de " + discplina + ".");
}
public void corrigirProva() {
    System.out.println(getNome() + "Está corrigindo prova.");
}
public void prepararAula(){
    System.out.println(getNome() + "Está preparando aula.");
}
