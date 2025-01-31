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


package com.linecorp.bot.messaging.model;

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



import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Gets or Sets AgeDemographic
 */
public enum AgeDemographic {

    
    @JsonProperty("age_15")
  AGE_15,
    
    @JsonProperty("age_20")
  AGE_20,
    
    @JsonProperty("age_25")
  AGE_25,
    
    @JsonProperty("age_30")
  AGE_30,
    
    @JsonProperty("age_35")
  AGE_35,
    
    @JsonProperty("age_40")
  AGE_40,
    
    @JsonProperty("age_45")
  AGE_45,
    
    @JsonProperty("age_50")
  AGE_50,
    

    @JsonEnumDefaultValue
    UNDEFINED
}
