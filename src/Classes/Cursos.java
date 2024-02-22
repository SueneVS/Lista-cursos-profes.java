package Classes;

public class Cursos {

    public String nomeCurso;
    public String descricao;
    public String professor;
    public int cargaHoraria;

    public void Progresso() {
        System.out.println("O progresso no curso " + nomeCurso + " com carga horária de " + cargaHoraria + " é: ");
    };
    public void Notas() {
        System.out.println("A nota no curso " + nomeCurso + " ministrado pelo professor " + professor + " foi: ");
    };
    public void Partcipacao() {
        System.out.println("A participação no curso " + nomeCurso + " com descriçaõ: " + descricao + " foi: ");
    };

}
