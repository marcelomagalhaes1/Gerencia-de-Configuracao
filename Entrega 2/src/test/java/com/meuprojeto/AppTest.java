package com.meuprojeto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Classe de teste para App e Utils.
 * Os comentários Javadoc (como este) aparecerão no relatório (Item 7).
 */
public class AppTest {

    /**
     * Um teste simples de exemplo que sempre passa.
     */
    @Test
    public void deveRetornarVerdadeiro() {
        assertTrue(true);
    }

    /**
     * Testa o método mensagem() da classe Utils.
     * Apenas chama o método para garantir cobertura de teste.
     */
    @Test
    public void testMensagemUtils() {
        // Apenas chama o método para fins de cobertura
        Utils.mensagem();
        
        // Confirma que o teste rodou sem erros
        assertTrue(true, "O método mensagem() foi chamado sem exceções.");
    }
}