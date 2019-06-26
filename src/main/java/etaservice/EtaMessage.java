package etaservice;

import com.google.gson.Gson;

public class EtaMessage {
	private String lattitude;
	private String longitude;
	private int eta;
	private String notes;
	private String timestamp;
	private String lastHardFix;
	private String orderId;
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getLattitude() {
		return lattitude;
	}
	
	public void setLattitude(String lattitude) {
		this.lattitude = lattitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getLastHardFix() {
		return lastHardFix;
	}
	public void setLastHardFix(String lastHardFix) {
		this.lastHardFix = lastHardFix;
	}
	
	public String toString()
	{
	Gson gson = new Gson();
	String jsonString = gson.toJson(this);
	return jsonString;	
	}
}
