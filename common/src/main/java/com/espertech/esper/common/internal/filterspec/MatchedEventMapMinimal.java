/*
 ***************************************************************************************
 *  Copyright (C) 2006 EsperTech, Inc. All rights reserved.                            *
 *  http://www.espertech.com/esper                                                     *
 *  http://www.espertech.com                                                           *
 *  ---------------------------------------------------------------------------------- *
 *  The software in this package is published under the terms of the GPL license       *
 *  a copy of which has been included with this distribution in the license.txt file.  *
 ***************************************************************************************
 */
package com.espertech.esper.common.internal.filterspec;

public interface MatchedEventMapMinimal {
    /**
     * Returns a map containing the events where the key is the event tag string and the value is the event
     * instance.
     *
     * @return Map containing event instances
     */
    Object[] getMatchingEvents();

    MatchedEventMapMeta getMeta();
}
