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


package com.linecorp.bot.insight.model;

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



/**
 * Get number of followers
 */

@JsonInclude(Include.NON_NULL)
@javax.annotation.Generated(value = "com.linecorp.bot.codegen.LineJavaCodegenGenerator")
public record GetNumberOfFollowersResponse (
/**
    * Calculation status.
    */
    
    @JsonProperty("status")
    Status status,
/**
    * The number of times, as of the specified date, that a user added this LINE Official Account as a friend for the first time. The number doesn&#39;t decrease even if a user later blocks the account or when they delete their LINE account. 
    */
    
    @JsonProperty("followers")
    Long followers,
/**
    * The number of users, as of the specified date, that the LINE Official Account can reach through targeted messages based on gender, age, and/or region. This number only includes users who are active on LINE or LINE services and whose demographics have a high level of certainty. 
    */
    
    @JsonProperty("targetedReaches")
    Long targetedReaches,
/**
    * The number of users blocking the account as of the specified date. The number decreases when a user unblocks the account.   
    */
    
    @JsonProperty("blocks")
    Long blocks

)  {
/**
     * Calculation status.
     */
    public enum Status {
@JsonProperty("ready")
      READY,
    @JsonProperty("unready")
      UNREADY,
    @JsonProperty("out_of_service")
      OUT_OF_SERVICE,
    

      @JsonEnumDefaultValue
      UNDEFINED;
    }


}
