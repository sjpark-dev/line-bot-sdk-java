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

import com.linecorp.bot.messaging.model.QuickReply;
import com.linecorp.bot.messaging.model.Sender;


/**
 * Message
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = AudioMessage.class, name = "audio"),
        @JsonSubTypes.Type(value = FlexMessage.class, name = "flex"),
        @JsonSubTypes.Type(value = ImageMessage.class, name = "image"),
        @JsonSubTypes.Type(value = ImagemapMessage.class, name = "imagemap"),
        @JsonSubTypes.Type(value = LocationMessage.class, name = "location"),
        @JsonSubTypes.Type(value = StickerMessage.class, name = "sticker"),
        @JsonSubTypes.Type(value = TemplateMessage.class, name = "template"),
        @JsonSubTypes.Type(value = TextMessage.class, name = "text"),
        @JsonSubTypes.Type(value = VideoMessage.class, name = "video"),

})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = UnknownMessage.class,
    visible = true
)
public interface Message {

}
