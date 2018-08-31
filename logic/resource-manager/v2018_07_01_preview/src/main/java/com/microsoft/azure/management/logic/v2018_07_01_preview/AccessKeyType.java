/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2018_07_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for AccessKeyType.
 */
public final class AccessKeyType extends ExpandableStringEnum<AccessKeyType> {
    /** Static value NotSpecified for AccessKeyType. */
    public static final AccessKeyType NOT_SPECIFIED = fromString("NotSpecified");

    /** Static value Primary for AccessKeyType. */
    public static final AccessKeyType PRIMARY = fromString("Primary");

    /** Static value Secondary for AccessKeyType. */
    public static final AccessKeyType SECONDARY = fromString("Secondary");

    /**
     * Creates or finds a AccessKeyType from its string representation.
     * @param name a name to look for
     * @return the corresponding AccessKeyType
     */
    @JsonCreator
    public static AccessKeyType fromString(String name) {
        return fromString(name, AccessKeyType.class);
    }

    /**
     * @return known AccessKeyType values
     */
    public static Collection<AccessKeyType> values() {
        return values(AccessKeyType.class);
    }
}
