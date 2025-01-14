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

package com.linecorp.bot.shop.client;
import java.net.URI;

import java.util.concurrent.CompletableFuture;

import com.linecorp.bot.client.base.ApiAuthenticatedClientBuilder;
import com.linecorp.bot.client.base.ApiClientBuilder;
import com.linecorp.bot.client.base.Result;
import com.linecorp.bot.client.base.BlobContent;
import com.linecorp.bot.client.base.UploadFile;
import com.linecorp.bot.client.base.channel.ChannelTokenSupplier;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.MultipartBody;

import com.linecorp.bot.shop.model.MissionStickerRequest;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@javax.annotation.Generated(value = "com.linecorp.bot.codegen.LineJavaCodegenGenerator")
public interface ShopClient {

        /**
        * 
        * Sends a mission sticker.
            * @param missionStickerRequest  (required)
    * 
     * @see <a href="https://developers.line.biz/en/reference/partner-docs/#send-mission-stickers-v3"> Documentation</a>
    */
    
    
    @POST("/shop/v3/mission")
    
    CompletableFuture<Result<Void>> missionStickerV3(@Body MissionStickerRequest missionStickerRequest
    );




    public static ApiAuthenticatedClientBuilder<ShopClient> builder(String channelToken) {
        return new ApiAuthenticatedClientBuilder<>(URI.create("https://api.line.me"), ShopClient.class, new ShopExceptionBuilder(), channelToken);
    }
    public static ApiAuthenticatedClientBuilder<ShopClient> builder(ChannelTokenSupplier channelTokenSupplier) {
        return new ApiAuthenticatedClientBuilder<>(URI.create("https://api.line.me"), ShopClient.class, new ShopExceptionBuilder(), channelTokenSupplier);
    }


}
