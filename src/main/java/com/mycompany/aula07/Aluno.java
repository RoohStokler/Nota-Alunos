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
public class Aluno {

     String disc[] = {"Matemática", "Português", "Física", "História", "Geografia"};
    double nota[] = new double[5];

    public String atividade3() {

        for (int i = 0; i < disc.length; i++) {
            nota[i] = Double.parseDouble(JOptionPane.showInputDialog("Nota de " + disc[i]));
        }
        
        String result = "";

        for (int i = 0; i < disc.length; i++) {
            result += disc[i] + ": " + nota[i] + "\n";
        }
        return result;
    }

    public String notaAluno(int parseInt) {
        return disc + ": " + nota;
    }

}

