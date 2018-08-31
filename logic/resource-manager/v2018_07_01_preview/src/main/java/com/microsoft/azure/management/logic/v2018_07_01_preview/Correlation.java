/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2018_07_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The correlation property.
 */
public class Correlation {
    /**
     * The client tracking id.
     */
    @JsonProperty(value = "clientTrackingId")
    private String clientTrackingId;

    /**
     * Get the client tracking id.
     *
     * @return the clientTrackingId value
     */
    public String clientTrackingId() {
        return this.clientTrackingId;
    }

    /**
     * Set the client tracking id.
     *
     * @param clientTrackingId the clientTrackingId value to set
     * @return the Correlation object itself.
     */
    public Correlation withClientTrackingId(String clientTrackingId) {
        this.clientTrackingId = clientTrackingId;
        return this;
    }

}
