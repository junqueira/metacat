/*
 *
 *  Copyright 2017 Netflix, Inc.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *
 */
package com.netflix.metacat.common.server.events;

import com.netflix.metacat.common.MetacatRequestContext;
import com.netflix.metacat.common.QualifiedName;
import com.netflix.metacat.common.dto.PartitionDto;
import com.netflix.metacat.common.dto.PartitionsSaveResponseDto;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

import javax.annotation.Nonnull;
import java.util.List;

/**
 * Metacat save table partition metadata only post event.
 *
 * @author zhenl
 * @since 1.2.0
 */
@Getter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class MetacatSaveTablePartitionMetadataOnlyPostEvent extends MetacatEvent {
    private final List<PartitionDto> partitions;
    private final PartitionsSaveResponseDto partitionsSaveResponse;

    /**
     * Constructor.
     *
     * @param name                   name
     * @param metacatRequestContext  context
     * @param source                 The source object which threw this event
     * @param partitions             partitions
     * @param partitionsSaveResponse response
     */
    public MetacatSaveTablePartitionMetadataOnlyPostEvent(
        @Nonnull @NonNull final QualifiedName name,
        @Nonnull @NonNull final MetacatRequestContext metacatRequestContext,
        @Nonnull @NonNull final Object source,
        @Nonnull @NonNull final List<PartitionDto> partitions,
        @Nonnull @NonNull final PartitionsSaveResponseDto partitionsSaveResponse
    ) {
        super(name, metacatRequestContext, source);
        this.partitions = partitions;
        this.partitionsSaveResponse = partitionsSaveResponse;
    }
}
