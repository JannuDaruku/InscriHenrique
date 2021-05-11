/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaserial;

import java.io.Serializable;

/**
 *
 * @author henrique2
 */
public class Inscricao implements Serializable {

    private static final long serialVersionUID = 1L;
    private int idinscricao;
    private String cursoinscricao;
    private String nomedoalunoinscricao;

    public int getIdinscricao() {
        return idinscricao;
    }

    public void setIdinscricao(int idinscricao) {
        this.idinscricao = idinscricao;
    }

    public String getCursoinscricao() {
        return cursoinscricao;
    }

    public void setCursoinscricao(String cursoinscricao) {
        this.cursoinscricao = cursoinscricao;
    }

    public String getNomedoalunoinscricao() {
        return nomedoalunoinscricao;
    }

    public void setNomedoalunoinscricao(String nomedoalunoinscricao) {
        this.nomedoalunoinscricao = nomedoalunoinscricao;
    }

    @Override
    public String toString() {
        return "---------------- \n ID: " + idinscricao + "\n" + "- Aluno: " + nomedoalunoinscricao + "\n" + "- Curso: " + cursoinscricao + "\n";
    }
}
