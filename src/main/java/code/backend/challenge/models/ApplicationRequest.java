package code.backend.challenge.models;

public class ApplicationRequest {
	
	private String FilePN;
	private String SubType;
	
	public ApplicationRequest() {
		super();
	}
	public ApplicationRequest(String filePN, String subType) {
		super();
		FilePN = filePN;
		SubType = subType;
	}
	
	public String getFilePN() {
		return FilePN;
	}
	public void setFilePN(String filePN) {
		FilePN = filePN;
	}
	public String getSubType() {
		return SubType;
	}
	public void setSubType(String subType) {
		SubType = subType;
	}
	
	

}
