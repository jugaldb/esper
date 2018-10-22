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
package com.espertech.esper.common.internal.epl.output.condition;

public final class OutputConditionTerm extends OutputConditionBase implements OutputCondition {
    public OutputConditionTerm(OutputCallback outputCallback) {
        super(outputCallback);
    }

    public void updateOutputCondition(int newEventsCount, int oldEventsCount) {
    }

    public void stopOutputCondition() {
        // no action required
    }
}
