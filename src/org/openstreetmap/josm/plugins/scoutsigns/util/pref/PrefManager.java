package org.openstreetmap.josm.plugins.scoutsigns.util.pref;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.openstreetmap.josm.Main;
import org.openstreetmap.josm.plugins.scoutsigns.argument.SearchFilter;
import org.openstreetmap.josm.plugins.scoutsigns.argument.TimestampFilter;
import org.openstreetmap.josm.plugins.scoutsigns.entity.Application;
import org.openstreetmap.josm.plugins.scoutsigns.entity.Device;
import org.openstreetmap.josm.plugins.scoutsigns.entity.Source;
import org.openstreetmap.josm.plugins.scoutsigns.entity.Status;


/**
 * Utility class, manages save and load (put & get) operations of the preference variables. The preference variables are
 * saved into a global preference file. Preference variables are static variables which can be accessed from any plugin
 * class. Values saved in this global file, can be accessed also after a JOSM restart.
 *
 * @author Beata
 * @version $Revision: 137 $
 */
public final class PrefManager {

    private static final String NULL = "null";

    private static final PrefManager UNIQUE_INSTANCE = new PrefManager();


    /**
     * Returns the unique instance of the {@code PrefManager}.
     *
     * @return a {@code PrefManager}
     */
    public static PrefManager getInstance() {
        return UNIQUE_INSTANCE;
    }

    /**
     * Loads the OSM user name from the global preference file.
     *
     * @return a {@code String}
     */
    public String loadOsmUsername() {
        final String username = Main.pref.get(Keys.OSM_USERNAME);
        return username == null ? "" : username;
    }

    /**
     * Loads the search filter from the global preference file.
     *
     * @return a {@code SearchFilter} object
     */
    public SearchFilter loadSearchFilter() {
        final Collection<String> sourceNames = Main.pref.getCollection(Keys.SOURCE);
        final List<Source> sources = new ArrayList<Source>();
        if (sourceNames != null && !sourceNames.isEmpty()) {
            for (final String name : sourceNames) {
                sources.add(Source.valueOf(name));
            }
        }
        final List<String> types = (List<String>) Main.pref.getCollection(Keys.TYPE);
        final String statusStr = Main.pref.get(Keys.STATUS);
        final String confidenceStr = Main.pref.get(Keys.CONFIDENCE);
        final String username = Main.pref.get(Keys.FLT_USERNAME);
        final String appName = Main.pref.get(Keys.APP_NAME);
        final String appVersion = Main.pref.get(Keys.APP_VERSION);
        final String osName = Main.pref.get(Keys.OS_NAME);
        final String osVersion = Main.pref.get(Keys.OS_VERSION);

        final Long from = loadLongValue(Keys.FROM);
        final Long to = loadLongValue(Keys.TO);
        final Status status = (statusStr != null && !statusStr.isEmpty()) ? Status.valueOf(statusStr) : null;
        final Long duplicate = loadLongValue(Keys.DUPLICATE);

        Short confidence;
        if (confidenceStr.isEmpty()) {
            // never set
            confidence = SearchFilter.DEF_CONFIDENCE;
        } else if (confidenceStr.equals(NULL)) {
            confidence = null;
        } else {
            confidence = Short.valueOf(confidenceStr);
        }

        return new SearchFilter(sources, new TimestampFilter(from, to), types, status, duplicate, confidence,
                new Application(appName, appVersion), new Device(osName, osVersion), username);
    }

    /**
     * Loads the suppress cluster info flag.
     *
     * @return a boolean value
     */
    public boolean loadSuppressClusterInfoFlag() {
        final String flagVal = Main.pref.get(Keys.CLUSTER_INFO_SUPPRESS);
        return flagVal.isEmpty() ? false : new Boolean(flagVal);
    }

    /**
     * Loads the suppress error flag.
     *
     * @return a boolean value
     */
    public boolean loadSupressErrorFlag() {
        return Main.pref.getBoolean(Keys.ERROR_SUPPRESS);
    }

    /**
     * Loads the suppress Mapillary info flag.
     *
     * @return a boolean value
     */
    public boolean loadSupressMapillaryInfoFlag() {
        final String flagVal = Main.pref.get(Keys.MAPILLARY_INFO_SUPPRESS);
        return flagVal.isEmpty() ? false : new Boolean(flagVal);
    }

    /**
     * Saves the "filters changed" flag in the global preference file.
     *
     * @param changed a boolean value
     */
    public void saveFiltersChangedFlag(final boolean changed) {
        Main.pref.put(Keys.FILTERS_CHANGED, "");
        Main.pref.put(Keys.FILTERS_CHANGED, "" + changed);
    }

    /**
     * Saves the OSM username in the global preference file.
     *
     * @param username a {@code String}
     */
    public void saveOsmUsername(final String username) {
        Main.pref.put(Keys.OSM_USERNAME, username);
    }

    /**
     * Saves the given search filter to the global preference file.
     *
     * @param filter the {@code SearchFilter} object
     */
    public void saveSearchFilter(final SearchFilter filter) {
        String from = "";
        String to = "";
        String status = "";
        String duplicate = "";
        String confidence = "";
        String username = "";
        String appName = "";
        String appVersion = "";
        String osName = "";
        String osVersion = "";
        Collection<String> sources = null;
        Collection<String> types = null;

        if (filter != null) {
            if (filter.getSources() != null) {
                sources = new ArrayList<>();
                for (final Source source : filter.getSources()) {
                    sources.add(source.name());
                }
            }
            if (filter.getTimestampFilter() != null) {
                final TimestampFilter tstpFilter = filter.getTimestampFilter();
                from = tstpFilter.getFrom() != null ? tstpFilter.getFrom().toString() : "";
                to = tstpFilter.getTo() != null ? tstpFilter.getTo().toString() : "";
            }
            types = filter.getTypes();
            status = filter.getStatus() != null ? filter.getStatus().name() : null;
            duplicate = filter.getDuplicateOf() != null ? filter.getDuplicateOf().toString() : null;
            confidence = filter.getConfidence() != null ? filter.getConfidence().toString() : NULL;
            username = filter.getUsername();
            if (filter.getApp() != null) {
                appName = filter.getApp().getName();
                appVersion = filter.getApp().getVersion();
            }
            if (filter.getDevice() != null) {
                osName = filter.getDevice().getOsName();
                osVersion = filter.getDevice().getOsVersion();
            }
        }
        // clear collection is no types is set
        Main.pref.putCollection(Keys.SOURCE, sources);
        Main.pref.put(Keys.FROM, from);
        Main.pref.put(Keys.TO, to);
        Main.pref.put(Keys.STATUS, status);
        Main.pref.putCollection(Keys.TYPE, types);
        Main.pref.put(Keys.DUPLICATE, duplicate);
        Main.pref.put(Keys.CONFIDENCE, confidence);
        Main.pref.put(Keys.FLT_USERNAME, username);
        Main.pref.put(Keys.APP_NAME, appName);
        Main.pref.put(Keys.APP_VERSION, appVersion);
        Main.pref.put(Keys.OS_NAME, osName);
        Main.pref.put(Keys.OS_VERSION, osVersion);
    }

    /**
     * Saves the given value to the global preference file. Based on this value an info message is displayed to the user
     * when entering the clustered view.
     *
     * @param value a boolean value
     */
    public void saveSuppressClusterInfoFlag(final boolean value) {
        Main.pref.put(Keys.CLUSTER_INFO_SUPPRESS, value);
    }

    /**
     * Saves the given value to the global preference file. Based on this value an info message is displayed to the user
     * regarding Mapillary data.
     *
     * @param value a boolean value
     */
    public void saveSuppressMapillaryInfoFlag(final boolean value) {
        Main.pref.put(Keys.MAPILLARY_INFO_SUPPRESS, value);
    }
    /**
     * Saves the given value to the global preference file. Based on this value an occurred error is shown or not to the
     * end user.
     *
     * @param value a boolean value
     */
    public void saveSupressErrorFlag(final boolean value) {
        Main.pref.put(Keys.ERROR_SUPPRESS, value);
    }

    private Long loadLongValue(final String key) {
        String valueStr = Main.pref.get(key);
        valueStr = valueStr.trim();
        return (valueStr != null && !valueStr.isEmpty()) ? Long.valueOf(valueStr) : null;
    }
}