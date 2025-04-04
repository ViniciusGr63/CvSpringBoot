package com.example.cv.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Curriculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Informações
    private String name;
    private String phone;
    private String loc;
    private String email;

    // Formações
    private List<String> formacoes = new ArrayList<>();

    // Objetivos
    private List<String> objetivos = new ArrayList<>();

    // Competências
    private List<String> competencias = new ArrayList<>();

    // Linguagens
    private List<String> linguagens = new ArrayList<>();

    // Projetos
    private List<String> projetos = new ArrayList<>();

    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getFormacoes() {
        return formacoes;
    }

    public void setFormacoes(List<String> formacoes) {
        this.formacoes = formacoes;
    }

    public List<String> getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(List<String> objetivos) {
        this.objetivos = objetivos;
    }

    public List<String> getCompetencias() {
        return competencias;
    }

    public void setCompetencias(List<String> competencias) {
        this.competencias = competencias;
    }

    public List<String> getLinguagens() {
        return linguagens;
    }

    public void setLinguagens(List<String> linguagens) {
        this.linguagens = linguagens;
    }

    public List<String> getProjetos() {
        return projetos;
    }

    public void setProjetos(List<String> projetos) {
        this.projetos = projetos;
    }
}
