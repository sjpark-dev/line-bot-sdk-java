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


package com.linecorp.bot.webhook.model;

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

import java.net.URI;


/**
 * Provider of the media file.
 */

@JsonInclude(Include.NON_NULL)
@javax.annotation.Generated(value = "com.linecorp.bot.codegen.LineJavaCodegenGenerator")
public record ContentProvider (
/**
    * Provider of the image file.
    */
    
    @JsonProperty("type")
    Type type,
/**
    * URL of the image file. Only included when contentProvider.type is external.
    */
    
    @JsonProperty("originalContentUrl")
    URI originalContentUrl,
/**
    * URL of the preview image. Only included when contentProvider.type is external.
    */
    
    @JsonProperty("previewImageUrl")
    URI previewImageUrl

)  {
/**
     * Provider of the image file.
     */
    public enum Type {
@JsonProperty("line")
      LINE,
    @JsonProperty("external")
      EXTERNAL,
    

      @JsonEnumDefaultValue
      UNDEFINED;
    }


}
