package Project.CarRecogAPI.CarRecogAPI;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown= true)
public class Bottom_Right {
	
	@JsonProperty("x")
	private long x;
	@JsonProperty("y")
	private long y;
	public long getX() {
		return x;
	}
	public void setX(long x) {
		this.x = x;
	}
	public long getY() {
		return y;
	}
	public void setY(long y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "BottomRight {x=" + x + ", /ny=" + y + "}";
	}

	
	
}
