/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.modelo.negocio;

/**
 *
 * @author cristian_macagnan
 */
public class Automovel {
    int id;
    int anofabricacao;
    int anomodelo;
    String observacoes;
    double preco;
    private int quilometragem;
    private Modelo modelo;

    public Automovel(){
            
    }     
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnofabricacao() {
        return anofabricacao;
    }

    public void setAnofabricacao(int anofabricacao) {
        this.anofabricacao = anofabricacao;
    }

    public int getAnomodelo() {
        return anomodelo;
    }

    public void setAnomodelo(int anomodelo) {
        this.anomodelo = anomodelo;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
    
    
}
