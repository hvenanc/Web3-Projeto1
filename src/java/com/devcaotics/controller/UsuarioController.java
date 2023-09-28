/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devcaotics.controller;

import com.devcaotics.model.dao.ManagerDao;
import com.devcaotics.model.negocios.Usuario;
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
public class UsuarioController {
    
    private Usuario usuarioCadastro;
    
    @PostConstruct
    public void init() {
        this.usuarioCadastro = new Usuario();
        
        
    }
    
    public void inserir(String confirmacao) {
        
        if(!this.usuarioCadastro.getSenha().equals(confirmacao)) {
            FacesContext.getCurrentInstance().addMessage("formCadUsuario:txtSenha", 
                    new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro", "As senhas não batem!"));
            return;
        }
        
        ManagerDao.getCurrentInstance().insert(this.usuarioCadastro);
        this.usuarioCadastro = new Usuario();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Usuário Cadastrado com Sucesso!"));
    }

    public Usuario getUsuarioCadastro() {
        return usuarioCadastro;
    }

    public void setUsuarioCadastro(Usuario usuarioCadastro) {
        this.usuarioCadastro = usuarioCadastro;
    }
    
    
    
    
    
}
