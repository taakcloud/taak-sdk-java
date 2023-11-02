package com.taakcloud.sdk;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.taakcloud.sdk.webpush.WebPushSendCommand;

import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/v1")
@RegisterRestClient
public interface AppClientAsync extends AutoCloseable {

	@POST
	@Path("/web-push/send")
	Uni<Response> sendWebPush(@HeaderParam("X-TAAK-API-KEY") String taakApiKey, WebPushSendCommand cmd);

}
