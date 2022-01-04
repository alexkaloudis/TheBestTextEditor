/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPackage;

import java.awt.Color;
import javax.swing.text.DefaultHighlighter;

/**
 *
 * @author kalou_000
 */
public class MyHighlightPainter extends DefaultHighlighter.DefaultHighlightPainter {

    public MyHighlightPainter(Color c) {
        super(c);
    }
    
}
