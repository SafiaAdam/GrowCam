package Project.CarRecogAPI.CarRecogAPI;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown= true )
public class Tags {
	
	private Top_Left top_left = new Top_Left();
	private Bottom_Right bottom_right = new Bottom_Right();
	@JsonProperty("ip_detection_confidence")
	private String ip_detection_confidence;
	@JsonProperty("category")
	private String category;
	@JsonProperty("category_score")
	private String category_score;
	@JsonProperty("make")
	private String make;
	@JsonProperty("make_score")
	private String make_score;
	@JsonProperty("model")
	private String model;
	@JsonProperty("model_score")
	private String model_score;
	@JsonProperty("generation")
	private String generation;
	@JsonProperty("generation_score")
	private String generation_score;
	@JsonProperty("variation")
	private String variation;
	@JsonProperty("variation_score")
	private String variation_score;
	@JsonProperty("color")
	private String color;
	@JsonProperty("color_score")
	private String color_score;
	@JsonProperty("ilpc")
	private String ilpc;
	@JsonProperty("view")
	private String view;
	@JsonProperty("auto_detection")
	private String  auto_detection;
	public Top_Left getTop_left() {
		return top_left;
	}
	public void setTop_left(Top_Left top_left) {
		this.top_left = top_left;
	}
	public Bottom_Right getBottom_right() {
		return bottom_right;
	}
	public void setBottom_right(Bottom_Right bottom_right) {
		this.bottom_right = bottom_right;
	}
	public String getIp_detection_confidence() {
		return ip_detection_confidence;
	}
	public void setIp_detection_confidence(String ip_detection_confidence) {
		this.ip_detection_confidence = ip_detection_confidence;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCategory_score() {
		return category_score;
	}
	public void setCategory_score(String category_score) {
		this.category_score = category_score;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getMake_score() {
		return make_score;
	}
	public void setMake_score(String make_score) {
		this.make_score = make_score;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getModel_score() {
		return model_score;
	}
	public void setModel_score(String model_score) {
		this.model_score = model_score;
	}
	public String getGeneration() {
		return generation;
	}
	public void setGeneration(String generation) {
		this.generation = generation;
	}
	public String getGeneration_score() {
		return generation_score;
	}
	public void setGeneration_score(String generation_score) {
		this.generation_score = generation_score;
	}
	public String getVariation() {
		return variation;
	}
	public void setVariation(String variation) {
		this.variation = variation;
	}
	public String getVariation_score() {
		return variation_score;
	}
	public void setVariation_score(String variation_score) {
		this.variation_score = variation_score;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor_score() {
		return color_score;
	}
	public void setColor_score(String color_score) {
		this.color_score = color_score;
	}
	public String getIlpc() {
		return ilpc;
	}
	public void setIlpc(String ilpc) {
		this.ilpc = ilpc;
	}
	public String getView() {
		return view;
	}
	public void setView(String view) {
		this.view = view;
	}
	public String getAuto_detection() {
		return auto_detection;
	}
	public void setAuto_detection(String auto_detection) {
		this.auto_detection = auto_detection;
	}
	@Override
	public String toString() {
		return "Tags {top_left=" + top_left + ", \nbottom_right=" + bottom_right + ", \nip_detection_confidence="
				+ ip_detection_confidence + ", \ncategory=" + category + ", \ncategory_score=" + category_score + ", \nmake="
				+ make + ", \nmake_score=" + make_score + ", \nmodel=" + model + ", \nmodel_score=" + model_score
				+ ", \ngeneration=" + generation + ", \ngeneration_score=" + generation_score + ", \nvariation=" + variation
				+ ", variation_score=" + variation_score + ", color=" + color + ", color_score=" + color_score
				+ ", \nilpc=" + ilpc + ", \nview=" + view + ", \nauto_detection=" + auto_detection + "}";
	}
	
	
	
	

}
