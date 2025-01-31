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

import com.linecorp.bot.messaging.model.Action;
import com.linecorp.bot.messaging.model.FlexComponent;
import java.net.URI;


/**
 * FlexImage
 */
@JsonTypeName("image")

@JsonInclude(Include.NON_NULL)
@javax.annotation.Generated(value = "com.linecorp.bot.codegen.LineJavaCodegenGenerator")
public record FlexImage (
/**
    * Image URL (Max character limit: 2000) Protocol: HTTPS (TLS 1.2 or later) Image format: JPEG or PNG Maximum image size: 1024×1024 pixels Maximum file size: 10 MB (300 KB when the animated property is true) 
    */
    
    @JsonProperty("url")
    URI url,
/**
    * The ratio of the width or height of this component within the parent box.
    */
    
    @JsonProperty("flex")
    Integer flex,
/**
    * The minimum amount of space to include before this component in its parent container. 
    */
    
    @JsonProperty("margin")
    String margin,
/**
    * Reference for offsetTop, offsetBottom, offsetStart, and offsetEnd. Specify one of the following values:  &#x60;relative&#x60;: Use the previous box as reference. &#x60;absolute&#x60;: Use the top left of parent element as reference. The default value is relative. 
    */
    
    @JsonProperty("position")
    Position position,
/**
    * Offset.
    */
    
    @JsonProperty("offsetTop")
    String offsetTop,
/**
    * Offset.
    */
    
    @JsonProperty("offsetBottom")
    String offsetBottom,
/**
    * Offset.
    */
    
    @JsonProperty("offsetStart")
    String offsetStart,
/**
    * Offset.
    */
    
    @JsonProperty("offsetEnd")
    String offsetEnd,
/**
    * Alignment style in horizontal direction. 
    */
    
    @JsonProperty("align")
    Align align,
/**
    * Alignment style in vertical direction.
    */
    
    @JsonProperty("gravity")
    Gravity gravity,
/**
    * The maximum image width. This is md by default. 
    */
    
    @JsonProperty("size")
    String size,
/**
    * Aspect ratio of the image. &#x60;{width}:{height}&#x60; format. Specify the value of &#x60;{width}&#x60; and &#x60;{height}&#x60; in the range from &#x60;1&#x60; to &#x60;100000&#x60;. However, you cannot set &#x60;{height}&#x60; to a value that is more than three times the value of &#x60;{width}&#x60;. The default value is &#x60;1:1&#x60;. 
    */
    
    @JsonProperty("aspectRatio")
    String aspectRatio,
/**
    * The display style of the image if the aspect ratio of the image and that specified by the aspectRatio property do not match. 
    */
    
    @JsonProperty("aspectMode")
    AspectMode aspectMode,
/**
    * Background color of the image. Use a hexadecimal color code.
    */
    
    @JsonProperty("backgroundColor")
    String backgroundColor,
/**
    * Get action
    */
    
    @JsonProperty("action")
    Action action,
/**
    * When this is &#x60;true&#x60;, an animated image (APNG) plays. You can specify a value of true up to 10 images in a single message. You can&#39;t send messages that exceed this limit. This is &#x60;false&#x60; by default. Animated images larger than 300 KB aren&#39;t played back. 
    */
    
    @JsonProperty("animated")
    Boolean animated

) implements FlexComponent {
/**
     * Reference for offsetTop, offsetBottom, offsetStart, and offsetEnd. Specify one of the following values:  &#x60;relative&#x60;: Use the previous box as reference. &#x60;absolute&#x60;: Use the top left of parent element as reference. The default value is relative. 
     */
    public enum Position {
@JsonProperty("relative")
      RELATIVE,
    @JsonProperty("absolute")
      ABSOLUTE,
    

      @JsonEnumDefaultValue
      UNDEFINED;
    }
/**
     * Alignment style in horizontal direction. 
     */
    public enum Align {
@JsonProperty("start")
      START,
    @JsonProperty("end")
      END,
    @JsonProperty("center")
      CENTER,
    

      @JsonEnumDefaultValue
      UNDEFINED;
    }
/**
     * Alignment style in vertical direction.
     */
    public enum Gravity {
@JsonProperty("top")
      TOP,
    @JsonProperty("bottom")
      BOTTOM,
    @JsonProperty("center")
      CENTER,
    

      @JsonEnumDefaultValue
      UNDEFINED;
    }
/**
     * The display style of the image if the aspect ratio of the image and that specified by the aspectRatio property do not match. 
     */
    public enum AspectMode {
@JsonProperty("fit")
      FIT,
    @JsonProperty("cover")
      COVER,
    

      @JsonEnumDefaultValue
      UNDEFINED;
    }


}
