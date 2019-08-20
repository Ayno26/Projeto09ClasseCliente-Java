/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto09classecliente;

/**
 *
 * @author aluno
 */
public class Cliente {
    //Atributos que podem ser Private ou Public (modificador)
    //Por definição no Java os Atributos serão Private
    private String RG;
    private String nome;
    private String CPF;
    private String cidade;
    private String estado;
    
    //Métodos podem ser Public ou Private (modificador)
    //Por definição no Java os Métodos serão Public
    //CONSTRUTORES
    //VAZIO
    public Cliente() {
        
    }
    //CHEIO
    public Cliente(String RG, String nome, String CPF,
            String cidade, String estado) {
        this.RG = RG;
        this.nome = nome;
        this.nome = CPF;
        this.nome = cidade;
        this.nome = estado;
    }
    //GETTERS E SeTTERS
    public String getRG(){
        return this.RG;
    }
    public void setRG(String RG){
        this.RG = RG;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCPF(){
        return this.CPF;
    }
    public void setCPF(String CPF){
        this.CPF = CPF;
    }
    public String getCidade(){
        return this.cidade;
    }
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    public String getEstado(){
        return this.estado;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
}
