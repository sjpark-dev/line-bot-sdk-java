/*
 * Copyright 2023 LINE Corporation
 *
 * LINE Corporation licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */


package com.linecorp.bot.audience.model;

import java.time.Instant;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.linecorp.bot.audience.model.AudienceGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Gets data for more than one audience.
 */

@JsonInclude(Include.NON_NULL)
@javax.annotation.Generated(value = "com.linecorp.bot.codegen.LineJavaCodegenGenerator")
public record GetAudienceGroupsResponse (
/**
    * An array of audience data. If there are no audiences that match the specified filter, an empty array will be returned.
    */
    
    @JsonProperty("audienceGroups")
    List<AudienceGroup> audienceGroups,
/**
    * true when this is not the last page.
    */
    
    @JsonProperty("hasNextPage")
    Boolean hasNextPage,
/**
    * The total number of audiences that can be returned with the specified filter.
    */
    
    @JsonProperty("totalCount")
    Long totalCount,
/**
    * Of the audiences you can get with the specified filter, the number of audiences with the update permission set to READ_WRITE.
    */
    
    @JsonProperty("readWriteAudienceGroupTotalCount")
    Long readWriteAudienceGroupTotalCount,
/**
    * The current page number.
    */
    
    @JsonProperty("page")
    Long page,
/**
    * The maximum number of audiences on the current page.
    */
    
    @JsonProperty("size")
    Long size

)  {


}
