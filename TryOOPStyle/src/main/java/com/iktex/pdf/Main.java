package com.iktex.pdf;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 *
 * @author teyyub , 3:05:56 PM
 */
public class Main {

    public static void main(String[] args) {
        try {
            PDF pdf =new PDF();
            String context = pdf.text();
            System.out.println(context);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
