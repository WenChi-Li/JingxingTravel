package tw.jingxing.groupTourSystem.model.bean;

import java.util.Date;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "grouptour")
@Component
public class GroupTourBean {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "grouptourid")
	private int groupTourID ;
	
//	行程名稱
	@Column(name = "itineraryname")
	private String itineraryName;
	
//	行程縮圖片
	@Column(name = "itineraryimage")
	private String itineraryImage;
	
//	行程代碼(TW243K1001...)
	@Column(name = "itinerarycode")
	private String itineraryCode;
	
//	行程特色照片123
	@Column(name = "featureimage1")
	private String featureImage1;
	
	@Column(name = "featureimage2")
	private String featureImage2;
	
	@Column(name = "featureimage3")
	private String featureImage3;
	
//	行程特色說明123
	@Column(name = "feature1")	
	private String feature1;
	
	@Column(name = "feature2")
	private String feature2;
	
	@Column(name = "feature3")
	private String feature3;
	
//	行程內容(D1~~D3)
	@Column(name = "itinerarycontent")
	private String itineraryContent;
	
//	席次人數
	@Column(name = "seatcapacity")
	private String seatCapacity;
	
//	去程日期
	@Column(name = "departuredate")
	private Date departureDate;

//	去程交通
	@Column(name = "departuretransport")
	private String departureTransport;
	
//	回程日期
	@Column(name = "returndate")
	private Date returnDate;
	
//	回程交通
	@Column(name = "returntransport")
	private String returnTransport;
	
	@Column(name = "price")
	private String price;
	
	@Column(name = "note")
	private String note;
	
	
	
	public GroupTourBean() {
	}

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

	public String getItineraryImage() {
		return itineraryImage;
	}

	public void setItineraryImage(String itineraryImage) {
		this.itineraryImage = itineraryImage;
	}

	public String getItineraryCode() {
		return itineraryCode;
	}

	public void setItineraryCode(String itineraryCode) {
		this.itineraryCode = itineraryCode;
	}

	public String getFeatureImage1() {
		return featureImage1;
	}

	public void setFeatureImage1(String featureImage1) {
		this.featureImage1 = featureImage1;
	}

	public String getFeatureImage2() {
		return featureImage2;
	}

	public void setFeatureImage2(String featureImage2) {
		this.featureImage2 = featureImage2;
	}

	public String getFeatureImage3() {
		return featureImage3;
	}

	public void setFeatureImage3(String featureImage3) {
		this.featureImage3 = featureImage3;
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

	public GroupTourBean(int groupTourID, String itineraryName, String itineraryImage, String itineraryCode,
			String featureImage1, String featureImage2, String featureImage3, String feature1, String feature2,
			String feature3, String itineraryContent, String seatCapacity, Date departureDate,
			String departureTransport, Date returnDate, String returnTransport, String price, String note) {
		super();
		this.groupTourID = groupTourID;
		this.itineraryName = itineraryName;
		this.itineraryImage = itineraryImage;
		this.itineraryCode = itineraryCode;
		this.featureImage1 = featureImage1;
		this.featureImage2 = featureImage2;
		this.featureImage3 = featureImage3;
		this.feature1 = feature1;
		this.feature2 = feature2;
		this.feature3 = feature3;
		this.itineraryContent = itineraryContent;
		this.seatCapacity = seatCapacity;
		this.departureDate = departureDate;
		this.departureTransport = departureTransport;
		this.returnDate = returnDate;
		this.returnTransport = returnTransport;
		this.price = price;
		this.note = note;
	}

	public GroupTourBean(String itineraryName, String itineraryImage, String itineraryCode, String featureImage1,
			String featureImage2, String featureImage3, String feature1, String feature2, String feature3,
			String itineraryContent, String seatCapacity, Date departureDate, String departureTransport,
			Date returnDate, String returnTransport, String price, String note) {
		super();
		this.itineraryName = itineraryName;
		this.itineraryImage = itineraryImage;
		this.itineraryCode = itineraryCode;
		this.featureImage1 = featureImage1;
		this.featureImage2 = featureImage2;
		this.featureImage3 = featureImage3;
		this.feature1 = feature1;
		this.feature2 = feature2;
		this.feature3 = feature3;
		this.itineraryContent = itineraryContent;
		this.seatCapacity = seatCapacity;
		this.departureDate = departureDate;
		this.departureTransport = departureTransport;
		this.returnDate = returnDate;
		this.returnTransport = returnTransport;
		this.price = price;
		this.note = note;
	}

	@Override
	public String toString() {
		return "GroupTourBean [groupTourID=" + groupTourID + ", itineraryName=" + itineraryName + ", itineraryImage="
				+ itineraryImage + ", itineraryCode=" + itineraryCode + ", featureImage1=" + featureImage1
				+ ", featureImage2=" + featureImage2 + ", featureImage3=" + featureImage3 + ", feature1=" + feature1
				+ ", feature2=" + feature2 + ", feature3=" + feature3 + ", itineraryContent=" + itineraryContent
				+ ", seatCapacity=" + seatCapacity + ", departureDate=" + departureDate
				+ ", departureTransport=" + departureTransport + ", returnDate=" + returnDate + ", returnTransport="
				+ returnTransport + ", price=" + price + ", note=" + note + "]";
	}
}




