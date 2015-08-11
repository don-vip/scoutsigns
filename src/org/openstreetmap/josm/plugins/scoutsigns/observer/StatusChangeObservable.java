package org.openstreetmap.josm.plugins.scoutsigns.observer;

import org.openstreetmap.josm.plugins.scoutsigns.entity.Status;


/**
 * The observable interface for the {@code StatusChangeObserver} object.
 *
 * @author Beata
 * @version $Revision: 137 $
 */
public interface StatusChangeObservable {

    /**
     * Notifies the registered observer.
     *
     * @param username the user's OSM username
     * @param text a comment justifying the user's action
     * @param status the road sign's new {@code Status}
     * @param duplicateOf the identifier of the road signs who's duplicate is the selected road sign
     */
    void notifyObserver(String username, String text, Status status, Long duplicateOf);

    /**
     * Registers the given observer.
     *
     * @param observer a {@code StatusChangeObserver}
     */
    void registerObserver(StatusChangeObserver observer);
}