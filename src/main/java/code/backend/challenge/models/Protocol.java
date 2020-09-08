package code.backend.challenge.models;

import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonProperty;

@Embeddable
public class Protocol {
	@JsonProperty("NetworkProtocol")
	private String NetworkProtocol;
	@JsonProperty("NetworkWireless")
	private String NetworkWireless;
	
	public Protocol() {
		super();
	}
	
	public Protocol(String networkProtocol, String networkWireless) {
		super();
		NetworkProtocol = networkProtocol;
		NetworkWireless = networkWireless;
	}

	@JsonProperty("NetworkProtocol")
	public String getNetworkProtocol() {
		return NetworkProtocol;
	}
	public void setNetworkProtocol(String networkProtocol) {
		NetworkProtocol = networkProtocol;
	}
	@JsonProperty("NetworkWireless")
	public String getNetworkWireless() {
		return NetworkWireless;
	}
	public void setNetworkWireless(String networkWireless) {
		NetworkWireless = networkWireless;
	}
	
}
