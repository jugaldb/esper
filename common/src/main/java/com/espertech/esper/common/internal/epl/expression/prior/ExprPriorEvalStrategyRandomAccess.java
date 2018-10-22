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
package com.espertech.esper.common.internal.epl.expression.prior;

import com.espertech.esper.common.client.EventBean;
import com.espertech.esper.common.internal.epl.expression.core.ExprEvaluatorContext;
import com.espertech.esper.common.internal.view.access.RandomAccessByIndex;

/**
 * Represents the 'prior' prior event function in an expression node tree.
 */
public class ExprPriorEvalStrategyRandomAccess implements PriorEvalStrategy {
    private final transient RandomAccessByIndex randomAccess;

    public ExprPriorEvalStrategyRandomAccess(RandomAccessByIndex randomAccess) {
        this.randomAccess = randomAccess;
    }

    public EventBean getSubstituteEvent(EventBean originalEvent, boolean isNewData, int constantIndexNumber, int relativeIndex, ExprEvaluatorContext exprEvaluatorContext, int streamNum) {
        if (isNewData) {
            return randomAccess.getNewData(constantIndexNumber);
        } else {
            return randomAccess.getOldData(constantIndexNumber);
        }
    }
}
