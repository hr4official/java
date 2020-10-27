/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.HeadlessException;

/**
 *
 * @author APMS
 */
public class AppletProgramme extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        setBackground(Color.CYAN);
        setForeground(Color.GRAY);
        // TODO start asynchronous download of heavy resources
    }

    public AppletProgramme() throws HeadlessException {
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        g.drawRect(300, 100, 100, 100);
       g.fillRect(350, 120, 100, 100);
       
       g.drawString("hello its applet", 100, 200);
       
    }

    // TODO overwrite start(), stop() and destroy() methods
   
}
