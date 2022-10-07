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
import modelo.modeloTarjetaPuntos;

/**
 *
 * @author Juan Pablo
 */
public class daoTarjetaPuntos extends conexion implements crudInterface{
    
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    
    /**********************Query de Tables**********************/
    String sqlinsert ="insert into tarjeta_puntos (dpicliente_puntos, idcajero_puntos, latitud_puntos, longitud_puntos, numero_puntos, fecha_puntos) values(?,?,?,?,?,?)";
    
    /***********************************************************/
    
    /******************Declaracion de modelos*******************/
    modeloTarjetaPuntos modelotarjeta = new modeloTarjetaPuntos();

    @Override
    public boolean agregar(Object obj) {
        
        boolean respuesta = false;
        modelotarjeta = (modeloTarjetaPuntos) obj;
        
        try{
            con = conectar();
            ps = con.prepareStatement(sqlinsert);
            
            ps.setString(1, modelotarjeta.getDpicliente_puntos());
            ps.setInt(2, modelotarjeta.getIdcajero_puntos());
            ps.setString(3, modelotarjeta.getLat_puntos());
            ps.setString(4, modelotarjeta.getLon_puntos());
            ps.setString(5, modelotarjeta.getNum_puntos());
            ps.setString(6, modelotarjeta.getFecha_puntos());
            
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
