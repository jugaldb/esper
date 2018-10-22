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
package com.espertech.esper.common.internal.context.util;

import com.espertech.esper.common.client.EventBean;
import com.espertech.esper.common.client.EventType;

public class ContextMergeViewForwarding extends ContextMergeView {

    public ContextMergeViewForwarding(EventType eventType) {
        super(eventType);
    }

    @Override
    public void update(EventBean[] newData, EventBean[] oldData) {
        child.update(newData, oldData);
    }
}
