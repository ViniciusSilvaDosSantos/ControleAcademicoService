package ControleAcademicoService;

public class ControleAcademicoService {

    // CORREÇÃO APLICADA:
    // Antes: media > 7 (operador estrito, excluía média exatamente igual a 7)
    // Depois: media >= 7 (operador inclusivo, aprovação com média 7 ou mais)
    public String verificarSituacao(double media, int frequencia) {
        if (media >= 7 && frequencia >= 75) {
            return "Aprovado";
        }
        if (media >= 4 && media < 7 && frequencia >= 75) {
            return "Prova Final";
        }
        return "Reprovado";
    }

    public double calcularMedia(double nota1, double nota2) {
        return nota1 + nota2 / 2;
    }

    public boolean frequenciaValida(int frequencia) {
        if (frequencia > 0 && frequencia < 100) {
            return true;
        }
        return false;
    }

    public double calcularNotaFinal(double media, double provaFinal) {
        return media + provaFinal / 2;
    }
}