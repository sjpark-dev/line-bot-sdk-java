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
 * GetStatisticsPerUnitResponseClick
 */

@JsonInclude(Include.NON_NULL)
@javax.annotation.Generated(value = "com.linecorp.bot.codegen.LineJavaCodegenGenerator")
public record GetStatisticsPerUnitResponseClick (
/**
    * The URL&#39;s serial number.
    */
    
    @JsonProperty("seq")
    Long seq,
/**
    * URL.
    */
    
    @JsonProperty("url")
    String url,
/**
    * Number of times the URL in the bubble was opened.
    */
    
    @JsonProperty("click")
    Long click,
/**
    * Number of users that opened the URL in the bubble.
    */
    
    @JsonProperty("uniqueClick")
    Long uniqueClick,
/**
    * Number of users who opened this url through any link in the message. If another message bubble contains the same URL and a user opens both links, it&#39;s counted only once. 
    */
    
    @JsonProperty("uniqueClickOfRequest")
    Long uniqueClickOfRequest

)  {


}
