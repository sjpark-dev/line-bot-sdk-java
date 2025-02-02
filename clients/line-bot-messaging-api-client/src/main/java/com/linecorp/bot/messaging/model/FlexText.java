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
import com.linecorp.bot.messaging.model.FlexSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * FlexText
 */
@JsonTypeName("text")

@JsonInclude(Include.NON_NULL)
@javax.annotation.Generated(value = "com.linecorp.bot.codegen.LineJavaCodegenGenerator")
public record FlexText (
/**
    * Get flex
    */
    
    @JsonProperty("flex")
    Integer flex,
/**
    * Get text
    */
    
    @JsonProperty("text")
    String text,
/**
    * Get size
    */
    
    @JsonProperty("size")
    String size,
/**
    * Get align
    */
    
    @JsonProperty("align")
    Align align,
/**
    * Get gravity
    */
    
    @JsonProperty("gravity")
    Gravity gravity,
/**
    * Get color
    */
    
    @JsonProperty("color")
    String color,
/**
    * Get weight
    */
    
    @JsonProperty("weight")
    Weight weight,
/**
    * Get style
    */
    
    @JsonProperty("style")
    Style style,
/**
    * Get decoration
    */
    
    @JsonProperty("decoration")
    Decoration decoration,
/**
    * Get wrap
    */
    
    @JsonProperty("wrap")
    Boolean wrap,
/**
    * Get lineSpacing
    */
    
    @JsonProperty("lineSpacing")
    String lineSpacing,
/**
    * Get margin
    */
    
    @JsonProperty("margin")
    String margin,
/**
    * Get position
    */
    
    @JsonProperty("position")
    Position position,
/**
    * Get offsetTop
    */
    
    @JsonProperty("offsetTop")
    String offsetTop,
/**
    * Get offsetBottom
    */
    
    @JsonProperty("offsetBottom")
    String offsetBottom,
/**
    * Get offsetStart
    */
    
    @JsonProperty("offsetStart")
    String offsetStart,
/**
    * Get offsetEnd
    */
    
    @JsonProperty("offsetEnd")
    String offsetEnd,
/**
    * Get action
    */
    
    @JsonProperty("action")
    Action action,
/**
    * Get maxLines
    */
    
    @JsonProperty("maxLines")
    Integer maxLines,
/**
    * Get contents
    */
    
    @JsonProperty("contents")
    List<FlexSpan> contents,
/**
    * Get adjustMode
    */
    
    @JsonProperty("adjustMode")
    AdjustMode adjustMode,
/**
    * Get scaling
    */
    
    @JsonProperty("scaling")
    Boolean scaling

) implements FlexComponent {
/**
     * Gets or Sets align
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
     * Gets or Sets gravity
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
     * Gets or Sets weight
     */
    public enum Weight {
@JsonProperty("regular")
      REGULAR,
    @JsonProperty("bold")
      BOLD,
    

      @JsonEnumDefaultValue
      UNDEFINED;
    }
/**
     * Gets or Sets style
     */
    public enum Style {
@JsonProperty("normal")
      NORMAL,
    @JsonProperty("italic")
      ITALIC,
    

      @JsonEnumDefaultValue
      UNDEFINED;
    }
/**
     * Gets or Sets decoration
     */
    public enum Decoration {
@JsonProperty("none")
      NONE,
    @JsonProperty("underline")
      UNDERLINE,
    @JsonProperty("line-through")
      LINE_THROUGH,
    

      @JsonEnumDefaultValue
      UNDEFINED;
    }
/**
     * Gets or Sets position
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
     * Gets or Sets adjustMode
     */
    public enum AdjustMode {
@JsonProperty("shrink-to-fit")
      SHRINK_TO_FIT,
    

      @JsonEnumDefaultValue
      UNDEFINED;
    }


}
