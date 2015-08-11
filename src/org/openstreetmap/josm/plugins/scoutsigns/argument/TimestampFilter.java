package org.openstreetmap.josm.plugins.scoutsigns.argument;

import org.openstreetmap.josm.plugins.scoutsigns.entity.ObjectUtil;


/**
 * Timestamp filter for the search road sign method. This filter defines an interval of time in which the returned road
 * signs have been created. If any filed of this class is null then it will not be considered as a search criteria.
 *
 * @author Bea
 * @version $Revision: 137 $
 */
public class TimestampFilter {

    private final Long from;
    private final Long to;


    /**
     * Builds a new {@code TimestampFilter} with the given arguments.
     *
     * @param from the start timestamp in 'Unix time' format
     * @param to the end timestamp in 'Unix time' format
     */
    public TimestampFilter(final Long from, final Long to) {
        this.from = from;
        this.to = to;
    }


    @Override
    public boolean equals(final Object obj) {
        boolean result = false;
        if (this == obj) {
            result = true;
        } else if (obj instanceof TimestampFilter) {
            final TimestampFilter other = (TimestampFilter) obj;
            result = ObjectUtil.bothNullOrEqual(from, other.getFrom());
            result = result && ObjectUtil.bothNullOrEqual(to, other.getTo());
        }
        return result;
    }

    public Long getFrom() {
        return from;
    }

    public Long getTo() {
        return to;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ObjectUtil.hashCode(from);
        result = prime * result + ObjectUtil.hashCode(to);
        return result;
    }
}