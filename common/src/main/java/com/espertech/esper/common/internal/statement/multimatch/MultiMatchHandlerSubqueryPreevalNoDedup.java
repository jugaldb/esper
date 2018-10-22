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
package com.espertech.esper.common.internal.statement.multimatch;

import com.espertech.esper.common.client.EventBean;
import com.espertech.esper.common.internal.filtersvc.FilterHandleCallback;

import java.util.Collection;

public class MultiMatchHandlerSubqueryPreevalNoDedup implements MultiMatchHandler {
    protected static final MultiMatchHandlerSubqueryPreevalNoDedup INSTANCE = new MultiMatchHandlerSubqueryPreevalNoDedup();

    private MultiMatchHandlerSubqueryPreevalNoDedup() {
    }

    public void handle(Collection<FilterHandleCallback> callbacks, EventBean theEvent) {
        for (FilterHandleCallback callback : callbacks) {
            if (callback.isSubSelect()) {
                callback.matchFound(theEvent, callbacks);
            }
        }

        for (FilterHandleCallback callback : callbacks) {
            if (!callback.isSubSelect()) {
                callback.matchFound(theEvent, callbacks);
            }
        }
    }
}
