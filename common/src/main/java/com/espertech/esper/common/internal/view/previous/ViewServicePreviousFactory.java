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
package com.espertech.esper.common.internal.view.previous;

import com.espertech.esper.common.internal.collection.ViewUpdatedCollection;
import com.espertech.esper.common.internal.view.core.AgentInstanceViewFactoryChainContext;

public interface ViewServicePreviousFactory {
    ViewUpdatedCollection getOptPreviousExprRandomAccess(AgentInstanceViewFactoryChainContext agentInstanceViewFactoryContext);

    ViewUpdatedCollection getOptPreviousExprRelativeAccess(AgentInstanceViewFactoryChainContext agentInstanceViewFactoryContext);

    IStreamSortRankRandomAccess getOptPreviousExprSortedRankedAccess(AgentInstanceViewFactoryChainContext agentInstanceViewFactoryContext);
}
