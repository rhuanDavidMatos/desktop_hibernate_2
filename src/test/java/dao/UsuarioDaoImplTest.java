/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidade.Usuario;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Test;
import static org.junit.Assert.*;
import util.UtilGerador;

/**
 *
 * @author rhuan
 */
public class UsuarioDaoImplTest {

    private Usuario usuario;
    private UsuarioDao usuarioDao;
    private Session sessao;

    public UsuarioDaoImplTest() {
        usuarioDao = new UsuarioDaoImpl();
    }

//    @Test
    public void testSalvar() {
        System.out.println("salvar");

        usuario = new Usuario(
                UtilGerador.gerarNome(),
                UtilGerador.gerarEmail(),
                "123456",
                new Date());

        sessao = HibernateUtil.abrirConexao();
        usuarioDao.salvarOuAlterar(usuario, sessao);
        sessao.close();

        assertNotNull(usuario.getId());

    }

//    @Test
    public void testLogar() {
        System.out.println("logar");
        buscarUsuarioBd();
        sessao = HibernateUtil.abrirConexao();
        Usuario usuarioLogado = usuarioDao.logar(usuario.getLogin(), usuario.getSenha(), sessao);
        sessao.close();

        assertNotNull(usuarioLogado);
    }

//    @Test
    public void testAtualizarUltimoAcesso() {
        System.out.println("atualizarUltimoAcesso");
        buscarUsuarioBd();
        sessao = HibernateUtil.abrirConexao();
        usuarioDao.atualizarUltimoAcesso(usuario.getId(), sessao);
        sessao.close();
    }

    @Test
    public void testStatus() {
        System.out.println("alterarStatus");
        buscarUsuarioBd();
        sessao = HibernateUtil.abrirConexao();

        usuarioDao.alterarStatus(usuario.getId(), !usuario.isAtivo(), sessao);
        sessao.close();

        sessao = HibernateUtil.abrirConexao();
        Usuario usuarioAlt = usuarioDao.pesquisarPorId(usuario.getId(), sessao);
        sessao.close();

        assertNotEquals(usuarioAlt.isAtivo(), usuario.isAtivo());
    }

//    @Test
    public void testExcluir() {
        System.out.println("listaTodo");

    }

    @Test
    public void testListaTodo() {
        System.out.println("listaTodo");

    }

//    @Test
    public void testPesquisarPorNome() {
        System.out.println("pesquisarPorNome");

    }

//    @Test
    public void testPesquisarPorId() {
        System.out.println("pesquisarPorId");

    }

    public Usuario buscarUsuarioBd() {
        sessao = HibernateUtil.abrirConexao();
        Query consulta = sessao.createQuery("from Usuario");
        List<Usuario> usuarios = consulta.list();
        sessao.close();

        if (usuarios.isEmpty()) {
            testSalvar();
        } else {
            usuario = usuarios.get(0);
        }

        return usuario;
    }
}
