/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.modelo.controller;

import br.com.modelo.negocio.Marca;
import br.com.modelo.percistencia.MarcaDAO;
import br.com.modelo.percistencia.MarcaDAOJDBC;
import java.util.List;

/**
 *
 * @author cristian_macagnan
 */
public class MarcaController {
    public void inserir ( Marca m){
        MarcaDAO md  = new MarcaDAOJDBC();
        md.inserir(m);
        
    }
    public void atualizar( Marca m){
        MarcaDAO md = new MarcaDAOJDBC();
        md.atualizar(m);
    } 
    public void excluir (int id){
        MarcaDAO md = new MarcaDAOJDBC();
        md.excluir(id);
        
    }
          public List<Marca> getMarca(){
             MarcaDAO md = new MarcaDAOJDBC();
             return md.getMarcas();
             
          }
    public List<Marca> getMarcasByNome(String nome){
             MarcaDAO md = new MarcaDAOJDBC();
             return md.getMarcasByNome(nome);
             
}
 public Marca getMarcasById(int id){
             MarcaDAO md = new MarcaDAOJDBC();
             return md.getMarcasById(id);
 }
}