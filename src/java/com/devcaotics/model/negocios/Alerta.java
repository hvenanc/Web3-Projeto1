/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devcaotics.model.negocios;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

/**
 *
 * @author henrique
 */
@Entity
public class Alerta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int codigo;
    private long dataInsercao;
    @Lob
    private String descricaoInicial;
    private String localVistoPorUltimo;
    @Embedded
    private Doguinho doguinho;
    @ManyToOne
    private Usuario bemFeitor;
    @ManyToOne
    private Ong acolhedor;
    private long dataAcolhimento;
    @Lob
    private String descricaoAcolhimento;
    private String cuidadosVeterinarios;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public long getDataInsercao() {
        return dataInsercao;
    }

    public void setDataInsercao(long dataInsercao) {
        this.dataInsercao = dataInsercao;
    }

    public String getDescricaoInicial() {
        return descricaoInicial;
    }

    public void setDescricaoInicial(String descricaoInicial) {
        this.descricaoInicial = descricaoInicial;
    }

    public String getLocalVistoPorUltimo() {
        return localVistoPorUltimo;
    }

    public void setLocalVistoPorUltimo(String localVistoPorUltimo) {
        this.localVistoPorUltimo = localVistoPorUltimo;
    }

    public Doguinho getDoguinho() {
        return doguinho;
    }

    public void setDoguinho(Doguinho doguinho) {
        this.doguinho = doguinho;
    }

    public Usuario getBemFeitor() {
        return bemFeitor;
    }

    public void setBemFeitor(Usuario bemFeitor) {
        this.bemFeitor = bemFeitor;
    }

    public Ong getAcolhedor() {
        return acolhedor;
    }

    public void setAcolhedor(Ong acolhedor) {
        this.acolhedor = acolhedor;
    }

    

    public long getDataAcolhimento() {
        return dataAcolhimento;
    }

    public void setDataAcolhimento(long dataAcolhimento) {
        this.dataAcolhimento = dataAcolhimento;
    }

    public String getDescricaoAcolhimento() {
        return descricaoAcolhimento;
    }

    public void setDescricaoAcolhimento(String descricaoAcolhimento) {
        this.descricaoAcolhimento = descricaoAcolhimento;
    }

    public String getCuidadosVeterinarios() {
        return cuidadosVeterinarios;
    }

    public void setCuidadosVeterinarios(String cuidadosVeterinarios) {
        this.cuidadosVeterinarios = cuidadosVeterinarios;
    }
    
}
