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
public class Curso implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nomecurso;
    private int horas;
    private String disciplina;
    private int idcurso;

    public Curso(String nomecurso, int horas, String disciplina, int idcurso) {
        this.nomecurso = nomecurso;
        this.horas = horas;
        this.disciplina = disciplina;
        this.idcurso = idcurso;
    }

    Curso() {
    }

    public String getNomecurso() {
        return nomecurso;
    }

    public void setNomecurso(String nomecurso) {
        this.nomecurso = nomecurso;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(int idcurso) {
        this.idcurso = idcurso;
    }

    @Override
    public String toString() {
        return "---------------- \n ID: " + idcurso + "\n" + "- Curso: " + nomecurso + "\n" + "- Disciplina: " + disciplina + "\n" + "- Horas: " + horas + "\n";
    }

}


