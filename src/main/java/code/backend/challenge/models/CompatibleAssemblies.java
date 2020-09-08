package code.backend.challenge.models;

import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@Embeddable
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE,
setterVisibility=JsonAutoDetect.Visibility.NONE, creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class CompatibleAssemblies {
    @JsonProperty("AssyPN") 
	private String AssyPN;

	public CompatibleAssemblies() {
		super();
	}

	public CompatibleAssemblies(String assyPN) {
		super();
		AssyPN = assyPN;
	}
	@JsonProperty("AssyPN") 
	public String getAssyPN() {
		return AssyPN;
	}

	public void setAssyPN(String assyPN) {
		AssyPN = assyPN;
	}

}
