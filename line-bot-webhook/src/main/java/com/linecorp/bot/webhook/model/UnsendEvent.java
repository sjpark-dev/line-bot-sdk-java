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

import com.linecorp.bot.webhook.model.DeliveryContext;
import com.linecorp.bot.webhook.model.Event;
import com.linecorp.bot.webhook.model.EventMode;
import com.linecorp.bot.webhook.model.Source;
import com.linecorp.bot.webhook.model.UnsendDetail;


/**
 * Event object for when the user unsends a message.
 */
@JsonTypeName("unsend")

@JsonInclude(Include.NON_NULL)
@javax.annotation.Generated(value = "com.linecorp.bot.codegen.LineJavaCodegenGenerator")
public record UnsendEvent (
/**
    * Get source
    */
    
    @JsonProperty("source")
    Source source,
/**
    * Time of the event in milliseconds.
    */
    
    @JsonProperty("timestamp")
    Long timestamp,
/**
    * Get mode
    */
    
    @JsonProperty("mode")
    EventMode mode,
/**
    * Webhook Event ID. An ID that uniquely identifies a webhook event. This is a string in ULID format.
    */
    
    @JsonProperty("webhookEventId")
    String webhookEventId,
/**
    * Get deliveryContext
    */
    
    @JsonProperty("deliveryContext")
    DeliveryContext deliveryContext,
/**
    * Get unsend
    */
    
    @JsonProperty("unsend")
    UnsendDetail unsend

) implements Event {


}
