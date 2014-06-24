/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg4rorders;

import static com.sun.javafx.tk.Toolkit.getToolkit;
import java.awt.Image;
import java.awt.List;
import java.awt.Toolkit;
import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.ListModel;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Graph g = new Graph();
        MainFrame g = new MainFrame();
        Image icon = Toolkit.getDefaultToolkit().getImage("C:/Users/Admin/Desktop/Giacomo/4ricon.png");
        g.setIconImage(icon);
        g.setTitle("4r App - Orders");
        g.setVisible(true);
        
    }
    
    public void Graph() {
        
        Graph g = new Graph();
        
        JComboBox combo = new JComboBox();
        JButton button = new JButton();
      
        g.add(combo);
        

    }


    
    
}

 /*File folder = new File("C:/Users/Admin/Documents/ordini/");
	File[] listOfFiles = folder.listFiles();
        
        for (int i=0;i < listOfFiles.length; i++) {
            
            String element = listOfFiles[i].toString();
            
            element = element.substring(element.lastIndexOf("i")+2,element.indexOf("."));
            System.out.println(element);
            
        }*/