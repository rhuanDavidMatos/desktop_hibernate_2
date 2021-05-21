/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste_email;

import util.EmailTeste;
import entidade.Usuario;
import org.junit.Test;
import static org.junit.Assert.*;

import static util.UtilGerador.*;

/**
 *
 * @author rhuan
 */
public class EmailTesteTest {
    
    public EmailTesteTest() {
    }

    @Test
    public void testCriarEmailUsuarioNovo() {
        System.out.println("criarEmailUsuarioNovo");
        Usuario usuario = new Usuario(gerarNome(),"rhuan_mattos23@hotmail.com " , gerarCaracter(7));
        EmailTeste emailTeste = new EmailTeste();
        boolean enviou = emailTeste.criarEmailUsuarioNovo(usuario);
        assertTrue(enviou);
    }
    
}
