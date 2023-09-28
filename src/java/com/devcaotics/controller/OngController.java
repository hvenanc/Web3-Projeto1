/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devcaotics.controller;

import com.devcaotics.model.dao.ManagerDao;
import com.devcaotics.model.negocios.Ong;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author henrique
 */
@ManagedBean
@SessionScoped
public class OngController {
    
    private Ong ongCadastro;

    
    @PostConstruct
    public void init() {
        this.ongCadastro = new Ong();
    }
    
    public void inserir() {
        
        ManagerDao.getCurrentInstance().insert(this.ongCadastro);
        this.ongCadastro = new Ong();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Ong cadastrada com sucesso!"));
        
    }
    
     public Ong getOngCadastro() {
        return ongCadastro;
    }

    public void setOngCadastro(Ong ongCadastro) {
        this.ongCadastro = ongCadastro;
    }
    
    
}
