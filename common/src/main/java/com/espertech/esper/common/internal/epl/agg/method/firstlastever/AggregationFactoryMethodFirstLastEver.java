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
package com.espertech.esper.common.internal.epl.agg.method.firstlastever;


import com.espertech.esper.common.client.EventType;
import com.espertech.esper.common.internal.bytecodemodel.base.CodegenClassScope;
import com.espertech.esper.common.internal.bytecodemodel.base.CodegenMemberCol;
import com.espertech.esper.common.internal.bytecodemodel.core.CodegenCtor;
import com.espertech.esper.common.internal.epl.agg.core.AggregationPortableValidation;
import com.espertech.esper.common.internal.epl.agg.method.core.AggregationFactoryMethodBase;
import com.espertech.esper.common.internal.epl.agg.method.core.AggregatorMethod;
import com.espertech.esper.common.internal.epl.expression.agg.base.ExprAggregateNodeBase;
import com.espertech.esper.common.internal.epl.expression.agg.method.ExprFirstLastEverNode;
import com.espertech.esper.common.internal.epl.expression.agg.method.ExprMethodAggUtil;
import com.espertech.esper.common.internal.epl.expression.core.ExprForge;
import com.espertech.esper.common.internal.epl.expression.core.ExprValidationException;

public class AggregationFactoryMethodFirstLastEver extends AggregationFactoryMethodBase {
    protected final ExprFirstLastEverNode parent;
    protected final Class childType;
    private AggregatorMethod aggregator;

    public AggregationFactoryMethodFirstLastEver(ExprFirstLastEverNode parent, Class childType) {
        this.parent = parent;
        this.childType = childType;
    }

    public Class getResultType() {
        return childType;
    }

    public void initMethodForge(int col, CodegenCtor rowCtor, CodegenMemberCol membersColumnized, CodegenClassScope classScope) {
        if (parent.isFirst()) {
            aggregator = new AggregatorFirstEver(this, col, rowCtor, membersColumnized, classScope, null, parent.hasFilter(), parent.getOptionalFilter(), childType);
        } else {
            aggregator = new AggregatorLastEver(this, col, rowCtor, membersColumnized, classScope, null, parent.hasFilter(), parent.getOptionalFilter(), childType);
        }
    }

    public AggregatorMethod getAggregator() {
        return aggregator;
    }

    public ExprAggregateNodeBase getAggregationExpression() {
        return parent;
    }

    public AggregationPortableValidation getAggregationPortableValidation() {
        return new AggregationPortableValidationFirstLastEver(parent.isDistinct(), parent.hasFilter(), childType, parent.isFirst());
    }

    public ExprForge[] getMethodAggregationForge(boolean join, EventType[] typesPerStream) throws ExprValidationException {
        return ExprMethodAggUtil.getDefaultForges(parent.getPositionalParams(), join, typesPerStream);
    }
}

