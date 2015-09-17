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
package org.openstreetmap.josm.plugins.scoutsigns.entity;

import java.util.Arrays;
import java.util.List;


/**
 * Defines the road sign status entity.
 *
 * @author Beata
 * @version $Revision: 138 $
 */
public enum Status {

    OPEN, SOLVED, DUPLICATE, INVALID;

    public static final List<Status> VALUES_LIST = Arrays.asList(values());
}