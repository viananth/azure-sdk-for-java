/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.trafficmanager.v2017_05_01.implementation;

import com.microsoft.azure.management.trafficmanager.v2017_05_01.DeleteOperationResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class DeleteOperationResultImpl extends WrapperImpl<DeleteOperationResultInner> implements DeleteOperationResult {
    private final NetworkManager manager;
    DeleteOperationResultImpl(DeleteOperationResultInner inner, NetworkManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public Boolean operationResult() {
        return this.inner().operationResult();
    }

}
