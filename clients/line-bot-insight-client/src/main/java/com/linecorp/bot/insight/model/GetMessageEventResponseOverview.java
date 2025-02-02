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
 * Summary of message statistics.
 */

@JsonInclude(Include.NON_NULL)
@javax.annotation.Generated(value = "com.linecorp.bot.codegen.LineJavaCodegenGenerator")
public record GetMessageEventResponseOverview (
/**
    * Request ID.
    */
    
    @JsonProperty("requestId")
    String requestId,
/**
    * UNIX timestamp for message delivery time in seconds.
    */
    
    @JsonProperty("timestamp")
    Long timestamp,
/**
    * Number of messages delivered. This property shows values of less than 20. However, if all messages have not been sent, it will be null. 
    */
    
    @JsonProperty("delivered")
    Long delivered,
/**
    * Number of users who opened the message, meaning they displayed at least 1 bubble.
    */
    
    @JsonProperty("uniqueImpression")
    Long uniqueImpression,
/**
    * Number of users who opened any URL in the message.
    */
    
    @JsonProperty("uniqueClick")
    Long uniqueClick,
/**
    * Number of users who started playing any video or audio in the message.
    */
    
    @JsonProperty("uniqueMediaPlayed")
    Long uniqueMediaPlayed,
/**
    * Number of users who played the entirety of any video or audio in the message.
    */
    
    @JsonProperty("uniqueMediaPlayed100Percent")
    Long uniqueMediaPlayed100Percent

)  {


}
