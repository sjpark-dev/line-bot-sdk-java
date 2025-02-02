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


package com.linecorp.bot.liff.model;

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
 * Specify the setting for bot link feature with one of the following values:  &#x60;normal&#x60;: Display the option to add the LINE Official Account as a friend in the channel consent screen. &#x60;aggressive&#x60;: Display a screen with the option to add the LINE Official Account as a friend after the channel consent screen. &#x60;none&#x60;: Don&#39;t display the option to add the LINE Official Account as a friend.   The default value is none. 
 */
public enum LiffBotPrompt {

    
    @JsonProperty("normal")
  NORMAL,
    
    @JsonProperty("aggressive")
  AGGRESSIVE,
    
    @JsonProperty("none")
  NONE,
    

    @JsonEnumDefaultValue
    UNDEFINED
}
