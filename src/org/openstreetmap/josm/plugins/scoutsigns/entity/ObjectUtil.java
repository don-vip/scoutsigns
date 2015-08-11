package org.openstreetmap.josm.plugins.scoutsigns.entity;


/**
 * Utility class provides helper methods used by the entities.
 *
 * @author Bea
 * @version $Revision: 137 $
 */
public final class ObjectUtil {

    /**
     * Verifies if the given objects are both null or equals.
     *
     * @param obj1 the first object to be compared
     * @param obj2 the second object to be compared
     * @return true if both objects are null, or equals; false otherwise
     */
    public static boolean bothNullOrEqual(final Object obj1, final Object obj2) {
        return (obj1 == null && obj2 == null) || (obj1 != null && obj1.equals(obj2));
    }


    /**
     * Computes the hashCode of the given object. If the object is null, the method returns 0.
     *
     * @param obj an object
     * @return an integer value.
     */
    public static int hashCode(final Object obj) {
        return (obj == null) ? 0 : obj.hashCode();
    }

    private ObjectUtil() {}
}
