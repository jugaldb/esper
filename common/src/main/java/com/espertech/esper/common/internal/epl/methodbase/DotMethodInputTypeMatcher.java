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
package com.espertech.esper.common.internal.epl.methodbase;

public interface DotMethodInputTypeMatcher {

    public static DotMethodInputTypeMatcher DEFAULT_ALL = new DotMethodInputTypeMatcher() {
        public boolean matches(DotMethodFP footprint) {
            return true;
        }
    };

    boolean matches(DotMethodFP footprint);
}
