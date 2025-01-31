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
 * Gets or Sets AreaDemographic
 */
public enum AreaDemographic {

    
    /**
     * jp_01: 北海道 // Hokkaido
     */
        
    @JsonProperty("jp_01")
  HOKKAIDO,
    
    /**
     * jp_02: 青森県 // Aomori
     */
        
    @JsonProperty("jp_02")
  AOMORI,
    
    /**
     * jp_03: 岩手県 // Iwate
     */
        
    @JsonProperty("jp_03")
  IWATE,
    
    /**
     * jp_04: 宮城県 // Miyagi
     */
        
    @JsonProperty("jp_04")
  MIYAGI,
    
    /**
     * jp_05: 秋田県 // Akita
     */
        
    @JsonProperty("jp_05")
  AKITA,
    
    /**
     * jp_06: 山形県 // Yamagata
     */
        
    @JsonProperty("jp_06")
  YAMAGATA,
    
    /**
     * jp_07: 福島県 // Fukushima
     */
        
    @JsonProperty("jp_07")
  FUKUSHIMA,
    
    /**
     * jp_08: 茨城県 // Ibaraki
     */
        
    @JsonProperty("jp_08")
  IBARAKI,
    
    /**
     * jp_09: 栃木県 // Tochigi
     */
        
    @JsonProperty("jp_09")
  TOCHIGI,
    
    /**
     * jp_10: 群馬県 // Gunma
     */
        
    @JsonProperty("jp_10")
  GUNMA,
    
    /**
     * jp_11: 埼玉県 // Saitama
     */
        
    @JsonProperty("jp_11")
  SAITAMA,
    
    /**
     * jp_12: 千葉県 // Chiba
     */
        
    @JsonProperty("jp_12")
  CHIBA,
    
    /**
     * jp_13: 東京都 // Tokyo
     */
        
    @JsonProperty("jp_13")
  TOKYO,
    
    /**
     * jp_14: 神奈川県 // Kanagawa
     */
        
    @JsonProperty("jp_14")
  KANAGAWA,
    
    /**
     * jp_15: 新潟県 // Niigata
     */
        
    @JsonProperty("jp_15")
  NIIGATA,
    
    /**
     * jp_16: 富山県 // Toyama
     */
        
    @JsonProperty("jp_16")
  TOYAMA,
    
    /**
     * jp_17: 石川県 // Ishikawa
     */
        
    @JsonProperty("jp_17")
  ISHIKAWA,
    
    /**
     * jp_18: 福井県 // Fukui
     */
        
    @JsonProperty("jp_18")
  FUKUI,
    
    /**
     * jp_19: 山梨県 // Yamanashi
     */
        
    @JsonProperty("jp_19")
  YAMANASHI,
    
    /**
     * jp_20: 長野県 // Nagano
     */
        
    @JsonProperty("jp_20")
  NAGANO,
    
    /**
     * jp_21: 岐阜県 // Gifu
     */
        
    @JsonProperty("jp_21")
  GIFU,
    
    /**
     * jp_22: 静岡県 // Shizuoka
     */
        
    @JsonProperty("jp_22")
  SHIZUOKA,
    
    /**
     * jp_23: 愛知県 // Aichi
     */
        
    @JsonProperty("jp_23")
  AICHI,
    
    /**
     * jp_24: 三重県 // Mie
     */
        
    @JsonProperty("jp_24")
  MIE,
    
    /**
     * jp_25: 滋賀県 // Shiga
     */
        
    @JsonProperty("jp_25")
  SHIGA,
    
    /**
     * jp_26: 京都府 // Kyoto
     */
        
    @JsonProperty("jp_26")
  KYOTO,
    
    /**
     * jp_27: 大阪府 // Osaka
     */
        
    @JsonProperty("jp_27")
  OSAKA,
    
    /**
     * jp_28: 兵庫県 // Hyougo
     */
        
    @JsonProperty("jp_28")
  HYOUGO,
    
    /**
     * jp_29: 奈良県 // Nara
     */
        
    @JsonProperty("jp_29")
  NARA,
    
    /**
     * jp_30: 和歌山県 // Wakayama
     */
        
    @JsonProperty("jp_30")
  WAKAYAMA,
    
    /**
     * jp_31: 鳥取県 // Tottori
     */
        
    @JsonProperty("jp_31")
  TOTTORI,
    
    /**
     * jp_32: 島根県 // Shimane
     */
        
    @JsonProperty("jp_32")
  SHIMANE,
    
    /**
     * jp_33: 岡山県 // Okayama
     */
        
    @JsonProperty("jp_33")
  OKAYAMA,
    
    /**
     * jp_34: 広島県 // Hiroshima
     */
        
    @JsonProperty("jp_34")
  HIROSHIMA,
    
    /**
     * jp_35: 山口県 // Yamaguchi
     */
        
    @JsonProperty("jp_35")
  YAMAGUCHI,
    
    /**
     * jp_36: 徳島県 // Tokushima
     */
        
    @JsonProperty("jp_36")
  TOKUSHIMA,
    
    /**
     * jp_37: 香川県 // Kagawa
     */
        
    @JsonProperty("jp_37")
  KAGAWA,
    
    /**
     * jp_38: 愛媛県 // Ehime
     */
        
    @JsonProperty("jp_38")
  EHIME,
    
    /**
     * jp_39: 高知県 // Kouchi
     */
        
    @JsonProperty("jp_39")
  KOUCHI,
    
    /**
     * jp_40: 福岡県 // Fukuoka
     */
        
    @JsonProperty("jp_40")
  FUKUOKA,
    
    /**
     * jp_41: 佐賀県 // Saga
     */
        
    @JsonProperty("jp_41")
  SAGA,
    
    /**
     * jp_42: 長崎県 // Nagasaki
     */
        
    @JsonProperty("jp_42")
  NAGASAKI,
    
    /**
     * jp_43: 熊本県 // Kumamoto
     */
        
    @JsonProperty("jp_43")
  KUMAMOTO,
    
    /**
     * jp_44: 大分県 // Oita
     */
        
    @JsonProperty("jp_44")
  OITA,
    
    /**
     * jp_45: 宮崎県 // Miyazaki
     */
        
    @JsonProperty("jp_45")
  MIYAZAKI,
    
    /**
     * jp_46: 鹿児島県 // Kagoshima
     */
        
    @JsonProperty("jp_46")
  KAGOSHIMA,
    
    /**
     * jp_47: 沖縄県 // Okinawa
     */
        
    @JsonProperty("jp_47")
  OKINAWA,
    
    /**
     * tw_01: 台北市 // Taipei City
     */
        
    @JsonProperty("tw_01")
  TAIPEI_CITY,
    
    /**
     * tw_02: 新北市 // New Taipei City
     */
        
    @JsonProperty("tw_02")
  NEW_TAIPEI_CITY,
    
    /**
     * tw_03: 桃園市 // Taoyuan City
     */
        
    @JsonProperty("tw_03")
  TAOYUAN_CITY,
    
    /**
     * tw_04: 台中市 // Taichung City
     */
        
    @JsonProperty("tw_04")
  TAICHUNG_CITY,
    
    /**
     * tw_05: 台南市 // Tainan City
     */
        
    @JsonProperty("tw_05")
  TAINAN_CITY,
    
    /**
     * tw_06: 高雄市 // Kaohsiung City
     */
        
    @JsonProperty("tw_06")
  KAOHSIUNG_CITY,
    
    /**
     * tw_07: 基隆市 // Keelung City
     */
        
    @JsonProperty("tw_07")
  KEELUNG_CITY,
    
    /**
     * tw_08: 新竹市 // Hsinchu City
     */
        
    @JsonProperty("tw_08")
  HSINCHU_CITY,
    
    /**
     * tw_09: 嘉義市 // Chiayi City
     */
        
    @JsonProperty("tw_09")
  CHIAYI_CITY,
    
    /**
     * tw_10: 新竹県 // Hsinchu County
     */
        
    @JsonProperty("tw_10")
  HSINCHU_COUNTY,
    
    /**
     * tw_11: 苗栗県 // Miaoli County
     */
        
    @JsonProperty("tw_11")
  MIAOLI_COUNTY,
    
    /**
     * tw_12: 彰化県 // Changhua County
     */
        
    @JsonProperty("tw_12")
  CHANGHUA_COUNTY,
    
    /**
     * tw_13: 南投県 // Nantou County
     */
        
    @JsonProperty("tw_13")
  NANTOU_COUNTY,
    
    /**
     * tw_14: 雲林県 // Yunlin County
     */
        
    @JsonProperty("tw_14")
  YUNLIN_COUNTY,
    
    /**
     * tw_15: 嘉義県 // Chiayi County
     */
        
    @JsonProperty("tw_15")
  CHIAYI_COUNTY,
    
    /**
     * tw_16: 屏東県 // Pingtung County
     */
        
    @JsonProperty("tw_16")
  PINGTUNG_COUNTY,
    
    /**
     * tw_17: 宜蘭県 // Yilan County
     */
        
    @JsonProperty("tw_17")
  YILAN_COUNTY,
    
    /**
     * tw_18: 花蓮県 // Hualien County
     */
        
    @JsonProperty("tw_18")
  HUALIEN_COUNTY,
    
    /**
     * tw_19: 台東県 // Taitung County
     */
        
    @JsonProperty("tw_19")
  TAITUNG_COUNTY,
    
    /**
     * tw_20: 澎湖県 // Penghu County
     */
        
    @JsonProperty("tw_20")
  PENGHU_COUNTY,
    
    /**
     * tw_21: 金門県 // Kinmen County
     */
        
    @JsonProperty("tw_21")
  KINMEN_COUNTY,
    
    /**
     * tw_22: 連江県 // Lienchiang County
     */
        
    @JsonProperty("tw_22")
  LIENCHIANG_COUNTY,
    
    /**
     * th_01: バンコク // Bangkok
     */
        
    @JsonProperty("th_01")
  BANGKOK,
    
    /**
     * th_02: パタヤ // Pattaya
     */
        
    @JsonProperty("th_02")
  PATTAYA,
    
    /**
     * th_03: 北部 // Northern
     */
        
    @JsonProperty("th_03")
  NORTHERN,
    
    /**
     * th_04: 中央部 // Central
     */
        
    @JsonProperty("th_04")
  CENTRAL,
    
    /**
     * th_05: 南部 // Southern
     */
        
    @JsonProperty("th_05")
  SOUTHERN,
    
    /**
     * th_06: 東部 // Eastern
     */
        
    @JsonProperty("th_06")
  EASTERN,
    
    /**
     * th_07: 東北部 // NorthEastern
     */
        
    @JsonProperty("th_07")
  NORTHEASTERN,
    
    /**
     * th_08: 西部 // Western
     */
        
    @JsonProperty("th_08")
  WESTERN,
    
    /**
     * id_01: バリ // Bali
     */
        
    @JsonProperty("id_01")
  BALI,
    
    /**
     * id_02: バンドン // Bandung
     */
        
    @JsonProperty("id_02")
  BANDUNG,
    
    /**
     * id_03: バンジャルマシン // Banjarmasin
     */
        
    @JsonProperty("id_03")
  BANJARMASIN,
    
    /**
     * id_04: ジャボデタベック (ジャカルタ首都圏) // Jabodetabek
     */
        
    @JsonProperty("id_04")
  JABODETABEK,
    
    /**
     * id_06: マカッサル // Makassar
     */
        
    @JsonProperty("id_05")
  MAKASSAR,
    
    /**
     * id_07: メダン // Medan
     */
        
    @JsonProperty("id_06")
  MEDAN,
    
    /**
     * id_08: パレンバン // Palembang
     */
        
    @JsonProperty("id_07")
  PALEMBANG,
    
    /**
     * id_09: サマリンダ // Samarinda
     */
        
    @JsonProperty("id_08")
  SAMARINDA,
    
    /**
     * id_10: スマラン // Semarang
     */
        
    @JsonProperty("id_09")
  SEMARANG,
    
    /**
     * id_11: スラバヤ // Surabaya
     */
        
    @JsonProperty("id_10")
  SURABAYA,
    
    /**
     * id_12: ジョグジャカルタ // Yogyakarta
     */
        
    @JsonProperty("id_11")
  YOGYAKARTA,
    
    /**
     * id_05: その他のエリア // Lainnya
     */
        
    @JsonProperty("id_12")
  LAINNYA,
    

    @JsonEnumDefaultValue
    UNDEFINED
}
