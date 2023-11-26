package com.taakcloud.sdk;

import java.net.URI;

import org.eclipse.microprofile.rest.client.RestClientBuilder;

import com.taakcloud.sdk.webpush.WebPushSendCommand;

import jakarta.ws.rs.core.Response;

public class TaakSDK {
    private final String apiKey;
    private String appHost = "https://app-api.taakcloud.com";

    public TaakSDK(String apiKey) {
        this.apiKey = apiKey;
    }

    public TaakSDK(String apiKey, String appHost) {
        this.apiKey = apiKey;
        this.appHost = appHost;
    }

    public Response sendWebPush(WebPushSendCommand cmd) {
        AppClient client = RestClientBuilder.newBuilder().baseUri(baseUri()).build(AppClient.class);
        return client.sendWebPush(apiKey, cmd);
    }

    public Response sendWebPushMulti(WebPushSendCommand cmd) {
        AppClient client = RestClientBuilder.newBuilder().baseUri(baseUri()).build(AppClient.class);
        return client.sendWebPushMulti(apiKey, cmd);
    }

    public URI baseUri() {
        return URI.create(appHost);
    }

}
