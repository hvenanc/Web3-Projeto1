/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devcaotics.controller;

import com.devcaotics.model.dao.ManagerDao;
import com.devcaotics.model.negocios.Ong;
import java.util.List;
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
    private Ong selection;

    
    @PostConstruct
    public void init() {
        this.ongCadastro = new Ong();
    }
    
    public void inserir() {
        
        ManagerDao.getCurrentInstance().insert(this.ongCadastro);
        this.ongCadastro = new Ong();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Ong cadastrada com sucesso!"));
        
    }
    
    public List<Ong> readOngs() {
        List<Ong> ongs = null;
        
        ongs = ManagerDao.getCurrentInstance()
                .read("select o  from Ong o", Ong.class);
        
        return ongs;
        
    }
    
    public void deletar() {
        
        ManagerDao.getCurrentInstance().delete(this.selection);
        FacesContext.getCurrentInstance().
                addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso", "Ong deletada com Sucesso!"));
    }
    
     public Ong getOngCadastro() {
        return ongCadastro;
    }

    public void setOngCadastro(Ong ongCadastro) {
        this.ongCadastro = ongCadastro;
    }

    public Ong getSelection() {
        return selection;
    }

    public void setSelection(Ong selection) {
        this.selection = selection;
    }
    
    
    
}
