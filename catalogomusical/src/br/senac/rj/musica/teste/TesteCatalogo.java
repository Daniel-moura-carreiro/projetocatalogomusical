package br.senac.rj.musica.teste;

import br.senac.rj.musica.window.JanelaConta;
import br.senac.rj.musica.modelo.Conexao;
import br.senac.rj.musica.modelo.Conta;
import br.senac.rj.musica.modelo.ContaCorrenteNormal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;
import javax.swing.WindowConstants;


public class TesteCatalogo {

			public static void apresentarMenu() {
				//Define a janela
				JFrame janelaPrincipal = new JFrame("Cadastro de conta");
				janelaPrincipal.setTitle("Gestão bancária");
				janelaPrincipal.setResizable(false);// A janela não poderá ter o tamanho ajustado
				janelaPrincipal.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
				janelaPrincipal.setSize(400,300); //Define tamanho da janela
				UIManager.put("OptionPane.yesButtonText", "Sim");
				UIManager.put("OptionPane.noButtonText", "Não");
				
				//Cria uma barra de menu para janela principal
				JMenuBar menuBar = new JMenuBar();
				
				//Adiciona a barra de menu ao frame
				janelaPrincipal.setJMenuBar(menuBar);
				
				//Define e adcioa menu na barra de menu
				JMenu menuAtualizar = new JMenu("Atualizar");
				menuBar.add(menuAtualizar);
				
				//Cria e adiciona um item simples para o menu
				JMenuItem menuConta = new JMenuItem("Conta");
				menuAtualizar.add(menuConta);
				
				//Cria a janela de atualização da conta
				JFrame janelaConta = JanelaConta.criarJanelaConta();
				
				//Adiciona ação para o item menu
				menuConta.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						janelaConta.setVisible(true);
					}
				});
				janelaPrincipal.setVisible(true);
				
			}
			
			public static void main(String[] args) {
				apresentarMenu();
			}
	}

