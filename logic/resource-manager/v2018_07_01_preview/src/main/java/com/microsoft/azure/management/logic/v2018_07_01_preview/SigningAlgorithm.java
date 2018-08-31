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
 * Defines values for SigningAlgorithm.
 */
public final class SigningAlgorithm extends ExpandableStringEnum<SigningAlgorithm> {
    /** Static value NotSpecified for SigningAlgorithm. */
    public static final SigningAlgorithm NOT_SPECIFIED = fromString("NotSpecified");

    /** Static value Default for SigningAlgorithm. */
    public static final SigningAlgorithm DEFAULT = fromString("Default");

    /** Static value SHA1 for SigningAlgorithm. */
    public static final SigningAlgorithm SHA1 = fromString("SHA1");

    /** Static value SHA2256 for SigningAlgorithm. */
    public static final SigningAlgorithm SHA2256 = fromString("SHA2256");

    /** Static value SHA2384 for SigningAlgorithm. */
    public static final SigningAlgorithm SHA2384 = fromString("SHA2384");

    /** Static value SHA2512 for SigningAlgorithm. */
    public static final SigningAlgorithm SHA2512 = fromString("SHA2512");

    /**
     * Creates or finds a SigningAlgorithm from its string representation.
     * @param name a name to look for
     * @return the corresponding SigningAlgorithm
     */
    @JsonCreator
    public static SigningAlgorithm fromString(String name) {
        return fromString(name, SigningAlgorithm.class);
    }

    /**
     * @return known SigningAlgorithm values
     */
    public static Collection<SigningAlgorithm> values() {
        return values(SigningAlgorithm.class);
    }
}
