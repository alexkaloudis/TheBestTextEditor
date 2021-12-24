/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPackage;

import javax.swing.text.Element;
import javax.swing.text.LabelView;
import javax.swing.text.View;

/**
 *
 * @author kalou_000
 */
public class WrapLabelView extends LabelView {
    public WrapLabelView(Element elem) {
            super(elem);
        }
 
    @Override
        public float getMinimumSpan(int axis) {
            switch (axis) {
                case View.X_AXIS:
                    return 0;
                case View.Y_AXIS:
                    return super.getMinimumSpan(axis);
                default:
                    throw new IllegalArgumentException("Invalid axis: " + axis);
            }
        }
}
