/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rhuan
 */
public class UsuarioTest {
    
    public UsuarioTest() {
    }

    @Test
    public void testGetId() {
        System.out.println("getId");
        Usuario instance = new Usuario();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        Usuario instance = new Usuario();
        instance.setId(id);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Usuario instance = new Usuario();
        instance.setNome(nome);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetLogin() {
        System.out.println("getLogin");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getLogin();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetLogin() {
        System.out.println("setLogin");
        String login = "";
        Usuario instance = new Usuario();
        instance.setLogin(login);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetSenha() {
        System.out.println("getSenha");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getSenha();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetSenha() {
        System.out.println("setSenha");
        String senha = "";
        Usuario instance = new Usuario();
        instance.setSenha(senha);
        fail("The test case is a prototype.");
    }

    @Test
    public void testIsAtivo() {
        System.out.println("isAtivo");
        Usuario instance = new Usuario();
        boolean expResult = false;
        boolean result = instance.isAtivo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetAtivo() {
        System.out.println("setAtivo");
        boolean ativo = false;
        Usuario instance = new Usuario();
        instance.setAtivo(ativo);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetUltimo_acesso() {
        System.out.println("getUltimo_acesso");
        Usuario instance = new Usuario();
        Date expResult = null;
        Date result = instance.getUltimo_acesso();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetUltimo_acesso() {
        System.out.println("setUltimo_acesso");
        Date ultimo_acesso = null;
        Usuario instance = new Usuario();
        instance.setUltimo_acesso(ultimo_acesso);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetPerfil() {
        System.out.println("getPerfil");
        Usuario instance = new Usuario();
        Perfil expResult = null;
        Perfil result = instance.getPerfil();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetPerfil() {
        System.out.println("setPerfil");
        Perfil perfil = null;
        Usuario instance = new Usuario();
        instance.setPerfil(perfil);
        fail("The test case is a prototype.");
    }

    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Usuario instance = new Usuario();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Usuario instance = new Usuario();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
