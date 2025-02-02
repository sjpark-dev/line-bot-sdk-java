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
 * Action
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = CameraAction.class, name = "camera"),
        @JsonSubTypes.Type(value = CameraRollAction.class, name = "cameraRoll"),
        @JsonSubTypes.Type(value = DatetimePickerAction.class, name = "datetimepicker"),
        @JsonSubTypes.Type(value = LocationAction.class, name = "location"),
        @JsonSubTypes.Type(value = MessageAction.class, name = "message"),
        @JsonSubTypes.Type(value = PostbackAction.class, name = "postback"),
        @JsonSubTypes.Type(value = RichMenuSwitchAction.class, name = "richmenuswitch"),
        @JsonSubTypes.Type(value = URIAction.class, name = "uri"),

})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = UnknownAction.class,
    visible = true
)
public interface Action {

}
