package model;
// Generated 12/11/2014 11:53:29 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import model.persistencia.DAOUsuario;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private Integer idUsuario;
     private Colaborador colaborador;
     private String login;
     private String senha;
     private Set caixasangrias = new HashSet(0);
     private Set caixaaberturafechamentos = new HashSet(0);
     private Set vendas = new HashSet(0);
     private Set caixasuprimentos = new HashSet(0);

    public Usuario() {
    }

	
    public Usuario(Colaborador colaborador, String login, String senha) {
        this.colaborador = colaborador;
        this.login = login;
        this.senha = senha;
    }
    public Usuario(Colaborador colaborador, String login, String senha, Set caixasangrias, Set caixaaberturafechamentos, Set vendas, Set caixasuprimentos) {
       this.colaborador = colaborador;
       this.login = login;
       this.senha = senha;
       this.caixasangrias = caixasangrias;
       this.caixaaberturafechamentos = caixaaberturafechamentos;
       this.vendas = vendas;
       this.caixasuprimentos = caixasuprimentos;
    }
   
    public Integer getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
    public Colaborador getColaborador() {
        return this.colaborador;
    }
    
    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }
    public String getLogin() {
        return this.login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    public String getSenha() {
        return this.senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public Set getCaixasangrias() {
        return this.caixasangrias;
    }
    
    public void setCaixasangrias(Set caixasangrias) {
        this.caixasangrias = caixasangrias;
    }
    public Set getCaixaaberturafechamentos() {
        return this.caixaaberturafechamentos;
    }
    
    public void setCaixaaberturafechamentos(Set caixaaberturafechamentos) {
        this.caixaaberturafechamentos = caixaaberturafechamentos;
    }
    public Set getVendas() {
        return this.vendas;
    }
    
    public void setVendas(Set vendas) {
        this.vendas = vendas;
    }
    public Set getCaixasuprimentos() {
        return this.caixasuprimentos;
    }
    
    public void setCaixasuprimentos(Set caixasuprimentos) {
        this.caixasuprimentos = caixasuprimentos;
    }


    
    public boolean validarLogin(){
    
        DAOUsuario dAOUsuario = new DAOUsuario();
        return dAOUsuario.validarLogin(this);
    }

}

