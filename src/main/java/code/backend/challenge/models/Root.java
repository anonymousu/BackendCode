package code.backend.challenge.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE,
setterVisibility=JsonAutoDetect.Visibility.NONE, creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class Root { 

public Root() {
		super();
	}


@JsonProperty("ApplicationDetail")
private List<ApplicationDetail> ApplicationDetail;


public Root(List<ApplicationDetail> ApplicationDetail) {
	super();
	this.ApplicationDetail = ApplicationDetail;
}

public void setApplicationDetail(List<ApplicationDetail> ApplicationDetail){
    this.ApplicationDetail = ApplicationDetail;
}
@JsonProperty("ApplicationDetail")
public List<ApplicationDetail> getApplicationDetail(){
    return this.ApplicationDetail;
}
}

