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
package com.espertech.esper.common.internal.context.mgr;

import java.util.HashSet;
import java.util.Set;

public class ContextPartitionVisitorAgentInstanceId implements ContextPartitionVisitor {
    private final int numLevels;
    private final Set<Integer> ids = new HashSet<>();

    public ContextPartitionVisitorAgentInstanceId(int numLevels) {
        this.numLevels = numLevels;
    }

    public void add(int id, int nestingLevel) {
        if (nestingLevel == numLevels) {
            ids.add(id);
        }
    }

    public Set<Integer> getIds() {
        return ids;
    }
}
