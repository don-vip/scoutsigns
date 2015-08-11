package org.openstreetmap.josm.plugins.scoutsigns.observer;


/**
 * The observable interface for the {@code TripViewObserver} object.
 *
 * @author Beata
 * @version $Revision: 137 $
 */
public interface TripViewObservable {

    /**
     * Notifier the registered observers.
     *
     * @param enterView if true then the trip of the selected road sign will be displayed; if false then the road signs
     * from the current view will be displayed
     */
    void notifyObserver(boolean enterView);

    /**
     * Registers the given observer.
     *
     * @param observer a {@code TripViewObserver}
     */
    void registerObserver(TripViewObserver observer);
}