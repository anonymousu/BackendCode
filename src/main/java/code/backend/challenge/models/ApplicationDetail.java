package code.backend.challenge.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="Application_Detail")
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE,
setterVisibility=JsonAutoDetect.Visibility.NONE, creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class ApplicationDetail {

	@JsonProperty("SubType")
	@Id
	private String SubType;
	
	 @JsonProperty("Values")
	@ElementCollection
	@Column(name = "val")
	private List<String> Values;
	 @Embedded
	 @JsonProperty("ApplicationPartDetail") 
	private ApplicationPartDetail ApplicationPartDetail;
	 @JsonProperty("ApplicationDescription") 
	private String ApplicationDescription;
	 @JsonProperty("Serviceable") 
	private String Serviceable;
	 @JsonProperty("Testable") 
	private String Testable;
	 @ElementCollection
	 @JsonProperty("CompatibleAssemblies") 
	private List<CompatibleAssemblies> CompatibleAssemblies;
	@Embedded
	 @JsonProperty("FunctionalTypeValues") 
	private FunctionalTypeValues FunctionalTypeValues;
	 @JsonProperty("Sellable") 
	private String Sellable;
	 @JsonProperty("ResidentOnVehicle") 
	private String ResidentOnVehicle;
	 @JsonProperty("DigitallySigned") 
	private String DigitallySigned;
	 @JsonProperty("ConsumerViewable") 
	private String ConsumerViewable;
	 @JsonProperty("ConsumerDownloadable") 
	private String ConsumerDownloadable;
	 @JsonProperty("DealerDownloadable") 
	private String DealerDownloadable;
	 @JsonProperty("OTAViewable") 
	private String OTAViewable;
	 @JsonProperty("OTADownloadable") 
	private String OTADownloadable;
	
	public ApplicationDetail() {
		super();
	}


	public ApplicationDetail(String subType, List<String> values,
			code.backend.challenge.models.ApplicationPartDetail applicationPartDetail, String applicationDescription,
			String serviceable, String testable,
			List<code.backend.challenge.models.CompatibleAssemblies> compatibleAssemblies,
			code.backend.challenge.models.FunctionalTypeValues functionalTypeValues, String sellable,
			String residentOnVehicle, String digitallySigned, String consumerViewable, String consumerDownloadable,
			String dealerDownloadable, String oTAViewable, String oTADownloadable) {
		super();
		SubType = subType;
		Values = values;
		ApplicationPartDetail = applicationPartDetail;
		ApplicationDescription = applicationDescription;
		Serviceable = serviceable;
		Testable = testable;
		CompatibleAssemblies = compatibleAssemblies;
		FunctionalTypeValues = functionalTypeValues;
		Sellable = sellable;
		ResidentOnVehicle = residentOnVehicle;
		DigitallySigned = digitallySigned;
		ConsumerViewable = consumerViewable;
		ConsumerDownloadable = consumerDownloadable;
		DealerDownloadable = dealerDownloadable;
		OTAViewable = oTAViewable;
		OTADownloadable = oTADownloadable;
	}



	@JsonProperty("SubType")
	public String getSubType() {
		return SubType;
	}
	public void setSubType(String subType) {
		SubType = subType;
	}
	
	@JsonProperty("Values")
	public List<String> getValues() {
		return Values;
	}

	public void setValues(List<String> values) {
		Values = values;
	}
	@JsonProperty("ApplicationDescription")
	public String getApplicationDescription() {
		return ApplicationDescription;
	}
	public void setApplicationDescription(String applicationDescription) {
		ApplicationDescription = applicationDescription;
	}
	@JsonProperty("Serviceable")
	public String getServiceable() {
		return Serviceable;
	}
	public void setServiceable(String serviceable) {
		Serviceable = serviceable;
	}
	@JsonProperty("Testable")
	public String getTestable() {
		return Testable;
	}
	public void setTestable(String testable) {
		Testable = testable;
	}
	@JsonProperty("Sellable")
	public String getSellable() {
		return Sellable;
	}
	public void setSellable(String sellable) {
		Sellable = sellable;
	}
	@JsonProperty("ResidentOnVehicle")
	public String getResidentOnVehicle() {
		return ResidentOnVehicle;
	}
	public void setResidentOnVehicle(String residentOnVehicle) {
		ResidentOnVehicle = residentOnVehicle;
	}
	@JsonProperty("DigitallySigned")
	public String getDigitallySigned() {
		return DigitallySigned;
	}
	public void setDigitallySigned(String digitallySigned) {
		DigitallySigned = digitallySigned;
	}
	@JsonProperty("ConsumerViewable")
	public String getConsumerViewable() {
		return ConsumerViewable;
	}
	public void setConsumerViewable(String consumerViewable) {
		ConsumerViewable = consumerViewable;
	}
	@JsonProperty("ConsumerDownloadable")
	public String getConsumerDownloadable() {
		return ConsumerDownloadable;
	}
	public void setConsumerDownloadable(String consumerDownloadable) {
		ConsumerDownloadable = consumerDownloadable;
	}
	@JsonProperty("DealerDownloadable")
	public String getDealerDownloadable() {
		return DealerDownloadable;
	}
	public void setDealerDownloadable(String dealerDownloadable) {
		DealerDownloadable = dealerDownloadable;
	}
	@JsonProperty("OTAViewable")
	public String getOTAViewable() {
		return OTAViewable;
	}
	public void setOTAViewable(String oTAViewable) {
		OTAViewable = oTAViewable;
	}
	@JsonProperty("OTADownloadable")
	public String getOTADownloadable() {
		return OTADownloadable;
	}
	public void setOTADownloadable(String oTADownloadable) {
		OTADownloadable = oTADownloadable;
	}
	@JsonProperty("CompatibleAssemblies")
	public List<CompatibleAssemblies> getCompatibleAssemblies() {
		return CompatibleAssemblies;
	}
	public void setCompatibleAssemblies(List<CompatibleAssemblies> compatibleAssemblies) {
		CompatibleAssemblies = compatibleAssemblies;
	}
	@JsonProperty("FunctionalTypeValues")
	public FunctionalTypeValues getFunctionalTypeValues() {
		return FunctionalTypeValues;
	}
	public void setFunctionalTypeValues(FunctionalTypeValues functionalTypeValues) {
		FunctionalTypeValues = functionalTypeValues;
	}
	@JsonProperty("ApplicationPartDetail")
	public ApplicationPartDetail getApplicationPartDetail() {
		return ApplicationPartDetail;
	}
	public void setApplicationPartDetail(ApplicationPartDetail applicationPartDetail) {
		ApplicationPartDetail = applicationPartDetail;
	}

	
}
