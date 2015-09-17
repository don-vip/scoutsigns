/*
 *  Copyright 2015 Telenav, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package org.openstreetmap.josm.plugins.scoutsigns.gui;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JDialog;


/**
 * This action is invoked whenever a "Cancel" button is pressed in the in a {@code JDialog} window. As a result of this
 * action the opened dialog window will be closed.
 *
 * @author Beata
 * @version $Revision: 138 $
 */
public class CancelAction extends AbstractAction {

    private static final long serialVersionUID = -4876674356093168294L;

    private final JDialog dialog;


    /**
     * Builds a {@code CancelAction} with the given argument.
     *
     * @param dialog the dialog window for which this action is registered
     */
    public CancelAction(final JDialog dialog) {
        this.dialog = dialog;
    }


    @Override
    public void actionPerformed(final ActionEvent event) {
        if (event != null) {
            dialog.dispose();
        }
    }
}