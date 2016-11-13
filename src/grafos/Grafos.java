/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import javax.swing.JOptionPane;

/**
 *
 * @author Valdecs
 */
public class Grafos {
    public static void main(String[] args) {  
        int m[][] = {{0, 0, 0}, {0, 0, 0}};  
        int h[][] = {{0, 0, 0}, {0, 0, 0}};  
        JOptionPane.showMessageDialog(null, "Digite 1 para os vértices que estão conectados");  
        for (int linha = 0; linha < m.length; linha++) {  
            for (int coluna = 0; coluna < m[linha].length; coluna++) {  
                m[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Vértice" + coluna, linha));  
                if (m[linha][coluna] == 1) {  
                    h[linha][coluna] = m[linha][coluna];  
                }  
            }  
        }  
        for (int linha = 0; linha < m.length; linha++) {  
            for (int coluna = 0; coluna < h[linha].length; coluna++) {  
                if (h[linha][coluna] == 1) {  
                    System.out.println("Os grafos \t" + linha + coluna + "\t estão conectados");    
                }
          
            }  
            System.out.println();  
        }  
    }  
}
