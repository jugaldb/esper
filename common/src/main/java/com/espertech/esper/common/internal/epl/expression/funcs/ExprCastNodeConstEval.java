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
package com.espertech.esper.common.internal.epl.expression.funcs;

import com.espertech.esper.common.client.EventBean;
import com.espertech.esper.common.internal.epl.expression.core.ExprEvaluator;
import com.espertech.esper.common.internal.epl.expression.core.ExprEvaluatorContext;

public class ExprCastNodeConstEval implements ExprEvaluator {
    private final ExprCastNode parent;
    private final Object theConstant;

    public ExprCastNodeConstEval(ExprCastNode parent, Object theConstant) {
        this.parent = parent;
        this.theConstant = theConstant;
    }

    public Object evaluate(EventBean[] eventsPerStream, boolean isNewData, ExprEvaluatorContext context) {
        return theConstant;
    }

}
