package org.openstreetmap.josm.plugins.scoutsigns.gui.details;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import javax.swing.JPanel;
import org.openstreetmap.josm.plugins.scoutsigns.util.cnf.GuiCnf;


/**
 * Defines an abstract {@code JPanel} template for displaying basic information in (information name, value) format
 * object of type T.
 *
 * @author Bea
 * @version $Revision: 137 $
 */
abstract class InfoPanel<T> extends JPanel {

    private static final long serialVersionUID = 2835853554189232179L;

    /** the minimum size of the panel */
    private static final Dimension PANEL_MIN = new Dimension(0, 50);

    /* constants used for computing GUI component dimensions */
    protected static final int LHEIGHT = 22;
    protected static final int SPACE_Y = 3;
    protected static final int RECT_X = 0;
    protected static final int RECT_Y = 0;

    /** holds GUI texts */
    private static GuiCnf guiCnf = GuiCnf.getInstance();


    static GuiCnf getGuiCnf() {
        return guiCnf;
    }


    /**
     * Builds a new {@code InfoPanel} with the given argument.
     */
    InfoPanel() {
        setBackground(Color.white);
        updateData(null);
    }

    /**
     * Creates the components of the panel with the information of the given object.
     *
     * @param obj an object of type T
     */
    abstract void createComponents(T obj);

    /**
     * Returns the maximum width for the given strings.
     *
     * @param fm the {@code FontMetrics} used for displaying the given strings
     * @param strings s list of {@code String}s
     * @return the maximum width
     */
    int getMaxWidth(final FontMetrics fm, final String... strings) {
        int width = 0;
        for (int i = 0; i < strings.length; i++) {
            width = Math.max(width, fm.stringWidth(strings[i]) + SPACE_Y);
        }
        return width;
    }

    /**
     * Updates the panel with the information of the given object.
     *
     * @param obj an object of type T
     */
    final void updateData(final T obj) {
        removeAll();
        if (obj != null) {
            setLayout(null);
            createComponents(obj);
        } else {
            setPreferredSize(PANEL_MIN);
        }
    }
}