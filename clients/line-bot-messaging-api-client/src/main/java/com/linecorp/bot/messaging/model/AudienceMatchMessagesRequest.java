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

import com.linecorp.bot.messaging.model.Message;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * AudienceMatchMessagesRequest
 */

@JsonInclude(Include.NON_NULL)
@javax.annotation.Generated(value = "com.linecorp.bot.codegen.LineJavaCodegenGenerator")
public record AudienceMatchMessagesRequest (
/**
    * Destination of the message (A value obtained by hashing the telephone number, which is another value normalized to E.164 format, with SHA256).
    */
    
    @JsonProperty("messages")
    List<Message> messages,
/**
    * Message to send.
    */
    
    @JsonProperty("to")
    List<String> to,
/**
    * &#x60;true&#x60;: The user doesn’t receive a push notification when a message is sent. &#x60;false&#x60;: The user receives a push notification when the message is sent (unless they have disabled push notifications in LINE and/or their device). The default value is false. 
    */
    
    @JsonProperty("notificationDisabled")
    Boolean notificationDisabled

)  {


}
