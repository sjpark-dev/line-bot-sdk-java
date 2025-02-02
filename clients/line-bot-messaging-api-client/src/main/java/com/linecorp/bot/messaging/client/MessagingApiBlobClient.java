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

package com.linecorp.bot.messaging.client;
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

import java.io.File;
import com.linecorp.bot.messaging.model.GetMessageContentTranscodingResponse;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@javax.annotation.Generated(value = "com.linecorp.bot.codegen.LineJavaCodegenGenerator")
public interface MessagingApiBlobClient {

        /**
        * 
        * Download image, video, and audio data sent from users.
            * @param messageId Message ID of video or audio (required)
    * 
     * @see <a href="https://developers.line.biz/en/reference/messaging-api/#get-content"> Documentation</a>
    */
    
    @Streaming
    
    @GET("/v2/bot/message/{messageId}/content")
    
    CompletableFuture<Result<BlobContent>> getMessageContent(@Path("messageId") String messageId
    );


        /**
        * 
        * Get a preview image of the image or video
            * @param messageId Message ID of image or video (required)
    * 
     * @see <a href="https://developers.line.biz/en/reference/messaging-api/#get-image-or-video-preview"> Documentation</a>
    */
    
    @Streaming
    
    @GET("/v2/bot/message/{messageId}/content/preview")
    
    CompletableFuture<Result<BlobContent>> getMessageContentPreview(@Path("messageId") String messageId
    );


        /**
        * 
        * Verify the preparation status of a video or audio for getting
            * @param messageId Message ID of video or audio (required)
    * 
     * @see <a href="https://developers.line.biz/en/reference/messaging-api/#verify-video-or-audio-preparation-status"> Documentation</a>
    */
    
    
    @GET("/v2/bot/message/{messageId}/content/transcoding")
    
    CompletableFuture<Result<GetMessageContentTranscodingResponse>> getMessageContentTranscodingByMessageId(@Path("messageId") String messageId
    );


        /**
        * 
        * Download rich menu image.
            * @param richMenuId ID of the rich menu with the image to be downloaded (required)
    * 
     * @see <a href="https://developers.line.biz/en/reference/messaging-api/#download-rich-menu-image"> Documentation</a>
    */
    
    @Streaming
    
    @GET("/v2/bot/richmenu/{richMenuId}/content")
    
    CompletableFuture<Result<BlobContent>> getRichMenuImage(@Path("richMenuId") String richMenuId
    );


        /**
        * 
        * Upload rich menu image
            * @param richMenuId The ID of the rich menu to attach the image to (required)
            * @param body  (optional)
    * 
     * @see <a href="https://developers.line.biz/en/reference/messaging-api/#upload-rich-menu-image"> Documentation</a>
    */
    
    
    @POST("/v2/bot/richmenu/{richMenuId}/content")
    
    CompletableFuture<Result<Void>> setRichMenuImage(@Path("richMenuId") String richMenuId, @Body UploadFile body
    );




    public static ApiAuthenticatedClientBuilder<MessagingApiBlobClient> builder(String channelToken) {
        return new ApiAuthenticatedClientBuilder<>(URI.create("https://api-data.line.me"), MessagingApiBlobClient.class, new MessagingApiExceptionBuilder(), channelToken);
    }
    public static ApiAuthenticatedClientBuilder<MessagingApiBlobClient> builder(ChannelTokenSupplier channelTokenSupplier) {
        return new ApiAuthenticatedClientBuilder<>(URI.create("https://api-data.line.me"), MessagingApiBlobClient.class, new MessagingApiExceptionBuilder(), channelTokenSupplier);
    }


}
