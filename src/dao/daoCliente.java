/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexion.conexion;
import controlador.crudInterface;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.modeloCliente;

/**
 *
 * @author Juan Pablo
 */
public class daoCliente extends conexion implements crudInterface{
    
    PreparedStatement ps;
    ResultSet rs;
    Connection con;

    /**********************Query de Tables**********************/
    String sqlinsert ="insert into cliente (nombre_cliente, apellido_cliente, correo_cliente, direccion_cliente, telefono_cliente, dpi_cliente, idpuntos_cliente, nit_cliente, genero_cliente) values(?,?,?,?,?,?,?,?,?)";
    
    /***********************************************************/
    
    /******************Declaracion de modelos*******************/
    modeloCliente modelocliente = new modeloCliente();
    
    
    @Override
    public boolean agregar(Object obj) {
        
        boolean respuesta = false;
        modelocliente = (modeloCliente) obj;
        
        try{
            con = conectar();
            ps = con.prepareStatement(sqlinsert);
            
            ps.setString(1, modelocliente.getNombre_cliente());
            ps.setString(2, modelocliente.getApellido_cliente());
            ps.setString(3, modelocliente.getCorreo_cliente());
            ps.setString(4, modelocliente.getDireccion_cliente());
            ps.setString(5, modelocliente.getTel_cliente());
            ps.setString(6, modelocliente.getDpi_cliente());
            ps.setInt(7, modelocliente.getIdpuntos_cliente());
            ps.setString(8, modelocliente.getNit_cliente());
            ps.setInt(9, modelocliente.getIdgenero_cliente());
            
             if(ps.executeUpdate() == 1){
                respuesta = true;
            }
            else{
                respuesta = false;
            }
            
        }
        catch(SQLException error){
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, error);
        }
        
        finally{
            closeConection();
        }
        
        return respuesta;
    }

    
    
    @Override
    public boolean eliminar(int id) {
        return false;
    }

    @Override
    public boolean modificar(Object obj) {
       return false;
    }

    @Override
    public List mostrartodo(Object obj) {
        return null;
    }

    @Override
    public List buscar(int i) {
        return null;
    }
    
    
}
