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



/**
 * Transcoding response
 */

@JsonInclude(Include.NON_NULL)
@javax.annotation.Generated(value = "com.linecorp.bot.codegen.LineJavaCodegenGenerator")
public record GetMessageContentTranscodingResponse (
/**
    * The preparation status. One of:  &#x60;processing&#x60;: Preparing to get content. &#x60;succeeded&#x60;: Ready to get the content. You can get the content sent by users. &#x60;failed&#x60;: Failed to prepare to get the content. 
    */
    
    @JsonProperty("status")
    Status status

)  {
/**
     * The preparation status. One of:  &#x60;processing&#x60;: Preparing to get content. &#x60;succeeded&#x60;: Ready to get the content. You can get the content sent by users. &#x60;failed&#x60;: Failed to prepare to get the content. 
     */
    public enum Status {
@JsonProperty("processing")
      PROCESSING,
    @JsonProperty("succeeded")
      SUCCEEDED,
    @JsonProperty("failed")
      FAILED,
    

      @JsonEnumDefaultValue
      UNDEFINED;
    }


}
