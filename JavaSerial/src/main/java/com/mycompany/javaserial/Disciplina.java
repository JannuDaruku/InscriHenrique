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
public class Disciplina implements Serializable {
    private static final long serialVersionUID = 1L;
    private String disciplinatabdisciplina;
    private int horasdadisciplina;
    private int iddisciplina;

    public Disciplina(String disciplinatabdisciplina, int horasdadisciplina) {
        this.disciplinatabdisciplina = disciplinatabdisciplina;
        this.horasdadisciplina = horasdadisciplina;
        this.iddisciplina = iddisciplina;
    }

    Disciplina() {
    }

    public String getDisciplinatabdisciplina() {
        return disciplinatabdisciplina;
    }

    public void setDisciplinatabdisciplina(String disciplinatabdisciplina) {
        this.disciplinatabdisciplina = disciplinatabdisciplina;
    }

    public int getHorasdadisciplina() {
        return horasdadisciplina;
    }

    public void setHorasdadisciplina(int horasdadisciplina) {
        this.horasdadisciplina = horasdadisciplina;
    }

    public int getIddisciplina() {
        return iddisciplina;
    }

    public void setIddisciplina(int iddisciplina) {
        this.iddisciplina = iddisciplina;
    }

    @Override
    public String toString() {
        return "---------------- \n ID: " + iddisciplina + "\n" + "- Disciplina: " + disciplinatabdisciplina + "\n" + "- Horas: " + horasdadisciplina + "\n";
    }
}
    
    

    