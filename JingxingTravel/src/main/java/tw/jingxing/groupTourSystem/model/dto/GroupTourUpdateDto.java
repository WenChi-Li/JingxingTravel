package tw.jingxing.groupTourSystem.model.dto;

import java.io.IOException;
import java.util.Base64;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

public class GroupTourUpdateDto {

	private int groupTourID ;
	
	private String itineraryName;
	
	private MultipartFile itineraryImage;
	
	private String itineraryImageBase64;
	
	private String itineraryCode;
	
	private MultipartFile featureImage1;
	
	private String featureImage1Base64;

	private MultipartFile featureImage2;

	private String featureImage2Base64;
	
	private MultipartFile featureImage3;

	private String featureImage3Base64;
	
	private String feature1;
	
	private String feature2;
	
	private String feature3;
	
	private String itineraryContent;
	
	private int capacity;
	
	private String seatCapacity;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date departureDate;
	
	private String departureTransport;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date returnDate;
	
	private String returnTransport;
	
	private String price;
	
	private String note;

	public int getGroupTourID() {
		return groupTourID;
	}

	public void setGroupTourID(int groupTourID) {
		this.groupTourID = groupTourID;
	}

	public String getItineraryName() {
		return itineraryName;
	}

	public void setItineraryName(String itineraryName) {
		this.itineraryName = itineraryName;
	}

	public MultipartFile getItineraryImage() {
		return itineraryImage;
	}

	public void setItineraryImage(MultipartFile itineraryImage) {
		
		String base64Image;
		try {
			base64Image = Base64.getEncoder().encodeToString(itineraryImage.getBytes());
			this.itineraryImageBase64=base64Image;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		this.itineraryImage = itineraryImage;
	}

	public String getItineraryImageBase64() {
		return itineraryImageBase64;
	}

	public void setItineraryImageBase64(String itineraryImageBase64) {
		this.itineraryImageBase64 = itineraryImageBase64;
	}

	public String getItineraryCode() {
		return itineraryCode;
	}

	public void setItineraryCode(String itineraryCode) {
		this.itineraryCode = itineraryCode;
	}

	public MultipartFile getFeatureImage1() {
		return featureImage1;
	}

	public void setFeatureImage1(MultipartFile featureImage1) {
		
		String base64Image;
		try {
			base64Image = Base64.getEncoder().encodeToString(featureImage1.getBytes());
			this.featureImage1Base64=base64Image;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		this.featureImage1 = featureImage1;
	}

	public String getFeatureImage1Base64() {
		return featureImage1Base64;
	}

	public void setFeatureImage1Base64(String featureImage1Base64) {
		this.featureImage1Base64 = featureImage1Base64;
	}

	public MultipartFile getFeatureImage2() {
		return featureImage2;
	}

	public void setFeatureImage2(MultipartFile featureImage2) {
		
		String base64Image;
		try {
			base64Image = Base64.getEncoder().encodeToString(featureImage2.getBytes());
			this.featureImage2Base64=base64Image;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		this.featureImage2 = featureImage2;
	}

	public String getFeatureImage2Base64() {
		return featureImage2Base64;
	}

	public void setFeatureImage2Base64(String featureImage2Base64) {
		this.featureImage2Base64 = featureImage2Base64;
	}

	public MultipartFile getFeatureImage3() {
		return featureImage3;
	}

	public void setFeatureImage3(MultipartFile featureImage3) {
		
		String base64Image;
		try {
			base64Image = Base64.getEncoder().encodeToString(featureImage3.getBytes());
			this.featureImage3Base64=base64Image;
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		this.featureImage3 = featureImage3;
	}

	public String getFeatureImage3Base64() {
		return featureImage3Base64;
	}

	public void setFeatureImage3Base64(String featureImage3Base64) {
		this.featureImage3Base64 = featureImage3Base64;
	}

	public String getFeature1() {
		return feature1;
	}

	public void setFeature1(String feature1) {
		this.feature1 = feature1;
	}

	public String getFeature2() {
		return feature2;
	}

	public void setFeature2(String feature2) {
		this.feature2 = feature2;
	}

	public String getFeature3() {
		return feature3;
	}

	public void setFeature3(String feature3) {
		this.feature3 = feature3;
	}

	public String getItineraryContent() {
		return itineraryContent;
	}

	public void setItineraryContent(String itineraryContent) {
		this.itineraryContent = itineraryContent;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getSeatCapacity() {
		return seatCapacity;
	}

	public void setSeatCapacity(String seatCapacity) {
		this.seatCapacity = seatCapacity;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public String getDepartureTransport() {
		return departureTransport;
	}

	public void setDepartureTransport(String departureTransport) {
		this.departureTransport = departureTransport;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public String getReturnTransport() {
		return returnTransport;
	}

	public void setReturnTransport(String returnTransport) {
		this.returnTransport = returnTransport;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "GroupTourUpdateDto [groupTourID=" + groupTourID + ", itineraryName=" + itineraryName
				+ ", itineraryImage=" + itineraryImage + ", itineraryImageBase64=" + itineraryImageBase64
				+ ", itineraryCode=" + itineraryCode + ", featureImage1=" + featureImage1 + ", featureImage1Base64="
				+ featureImage1Base64 + ", featureImage2=" + featureImage2 + ", featureImage2Base64="
				+ featureImage2Base64 + ", featureImage3=" + featureImage3 + ", featureImage3Base64="
				+ featureImage3Base64 + ", feature1=" + feature1 + ", feature2=" + feature2 + ", feature3=" + feature3
				+ ", itineraryContent=" + itineraryContent + ", capacity=" + capacity + ", seatCapacity=" + seatCapacity
				+ ", departureDate=" + departureDate + ", departureTransport=" + departureTransport + ", returnDate="
				+ returnDate + ", returnTransport=" + returnTransport + ", price=" + price + ", note=" + note + "]";
	}
	
}
