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
package org.openstreetmap.josm.plugins.scoutsigns.util.pref;


/**
 * Holds the preference variable identifiers. Based on these keys the plugin values are saved/loaded to/from the
 * preference file.
 *
 * @author Beata
 * @version $Revision: 151 $
 */
public final class Keys {

    static final String ERROR_SUPPRESS = "scoutsigns.error.suppress";

    static final String CLUSTER_INFO_SUPPRESS = "scoutsigns.cluster.info.suppress";
    public static final String FILTERS_CHANGED = "scoutsigns.filter.changed";
    static final String FROM = "scoutsigns.filter.from";
    static final String TO = "scoutsigns.filter.to";
    static final String STATUS = "scoutsigns.filter.status";
    static final String TYPE = "scoutsigns.filter.types";
    static final String DUPLICATE = "scoutsigns.filter.duplicate";
    static final String CONFIDENCE = "scoutsigns.filter.confidence";
    static final String APP_NAME = "scoutsigns.filter.appName";
    static final String APP_VERSION = "scoutsigns.filter.appVersion";
    static final String OS_NAME = "scoutsigns.filter.osName";
    static final String OS_VERSION = "scoutsigns.filter.osVersion";
    static final String FLT_USERNAME = "scoutsigns.filter.username";
    static final String OSM_USERNAME = "osm-server.username";

    private Keys() {}
}