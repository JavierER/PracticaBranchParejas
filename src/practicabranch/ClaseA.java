/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicabranch;

import javax.swing.JOptionPane;

/**
 *
 * @author Javii
 */
public class ClaseA {
    public void aux_metodo1(){
        System.out.println("Commit en branch devB");
    }
    public void aux_metodo2(){
        int nota;
       nota= Integer.parseInt(JOptionPane.showInputDialog("Introduce nota :"));
       JOptionPane.showMessageDialog(null,"La nota es de "+nota);
    }
}
