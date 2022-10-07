/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.daoTarjetaPuntos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import modelo.modeloTarjetaPuntos;
import vista.CrearTarjetaPts;

/**
 *
 * @author Juan Pablo
 */
public class controladorTarjetaPuntos implements ActionListener, MouseListener, KeyListener{
    
    /***********Modelos, daos, contraoladores***********/
    modeloTarjetaPuntos modtarjeta = new modeloTarjetaPuntos();
    daoTarjetaPuntos daotarjeta = new daoTarjetaPuntos();
    CrearTarjetaPts vistatarjeta = new CrearTarjetaPts();
    
    public controladorTarjetaPuntos(modeloTarjetaPuntos modtarjeta){
        this.vistatarjeta.btnguardartarjeta.addActionListener(this);
    }
    
    public void agregar(){
       
    }
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vistatarjeta.btnguardartarjeta){
           
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
