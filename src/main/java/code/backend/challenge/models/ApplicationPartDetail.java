package code.backend.challenge.models;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@Embeddable
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE,
setterVisibility=JsonAutoDetect.Visibility.NONE, creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class ApplicationPartDetail {
	
	 @JsonProperty("FilePN") 
	private String FilePN;
	 @JsonProperty("FrozenStatus") 
	private boolean FrozenStatus;
	 @JsonProperty("SuccessorPartNumber") 
	private String SuccessorPartNumber;
	 @JsonProperty("MGMFile")
	 @Embedded
	 private MGMFile MGMFile;
	 @JsonProperty("Version") 
	private String Version;
	 @JsonProperty("RunTimeSize") 
	private String RunTimeSize;
	
	public ApplicationPartDetail() {
		super();
	}
	

	public ApplicationPartDetail(String filePN, boolean frozenStatus, String successorPartNumber,MGMFile mGMFile, String version, String runTimeSize) {
		super();
		FilePN = filePN;
		FrozenStatus = frozenStatus;
		SuccessorPartNumber = successorPartNumber;
		MGMFile = mGMFile;
		Version = version;
		RunTimeSize = runTimeSize;
	}

	@JsonProperty("MGMFile")
	public MGMFile getMGMFile() {
		return MGMFile;
	}


	public void setMGMFile(MGMFile mGMFile) {
		MGMFile = mGMFile;
	}


	@JsonProperty("FilePN")
	public String getFilePN() {
		return FilePN;
	}

	public void setFilePN(String filePN) {
		FilePN = filePN;
	}
	@JsonProperty("FrozenStatus")
	public boolean isFrozenStatus() {
		return FrozenStatus;
	}

	public void setFrozenStatus(boolean frozenStatus) {
		FrozenStatus = frozenStatus;
	}
	@JsonProperty("SuccessorPartNumber")
	public String getSuccessorPartNumber() {
		return SuccessorPartNumber;
	}

	public void setSuccessorPartNumber(String successorPartNumber) {
		SuccessorPartNumber = successorPartNumber;
	}
	@JsonProperty("Version")
	public String getVersion() {
		return Version;
	}

	public void setVersion(String version) {
		Version = version;
	}
	@JsonProperty("RunTimeSize")
	public String getRunTimeSize() {
		return RunTimeSize;
	}

	public void setRunTimeSize(String runTimeSize) {
		RunTimeSize = runTimeSize;
	}
	
}
