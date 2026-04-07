/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class TarefaBean {
    private int id;
    private String nome;
    private StatusTarefa status;
    private String descricao;

    public TarefaBean(int id, String nome, StatusTarefa status, String descricao) {
        this.id = id;
        this.nome = nome;
        this.status = status;
        this.descricao = descricao;
    }
    
    public TarefaBean(int id, String nome, StatusTarefa status){
        this.id = id;
        this.nome = nome;
        this.status = status;
    }
    
    public enum StatusTarefa{
        CONCLUIDO,
        PENDENTE
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public StatusTarefa getStatus() {
        return status;
    }

    public void setStatus(StatusTarefa status) {
        this.status = status;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
