package com.taakcloud.sdk.webpush;

public class WebPushSendCommand {

	public String publicId;
	public String userId;
	public String deviceId;
	public String payload;
	public Integer timeToLive;
	public Urgency urgency;
	public String topic;

	public WebPushSendCommand() {
	}

	public WebPushSendCommand(String payload, String userId) {
		this(payload, userId, null, null, null, null, null);
	}

	public WebPushSendCommand(String payload, String userId, String topic, String deviceId, String publicId,
			Integer timeToLive, Urgency urgency) {
		this.payload = payload;
		this.userId = userId;
		this.topic = topic;
		this.deviceId = deviceId;
		this.publicId = publicId;
		this.timeToLive = timeToLive;
		this.urgency = urgency;
	}

	public String getPublicId() {
		return publicId;
	}

	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getPayload() {
		return payload;
	}

	public void setPayload(String payload) {
		this.payload = payload;
	}

	public Integer getTimeToLive() {
		return timeToLive;
	}

	public void setTimeToLive(Integer timeToLive) {
		this.timeToLive = timeToLive;
	}

	public Urgency getUrgency() {
		return urgency;
	}

	public void setUrgency(Urgency urgency) {
		this.urgency = urgency;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

}
