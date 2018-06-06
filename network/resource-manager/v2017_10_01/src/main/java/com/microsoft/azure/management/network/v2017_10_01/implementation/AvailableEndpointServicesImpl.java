/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.network.v2017_10_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.network.v2017_10_01.AvailableEndpointServices;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.network.v2017_10_01.EndpointServiceResult;

class AvailableEndpointServicesImpl extends WrapperImpl<AvailableEndpointServicesInner> implements AvailableEndpointServices {
    private final NetworkManager manager;

    AvailableEndpointServicesImpl(NetworkManager manager) {
        super(manager.inner().availableEndpointServices());
        this.manager = manager;
    }

    public NetworkManager manager() {
        return this.manager;
    }

    private EndpointServiceResultImpl wrapEndpointServiceResultModel(EndpointServiceResultInner inner) {
        return  new EndpointServiceResultImpl(inner, manager());
    }

    @Override
    public Observable<EndpointServiceResult> listAsync(final String location) {
        AvailableEndpointServicesInner client = this.inner();
        return client.listAsync(location)
        .flatMapIterable(new Func1<Page<EndpointServiceResultInner>, Iterable<EndpointServiceResultInner>>() {
            @Override
            public Iterable<EndpointServiceResultInner> call(Page<EndpointServiceResultInner> page) {
                return page.items();
            }
        })
        .map(new Func1<EndpointServiceResultInner, EndpointServiceResult>() {
            @Override
            public EndpointServiceResult call(EndpointServiceResultInner inner) {
                return wrapEndpointServiceResultModel(inner);
            }
        });
    }

}
