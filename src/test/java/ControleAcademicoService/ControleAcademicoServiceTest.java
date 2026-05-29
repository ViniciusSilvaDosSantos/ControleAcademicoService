package ControleAcademicoService;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ControleAcademicoServiceTest {

    private ControleAcademicoService service;

    @Before
    public void setUp() {
        service = new ControleAcademicoService();
    }

    // TESTES DO CHAMADO 1 — verificarSituacao()
    // Teste 1: aluno com média exatamente 7 e frequência exatamente 75 deve ser Aprovado
    // ESTE ERA O TESTE QUE FALHAVA ANTES DA CORREÇÃO (media > 7 não incluía média = 7)
    @Test
    public void testAprovacaoComMediaExatamente7EFrequenciaExatamente75() {
        String resultado = service.verificarSituacao(7.0, 75);
        assertEquals("Aluno com média 7.0 e frequência 75% deve ser Aprovado.",
                "Aprovado", resultado);
    }

    // Teste 2: aluno com média acima de 7 e frequência acima de 75 deve ser Aprovado
    @Test
    public void testAprovacaoComMediaAcimaDe7EFrequenciaAcimaDe75() {
        String resultado = service.verificarSituacao(8.5, 90);
        assertEquals("Aluno com média 8.5 e frequência 90% deve ser Aprovado.",
                "Aprovado", resultado);
    }

    // Teste 3: aluno com média entre 4 e 7 e frequência >= 75 vai a Prova Final
    @Test
    public void testProvaFinalComMediaEntre4E7() {
        String resultado = service.verificarSituacao(5.0, 80);
        assertEquals("Aluno com média 5.0 e frequência 80% deve ir a Prova Final.",
                "Prova Final", resultado);
    }

    // Teste 4 (NOVO — criado pelo aluno): média 7 mas frequência abaixo de 75 → Reprovado
    @Test
    public void testReprovadoPorFrequenciaInsuficienteComMedia7() {
        String resultado = service.verificarSituacao(7.0, 70);
        assertEquals("Aluno com média 7.0 mas frequência 70% deve ser Reprovado.",
                "Reprovado", resultado);
    }

    // Teste 5: média abaixo de 4 → Reprovado independente da frequência
    @Test
    public void testReprovadoPorMediaInsuficiente() {
        String resultado = service.verificarSituacao(3.0, 90);
        assertEquals("Aluno com média 3.0 deve ser Reprovado mesmo com boa frequência.",
                "Reprovado", resultado);
    }
}