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
package com.espertech.esper.common.internal.epl.datetime.dtlocal;

import com.espertech.esper.common.client.EventBean;
import com.espertech.esper.common.internal.epl.datetime.reformatop.ReformatOp;
import com.espertech.esper.common.internal.epl.expression.core.ExprEvaluatorContext;

import java.util.Date;

public class DTLocalDateReformatEval extends DTLocalReformatEvalBase {
    public DTLocalDateReformatEval(ReformatOp reformatOp) {
        super(reformatOp);
    }

    public Object evaluate(Object target, EventBean[] eventsPerStream, boolean isNewData, ExprEvaluatorContext exprEvaluatorContext) {
        return reformatOp.evaluate((Date) target, eventsPerStream, isNewData, exprEvaluatorContext);
    }
}
