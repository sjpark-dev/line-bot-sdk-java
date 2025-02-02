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

package com.linecorp.bot.liff.client;
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

import com.linecorp.bot.liff.model.AddLiffAppRequest;
import com.linecorp.bot.liff.model.AddLiffAppResponse;
import com.linecorp.bot.liff.model.GetAllLiffAppsResponse;
import com.linecorp.bot.liff.model.UpdateLiffAppRequest;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@javax.annotation.Generated(value = "com.linecorp.bot.codegen.LineJavaCodegenGenerator")
public interface LiffClient {

        /**
        * 
        * Adding the LIFF app to a channel
            * @param addLiffAppRequest  (required)
    * 
     * @see <a href="https://developers.line.biz/en/reference/liff-server/#add-liff-app"> Documentation</a>
    */
    
    
    @POST("/liff/v1/apps")
    
    CompletableFuture<Result<AddLiffAppResponse>> addLIFFApp(@Body AddLiffAppRequest addLiffAppRequest
    );


        /**
        * Delete LIFF app from a channel
        * Deletes a LIFF app from a channel. 
            * @param liffId ID of the LIFF app to be updated (required)
    * 
     * @see <a href="https://developers.line.biz/en/reference/liff-server/#delete-liff-app">Delete LIFF app from a channel Documentation</a>
    */
    
    
    @DELETE("/liff/v1/apps/{liffId}")
    
    CompletableFuture<Result<Void>> deleteLIFFApp(@Path("liffId") String liffId
    );


        /**
        * Get all LIFF apps
        * Gets information on all the LIFF apps added to the channel.
    * 
     * @see <a href="https://developers.line.biz/en/reference/liff-server/#get-all-liff-apps">Get all LIFF apps Documentation</a>
    */
    
    
    @GET("/liff/v1/apps")
    
    CompletableFuture<Result<GetAllLiffAppsResponse>> getAllLIFFApps(
    );


        /**
        * 
        * Update LIFF app settings
            * @param liffId ID of the LIFF app to be updated (required)
            * @param updateLiffAppRequest  (required)
    * 
     * @see <a href="https://developers.line.biz/en/reference/liff-server/#update-liff-app"> Documentation</a>
    */
    
    
    @PUT("/liff/v1/apps/{liffId}")
    
    CompletableFuture<Result<Void>> updateLIFFApp(@Path("liffId") String liffId, @Body UpdateLiffAppRequest updateLiffAppRequest
    );




    public static ApiAuthenticatedClientBuilder<LiffClient> builder(String channelToken) {
        return new ApiAuthenticatedClientBuilder<>(URI.create("https://api.line.me"), LiffClient.class, new LiffExceptionBuilder(), channelToken);
    }
    public static ApiAuthenticatedClientBuilder<LiffClient> builder(ChannelTokenSupplier channelTokenSupplier) {
        return new ApiAuthenticatedClientBuilder<>(URI.create("https://api.line.me"), LiffClient.class, new LiffExceptionBuilder(), channelTokenSupplier);
    }

@Deprecated
default CompletableFuture<Result<GetAllLiffAppsResponse>> liffV1AppsGet() {
    return getAllLIFFApps();
}

@Deprecated
default CompletableFuture<Result<Void>> liffV1AppsLiffIdDelete(@Path("liffId") String liffId) {
    return deleteLIFFApp(liffId);
}

@Deprecated
default CompletableFuture<Result<Void>> liffV1AppsLiffIdPut(
    @Path("liffId") String liffId,
    @Body UpdateLiffAppRequest updateLiffAppRequest) {
    return updateLIFFApp(liffId, updateLiffAppRequest);
}

@Deprecated
default CompletableFuture<Result<AddLiffAppResponse>> liffV1AppsPost(@Body AddLiffAppRequest addLiffAppRequest) {
    return addLIFFApp(addLiffAppRequest);
}

}
