/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.daoCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import modelo.modeloCliente;
import vista.CrearCliente;

/**
 *
 * @author Juan Pablo
 */
public class controladorCliente implements ActionListener, MouseListener, KeyListener {

    /***********Modelos, daos, contraoladores***********/
    modeloCliente modcliente = new modeloCliente();
    daoCliente daocliente = new daoCliente();
    CrearCliente vistacliente = new CrearCliente();
    
    
    public controladorCliente(modeloCliente modelocliente){
        this.vistacliente.btnguardarcliente.addActionListener(this);
    }
    
    
    public void agregar(){
        
    }
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vistacliente.btnguardarcliente){
           
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
       
    }

    @Override
    public void mouseReleased(MouseEvent e) {
         
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
       
    }
    
}
