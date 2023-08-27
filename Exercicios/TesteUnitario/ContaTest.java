

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste ContaTest.
 *
 * @author  (seu nome)
 * @version (um número da versão ou uma data)
 */
public class ContaTest
{
    /**
     * Construtor default para a classe de teste ContaTest
     */
    public ContaTest()
    {
    }

    /**
     * Define a 'fixture' do teste.
     *
     * Chamado antes de cada método de caso de teste.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Desfaz a 'fixture' do teste.
     *
     * Chamado após cada método de teste de caso.
     */
    @AfterEach
    public void tearDown()
    {
    }


    @Test
    public void conta()
    {
        Conta conta1 = new Conta(10, 1);
        conta1.depositar(28);
        assertEquals(1, conta1.getNumeroConta());
        assertEquals(1, conta1.getSaldo(), 0.1);
        assertEquals(1, conta1.getSaldo(), 0.1);
        conta1.sacar(8);
        assertEquals(1, conta1.toString());
        conta1.depositar(2);
    }

    @Test
    public void contaAllTests()
    {
        Conta conta1 = new Conta(20, 1);
        Conta conta2 = new Conta(10, 2);
        conta1.depositar(18);
        assertEquals(1, conta1.getNumeroConta());
        assertEquals(38, conta1.getSaldo(), 0.1);
        conta1.sacar(8);
        assertNotSame(1, conta1.toString());
        conta1.transferir(conta2, 5);
    }
}












