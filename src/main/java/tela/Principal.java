/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author rhuan
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel_principal = new javax.swing.JPanel();
        rodape = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        painel_atalho = new javax.swing.JPanel();
        iconePesquisaChamado = new javax.swing.JButton();
        iconeNovoChamado = new javax.swing.JButton();
        iconePesquisaUsuario = new javax.swing.JButton();
        iconeNovoUsuario = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        arquivo = new javax.swing.JMenu();
        ajuda = new javax.swing.JMenuItem();
        editar = new javax.swing.JMenuItem();
        cadastro = new javax.swing.JMenu();
        novo_chamado = new javax.swing.JMenuItem();
        pesquisa_chamado = new javax.swing.JMenuItem();
        novo_usuario = new javax.swing.JMenuItem();
        pesquisa_usuario = new javax.swing.JMenuItem();
        relatorios = new javax.swing.JMenu();
        sair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema XYZ");

        rodape.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rodape.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rodape.setText("Todos os direitos reservados- Suporte Técnico (99)999999-9999");

        titulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Sistema XYZ Ltda");

        painel_atalho.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        iconePesquisaChamado.setIcon(new javax.swing.ImageIcon("C:\\Users\\rhuan\\Documents\\NetBeansProjects\\desktop_hibernate_2\\src\\main\\resources\\META-INF.imagens\\pesquisa de chamado.png")); // NOI18N
        iconePesquisaChamado.setText("SEARCH CALL");
        iconePesquisaChamado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconePesquisaChamadoMouseClicked(evt);
            }
        });

        iconeNovoChamado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF.imagens/add_call_48.png"))); // NOI18N
        iconeNovoChamado.setText("ADD CALL");
        iconeNovoChamado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconeNovoChamadoMouseClicked(evt);
            }
        });

        iconePesquisaUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF.imagens/pesquisa user.png"))); // NOI18N
        iconePesquisaUsuario.setText("SEARCH USER");
        iconePesquisaUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconePesquisaUsuarioMouseClicked(evt);
            }
        });

        iconeNovoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF.imagens/novo_user.png"))); // NOI18N
        iconeNovoUsuario.setText("ADD USER");
        iconeNovoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconeNovoUsuarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painel_atalhoLayout = new javax.swing.GroupLayout(painel_atalho);
        painel_atalho.setLayout(painel_atalhoLayout);
        painel_atalhoLayout.setHorizontalGroup(
            painel_atalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_atalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconeNovoChamado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(iconePesquisaChamado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(iconeNovoUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(iconePesquisaUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painel_atalhoLayout.setVerticalGroup(
            painel_atalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_atalhoLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(painel_atalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iconePesquisaChamado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconeNovoChamado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconeNovoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconePesquisaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(310, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painel_principalLayout = new javax.swing.GroupLayout(painel_principal);
        painel_principal.setLayout(painel_principalLayout);
        painel_principalLayout.setHorizontalGroup(
            painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rodape, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE)
            .addComponent(painel_atalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painel_principalLayout.setVerticalGroup(
            painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_principalLayout.createSequentialGroup()
                .addComponent(titulo)
                .addGap(18, 18, 18)
                .addComponent(painel_atalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rodape, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        arquivo.setMnemonic('a');
        arquivo.setText("Arquivo");

        ajuda.setText("Ajuda");
        ajuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajudaActionPerformed(evt);
            }
        });
        arquivo.add(ajuda);

        editar.setText("Editar");
        arquivo.add(editar);

        jMenuBar1.add(arquivo);

        cadastro.setMnemonic('b');
        cadastro.setText("Cadastro");

        novo_chamado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        novo_chamado.setText("Novo Chamado");
        novo_chamado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novo_chamadoActionPerformed(evt);
            }
        });
        cadastro.add(novo_chamado);

        pesquisa_chamado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        pesquisa_chamado.setText("Pesquisar Chamado");
        pesquisa_chamado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisa_chamadoActionPerformed(evt);
            }
        });
        cadastro.add(pesquisa_chamado);

        novo_usuario.setText("Novo Usuário");
        novo_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novo_usuarioActionPerformed(evt);
            }
        });
        cadastro.add(novo_usuario);

        pesquisa_usuario.setText("Pesquisar Usuário");
        cadastro.add(pesquisa_usuario);

        jMenuBar1.add(cadastro);

        relatorios.setText("Relatórios");
        jMenuBar1.add(relatorios);

        sair.setText("Sair");
        sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sairMouseClicked(evt);
            }
        });
        jMenuBar1.add(sair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void novo_chamadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novo_chamadoActionPerformed
        new CadastroChamado().setVisible(true);

    }//GEN-LAST:event_novo_chamadoActionPerformed

    private void sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairMouseClicked
        dispose();
    }//GEN-LAST:event_sairMouseClicked

    private void pesquisa_chamadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisa_chamadoActionPerformed
        new PesquisarChamado().setVisible(true);
    }//GEN-LAST:event_pesquisa_chamadoActionPerformed

    private void ajudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajudaActionPerformed
        // File file = new File("META-INF/arquivos/manual.pdf");
        File file = new File("./target/classes/META-INF/arquivos/manual.pdf");
        String absolutePath = file.getAbsolutePath();
        JOptionPane.showMessageDialog(null, absolutePath);
        try {
            
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            desktop.open(new File(absolutePath));
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_ajudaActionPerformed

    private void novo_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novo_usuarioActionPerformed
        new CadastroUsuario().setVisible(true);
    }//GEN-LAST:event_novo_usuarioActionPerformed

    private void iconePesquisaChamadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconePesquisaChamadoMouseClicked
        new PesquisarChamado().setVisible(true);
    }//GEN-LAST:event_iconePesquisaChamadoMouseClicked

    private void iconePesquisaUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconePesquisaUsuarioMouseClicked
        new PesquisaUsuario().setVisible(true);
    }//GEN-LAST:event_iconePesquisaUsuarioMouseClicked

    private void iconeNovoUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconeNovoUsuarioMouseClicked
        new CadastroUsuario().setVisible(true);
    }//GEN-LAST:event_iconeNovoUsuarioMouseClicked

    private void iconeNovoChamadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconeNovoChamadoMouseClicked
        new CadastroChamado().setVisible(true);
    }//GEN-LAST:event_iconeNovoChamadoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ajuda;
    private javax.swing.JMenu arquivo;
    private javax.swing.JMenu cadastro;
    private javax.swing.JMenuItem editar;
    private javax.swing.JButton iconeNovoChamado;
    private javax.swing.JButton iconeNovoUsuario;
    private javax.swing.JButton iconePesquisaChamado;
    private javax.swing.JButton iconePesquisaUsuario;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem novo_chamado;
    private javax.swing.JMenuItem novo_usuario;
    private javax.swing.JPanel painel_atalho;
    private javax.swing.JPanel painel_principal;
    private javax.swing.JMenuItem pesquisa_chamado;
    private javax.swing.JMenuItem pesquisa_usuario;
    private javax.swing.JMenu relatorios;
    private javax.swing.JLabel rodape;
    private javax.swing.JMenu sair;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
