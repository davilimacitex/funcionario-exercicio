public class Main {
    public static void main (String[] args) {
        Professor prof = new Professor("Ana Maria", 67, 25000,"Estatística", 20, 200);
        Cordenador cord = new Cordenador("João", 42, 4000, "Atecubanos", "B" );
        Seguranca seg = new Seguranca("Agebaldo", 30, 2000, "Frontal", false );

        prof.trabalhar();
        cord.trabalhar();
        seg.trabalhar();

        prof.corrigirProva();
        cord.liderar();
        seg.vigiar();

    }
}
