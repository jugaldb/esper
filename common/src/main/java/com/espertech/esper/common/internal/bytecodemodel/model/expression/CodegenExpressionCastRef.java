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
package com.espertech.esper.common.internal.bytecodemodel.model.expression;

import java.util.Map;
import java.util.Set;

import static com.espertech.esper.common.internal.bytecodemodel.core.CodeGenerationHelper.appendClassName;

public class CodegenExpressionCastRef implements CodegenExpression {
    private final Class clazz;
    private final String ref;

    public CodegenExpressionCastRef(Class clazz, String ref) {
        this.clazz = clazz;
        this.ref = ref;
    }

    public void render(StringBuilder builder, Map<Class, String> imports, boolean isInnerClass) {
        builder.append("((");
        appendClassName(builder, clazz, null, imports);
        builder.append(")").append(ref).append(")");
    }

    public void mergeClasses(Set<Class> classes) {
        classes.add(clazz);
    }
}
