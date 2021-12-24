/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPackage;

import javax.swing.text.StyledEditorKit;
import javax.swing.text.ViewFactory;

/**
 *
 * @author kalou_000
 */
public class WrapEditorKit extends StyledEditorKit {
    ViewFactory defaultFactory=new WrapColumnFactory();
    @Override
        public ViewFactory getViewFactory() {
            return defaultFactory;
        }
}
