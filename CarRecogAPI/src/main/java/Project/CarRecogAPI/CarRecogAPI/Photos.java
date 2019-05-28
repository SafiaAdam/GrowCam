package Project.CarRecogAPI.CarRecogAPI;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Photos {
	
	@JsonProperty("width")
	private String width;
	@JsonProperty("height")
	private String height;
	@JsonProperty("module_version")
	private String module_version;
	@JsonProperty("tags")
	private List<Tags>tags;
	public String getWidth() {
		return width;
	}
	public void setWidth(String width) {
		this.width = width;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getModule_version() {
		return module_version;
	}
	public void setModule_version(String module_version) {
		this.module_version = module_version;
	}
	public List<Tags> getTags() {
		return tags;
	}
	public void setTags(List<Tags> tags) {
		this.tags = tags;
	}
	@Override
	public String toString() {
		return "Photos {width=" + width + ", \nheight=" + height + ", \nmodule_version=" + module_version + ", \ntags=" + tags
				+ "}";
	}
	
	

}
