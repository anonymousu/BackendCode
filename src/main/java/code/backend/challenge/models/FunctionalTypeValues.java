package code.backend.challenge.models;

import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@Embeddable
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE,
setterVisibility=JsonAutoDetect.Visibility.NONE, creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class FunctionalTypeValues {
	 @JsonProperty("FunctionalType") 
	private String FunctionalType;

	public FunctionalTypeValues() {
		super();
	}

	public FunctionalTypeValues(String functionalType) {
		super();
		FunctionalType = functionalType;
	}
	@JsonProperty("FunctionalType") 
	public String getFunctionalType() {
		return FunctionalType;
	}

	public void setFunctionalType(String functionalType) {
		FunctionalType = functionalType;
	}
	

}
