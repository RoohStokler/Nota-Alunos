/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula07;

import javax.swing.JOptionPane;

/**
 *
 * @author Stokler
 */
public class Principal {

    public static void main(String[] args) {
 
        Aluno a = new Aluno();

        a.atividade1();
        JOptionPane.showMessageDialog(null, a.atividade1());
        JOptionPane.showMessageDialog(null, a.notaAluno(Integer.parseInt(JOptionPane.showInputDialog("Digite o código"))));

    }

}
