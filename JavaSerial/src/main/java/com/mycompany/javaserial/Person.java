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
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    private String pais = "ITALY";
    private int ano;
    private String nome;
    private int altura;
    private int id;

    public Person(int ano, String nome, int altura, int id, String pais) {
        this.ano = ano;
        this.nome = nome;
        this.altura = altura;
        this.id = id;
        this.pais = pais;
    }

    Person() {
    }

    // getters and setters

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "---------------- \n ID: " + id + "\n" + "- Nome: " + nome + "\n" + "- País: " + pais + "\n" + "- Altura: " + altura + "\n" + "- Ano Nascimento: " + ano + "\n";
    }
}

   
