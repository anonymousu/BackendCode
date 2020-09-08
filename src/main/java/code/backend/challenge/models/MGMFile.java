package code.backend.challenge.models;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE,
setterVisibility=JsonAutoDetect.Visibility.NONE, creatorVisibility=JsonAutoDetect.Visibility.NONE)
@Embeddable
public class MGMFile {

	@ElementCollection
	private List<Protocol> Protocol;

	@JsonProperty("FileFormat")
	private String FileFormat;
	 @JsonProperty("Checksum")
	private String Checksum;
	 @JsonProperty("FileFingerprint") 
	private String FileFingerprint;
	 @JsonProperty("ROMSizeKB") 
	private String ROMSizeKB;
	 @JsonProperty("Size")
	private String Size;
	 @JsonProperty("FileDateModified")
	private String FileDateModified;
	
	public MGMFile() {
		super();
	}
	
	public MGMFile(List<code.backend.challenge.models.Protocol> protocol, String fileFormat, String checksum,
			String fileFingerprint, String rOMSizeKB, String size, String fileDateModified) {
		super();
		Protocol = protocol;
		FileFormat = fileFormat;
		Checksum = checksum;
		FileFingerprint = fileFingerprint;
		ROMSizeKB = rOMSizeKB;
		Size = size;
		FileDateModified = fileDateModified;
	}

	@JsonProperty("Protocol")
	public List<Protocol> getProtocol() {
		return Protocol;
	}

	public void setProtocol(List<Protocol> protocol) {
		Protocol = protocol;
	}

	@JsonProperty("FileFormat")
	public String getFileFormat() {
		return FileFormat;
	}


	public void setFileFormat(String fileFormat) {
		FileFormat = fileFormat;
	}

	@JsonProperty("Checksum")
	public String getChecksum() {
		return Checksum;
	}


	public void setChecksum(String checksum) {
		Checksum = checksum;
	}

	@JsonProperty("FileFingerprint")
	public String getFileFingerprint() {
		return FileFingerprint;
	}


	public void setFileFingerprint(String fileFingerprint) {
		FileFingerprint = fileFingerprint;
	}

	@JsonProperty("ROMSizeKB")
	public String getROMSizeKB() {
		return ROMSizeKB;
	}


	public void setROMSizeKB(String rOMSizeKB) {
		ROMSizeKB = rOMSizeKB;
	}

	@JsonProperty("Size")
	public String getSize() {
		return Size;
	}


	public void setSize(String size) {
		Size = size;
	}

	@JsonProperty("FileDateModified")
	public String getFileDateModified() {
		return FileDateModified;
	}


	public void setFileDateModified(String fileDateModified) {
		FileDateModified = fileDateModified;
	}
	
}
