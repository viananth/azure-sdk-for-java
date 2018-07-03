/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2018_02_01_preview.implementation;

import com.microsoft.azure.management.containerregistry.v2018_02_01_preview.BuildTask;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.containerregistry.v2018_02_01_preview.BuildTaskUpdateParameters;
import java.util.Map;
import com.microsoft.azure.management.containerregistry.v2018_02_01_preview.ProvisioningState;
import org.joda.time.DateTime;
import com.microsoft.azure.management.containerregistry.v2018_02_01_preview.BuildTaskStatus;
import com.microsoft.azure.management.containerregistry.v2018_02_01_preview.PlatformProperties;
import com.microsoft.azure.management.containerregistry.v2018_02_01_preview.SourceRepositoryProperties;
import com.microsoft.azure.management.containerregistry.v2018_02_01_preview.SourceRepositoryUpdateParameters;
import rx.functions.Func1;

class BuildTaskImpl extends CreatableUpdatableImpl<BuildTask, BuildTaskInner, BuildTaskImpl> implements BuildTask, BuildTask.Definition, BuildTask.Update {
    private final ContainerRegistryManager manager;
    private String resourceGroupName;
    private String registryName;
    private String buildTaskName;
    private BuildTaskUpdateParameters updateParameter;

    BuildTaskImpl(String name, ContainerRegistryManager manager) {
        super(name, new BuildTaskInner());
        this.manager = manager;
        // Set resource name
        this.buildTaskName = name;
        //
        this.updateParameter = new BuildTaskUpdateParameters();
    }

    BuildTaskImpl(BuildTaskInner inner, ContainerRegistryManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.buildTaskName = inner.name();
        // resource ancestor names
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.registryName = IdParsingUtils.getValueFromIdByName(inner.id(), "registries");
        this.buildTaskName = IdParsingUtils.getValueFromIdByName(inner.id(), "buildTasks");
        //
        this.updateParameter = new BuildTaskUpdateParameters();
    }

    @Override
    public ContainerRegistryManager manager() {
        return this.manager;
    }

    @Override
    public Observable<BuildTask> createResourceAsync() {
        BuildTasksInner client = this.manager().inner().buildTasks();
        return client.createAsync(this.resourceGroupName, this.registryName, this.buildTaskName, this.inner())
            .map(new Func1<BuildTaskInner, BuildTaskInner>() {
               @Override
               public BuildTaskInner call(BuildTaskInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<BuildTask> updateResourceAsync() {
        BuildTasksInner client = this.manager().inner().buildTasks();
        return client.updateAsync(this.resourceGroupName, this.registryName, this.buildTaskName, this.updateParameter)
            .map(new Func1<BuildTaskInner, BuildTaskInner>() {
               @Override
               public BuildTaskInner call(BuildTaskInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<BuildTaskInner> getInnerAsync() {
        BuildTasksInner client = this.manager().inner().buildTasks();
        return client.getAsync(this.resourceGroupName, this.registryName, this.buildTaskName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new BuildTaskUpdateParameters();
    }

    @Override
    public String alias() {
        return this.inner().alias();
    }

    @Override
    public DateTime creationDate() {
        return this.inner().creationDate();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public PlatformProperties platform() {
        return this.inner().platform();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public SourceRepositoryProperties sourceRepository() {
        SourceRepositoryPropertiesInner inner = this.inner().sourceRepository();
        if (inner != null) {
            return  new SourceRepositoryPropertiesImpl(inner, manager());
        } else {
            return null;
        }
    }

    @Override
    public BuildTaskStatus status() {
        return this.inner().status();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public Integer timeout() {
        return this.inner().timeout();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public BuildTaskImpl withExistingRegistry(String resourceGroupName, String registryName) {
        this.resourceGroupName = resourceGroupName;
        this.registryName = registryName;
        return this;
    }

    @Override
    public BuildTaskImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public BuildTaskImpl withSourceRepository(SourceRepositoryPropertiesInner sourceRepository) {
        this.inner().withSourceRepository(sourceRepository);
        return this;
    }

    @Override
    public BuildTaskImpl withSourceRepository(SourceRepositoryUpdateParameters sourceRepository) {
        this.updateParameter.withSourceRepository(sourceRepository);
        return this;
    }

    @Override
    public BuildTaskImpl withAlias(String alias) {
        if (isInCreateMode()) {
            this.inner().withAlias(alias);
        } else {
            this.updateParameter.withAlias(alias);
        }
        return this;
    }

    @Override
    public BuildTaskImpl withPlatform(PlatformProperties platform) {
        if (isInCreateMode()) {
            this.inner().withPlatform(platform);
        } else {
            this.updateParameter.withPlatform(platform);
        }
        return this;
    }

    @Override
    public BuildTaskImpl withStatus(BuildTaskStatus status) {
        if (isInCreateMode()) {
            this.inner().withStatus(status);
        } else {
            this.updateParameter.withStatus(status);
        }
        return this;
    }

    @Override
    public BuildTaskImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.inner().withTags(tags);
        } else {
            this.updateParameter.withTags(tags);
        }
        return this;
    }

    @Override
    public BuildTaskImpl withTimeout(Integer timeout) {
        if (isInCreateMode()) {
            this.inner().withTimeout(timeout);
        } else {
            this.updateParameter.withTimeout(timeout);
        }
        return this;
    }

}
