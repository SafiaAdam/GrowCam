package Project.CarRecogAPI.CarRecogAPI;

import java.util.ArrayList;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown= true)
public class CarInfo {
	
	@JsonProperty("status")
	private String status;
	private ArrayList<Photos> photos = new ArrayList<Photos>();
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public ArrayList<Photos> getPhotos() {
		return photos;
	}
	public void setPhotos(ArrayList<Photos> photos) {
		this.photos = photos;
	}
	@Override
	public String toString() {
		return "CarInfo {status=" + status + ",\n\tphotos=" + photos + "}";
	}
	
	

}
