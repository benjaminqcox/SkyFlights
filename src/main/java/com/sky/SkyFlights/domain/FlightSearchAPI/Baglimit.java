
package com.sky.SkyFlights.domain.FlightSearchAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "hand_height",
    "hand_length",
    "hand_weight",
    "hand_width",
    "hold_dimensions_sum",
    "hold_height",
    "hold_length",
    "hold_weight",
    "hold_width",
    "personal_item_height",
    "personal_item_length",
    "personal_item_weight",
    "personal_item_width"
})
@Generated("jsonschema2pojo")
public class Baglimit {

    @JsonProperty("hand_height")
    private Integer handHeight;
    @JsonProperty("hand_length")
    private Integer handLength;
    @JsonProperty("hand_weight")
    private Integer handWeight;
    @JsonProperty("hand_width")
    private Integer handWidth;
    @JsonProperty("hold_dimensions_sum")
    private Integer holdDimensionsSum;
    @JsonProperty("hold_height")
    private Integer holdHeight;
    @JsonProperty("hold_length")
    private Integer holdLength;
    @JsonProperty("hold_weight")
    private Integer holdWeight;
    @JsonProperty("hold_width")
    private Integer holdWidth;
    @JsonProperty("personal_item_height")
    private Integer personalItemHeight;
    @JsonProperty("personal_item_length")
    private Integer personalItemLength;
    @JsonProperty("personal_item_weight")
    private Integer personalItemWeight;
    @JsonProperty("personal_item_width")
    private Integer personalItemWidth;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Baglimit() {
    }

    /**
     * 
     * @param holdLength
     * @param handHeight
     * @param personalItemWidth
     * @param holdHeight
     * @param personalItemWeight
     * @param handWeight
     * @param holdWeight
     * @param handLength
     * @param personalItemHeight
     * @param holdWidth
     * @param personalItemLength
     * @param handWidth
     * @param holdDimensionsSum
     */
    public Baglimit(Integer handHeight, Integer handLength, Integer handWeight, Integer handWidth, Integer holdDimensionsSum, Integer holdHeight, Integer holdLength, Integer holdWeight, Integer holdWidth, Integer personalItemHeight, Integer personalItemLength, Integer personalItemWeight, Integer personalItemWidth) {
        super();
        this.handHeight = handHeight;
        this.handLength = handLength;
        this.handWeight = handWeight;
        this.handWidth = handWidth;
        this.holdDimensionsSum = holdDimensionsSum;
        this.holdHeight = holdHeight;
        this.holdLength = holdLength;
        this.holdWeight = holdWeight;
        this.holdWidth = holdWidth;
        this.personalItemHeight = personalItemHeight;
        this.personalItemLength = personalItemLength;
        this.personalItemWeight = personalItemWeight;
        this.personalItemWidth = personalItemWidth;
    }

    @JsonProperty("hand_height")
    public Integer getHandHeight() {
        return handHeight;
    }

    @JsonProperty("hand_height")
    public void setHandHeight(Integer handHeight) {
        this.handHeight = handHeight;
    }

    public Baglimit withHandHeight(Integer handHeight) {
        this.handHeight = handHeight;
        return this;
    }

    @JsonProperty("hand_length")
    public Integer getHandLength() {
        return handLength;
    }

    @JsonProperty("hand_length")
    public void setHandLength(Integer handLength) {
        this.handLength = handLength;
    }

    public Baglimit withHandLength(Integer handLength) {
        this.handLength = handLength;
        return this;
    }

    @JsonProperty("hand_weight")
    public Integer getHandWeight() {
        return handWeight;
    }

    @JsonProperty("hand_weight")
    public void setHandWeight(Integer handWeight) {
        this.handWeight = handWeight;
    }

    public Baglimit withHandWeight(Integer handWeight) {
        this.handWeight = handWeight;
        return this;
    }

    @JsonProperty("hand_width")
    public Integer getHandWidth() {
        return handWidth;
    }

    @JsonProperty("hand_width")
    public void setHandWidth(Integer handWidth) {
        this.handWidth = handWidth;
    }

    public Baglimit withHandWidth(Integer handWidth) {
        this.handWidth = handWidth;
        return this;
    }

    @JsonProperty("hold_dimensions_sum")
    public Integer getHoldDimensionsSum() {
        return holdDimensionsSum;
    }

    @JsonProperty("hold_dimensions_sum")
    public void setHoldDimensionsSum(Integer holdDimensionsSum) {
        this.holdDimensionsSum = holdDimensionsSum;
    }

    public Baglimit withHoldDimensionsSum(Integer holdDimensionsSum) {
        this.holdDimensionsSum = holdDimensionsSum;
        return this;
    }

    @JsonProperty("hold_height")
    public Integer getHoldHeight() {
        return holdHeight;
    }

    @JsonProperty("hold_height")
    public void setHoldHeight(Integer holdHeight) {
        this.holdHeight = holdHeight;
    }

    public Baglimit withHoldHeight(Integer holdHeight) {
        this.holdHeight = holdHeight;
        return this;
    }

    @JsonProperty("hold_length")
    public Integer getHoldLength() {
        return holdLength;
    }

    @JsonProperty("hold_length")
    public void setHoldLength(Integer holdLength) {
        this.holdLength = holdLength;
    }

    public Baglimit withHoldLength(Integer holdLength) {
        this.holdLength = holdLength;
        return this;
    }

    @JsonProperty("hold_weight")
    public Integer getHoldWeight() {
        return holdWeight;
    }

    @JsonProperty("hold_weight")
    public void setHoldWeight(Integer holdWeight) {
        this.holdWeight = holdWeight;
    }

    public Baglimit withHoldWeight(Integer holdWeight) {
        this.holdWeight = holdWeight;
        return this;
    }

    @JsonProperty("hold_width")
    public Integer getHoldWidth() {
        return holdWidth;
    }

    @JsonProperty("hold_width")
    public void setHoldWidth(Integer holdWidth) {
        this.holdWidth = holdWidth;
    }

    public Baglimit withHoldWidth(Integer holdWidth) {
        this.holdWidth = holdWidth;
        return this;
    }

    @JsonProperty("personal_item_height")
    public Integer getPersonalItemHeight() {
        return personalItemHeight;
    }

    @JsonProperty("personal_item_height")
    public void setPersonalItemHeight(Integer personalItemHeight) {
        this.personalItemHeight = personalItemHeight;
    }

    public Baglimit withPersonalItemHeight(Integer personalItemHeight) {
        this.personalItemHeight = personalItemHeight;
        return this;
    }

    @JsonProperty("personal_item_length")
    public Integer getPersonalItemLength() {
        return personalItemLength;
    }

    @JsonProperty("personal_item_length")
    public void setPersonalItemLength(Integer personalItemLength) {
        this.personalItemLength = personalItemLength;
    }

    public Baglimit withPersonalItemLength(Integer personalItemLength) {
        this.personalItemLength = personalItemLength;
        return this;
    }

    @JsonProperty("personal_item_weight")
    public Integer getPersonalItemWeight() {
        return personalItemWeight;
    }

    @JsonProperty("personal_item_weight")
    public void setPersonalItemWeight(Integer personalItemWeight) {
        this.personalItemWeight = personalItemWeight;
    }

    public Baglimit withPersonalItemWeight(Integer personalItemWeight) {
        this.personalItemWeight = personalItemWeight;
        return this;
    }

    @JsonProperty("personal_item_width")
    public Integer getPersonalItemWidth() {
        return personalItemWidth;
    }

    @JsonProperty("personal_item_width")
    public void setPersonalItemWidth(Integer personalItemWidth) {
        this.personalItemWidth = personalItemWidth;
    }

    public Baglimit withPersonalItemWidth(Integer personalItemWidth) {
        this.personalItemWidth = personalItemWidth;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Baglimit withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Baglimit.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("handHeight");
        sb.append('=');
        sb.append(((this.handHeight == null)?"<null>":this.handHeight));
        sb.append(',');
        sb.append("handLength");
        sb.append('=');
        sb.append(((this.handLength == null)?"<null>":this.handLength));
        sb.append(',');
        sb.append("handWeight");
        sb.append('=');
        sb.append(((this.handWeight == null)?"<null>":this.handWeight));
        sb.append(',');
        sb.append("handWidth");
        sb.append('=');
        sb.append(((this.handWidth == null)?"<null>":this.handWidth));
        sb.append(',');
        sb.append("holdDimensionsSum");
        sb.append('=');
        sb.append(((this.holdDimensionsSum == null)?"<null>":this.holdDimensionsSum));
        sb.append(',');
        sb.append("holdHeight");
        sb.append('=');
        sb.append(((this.holdHeight == null)?"<null>":this.holdHeight));
        sb.append(',');
        sb.append("holdLength");
        sb.append('=');
        sb.append(((this.holdLength == null)?"<null>":this.holdLength));
        sb.append(',');
        sb.append("holdWeight");
        sb.append('=');
        sb.append(((this.holdWeight == null)?"<null>":this.holdWeight));
        sb.append(',');
        sb.append("holdWidth");
        sb.append('=');
        sb.append(((this.holdWidth == null)?"<null>":this.holdWidth));
        sb.append(',');
        sb.append("personalItemHeight");
        sb.append('=');
        sb.append(((this.personalItemHeight == null)?"<null>":this.personalItemHeight));
        sb.append(',');
        sb.append("personalItemLength");
        sb.append('=');
        sb.append(((this.personalItemLength == null)?"<null>":this.personalItemLength));
        sb.append(',');
        sb.append("personalItemWeight");
        sb.append('=');
        sb.append(((this.personalItemWeight == null)?"<null>":this.personalItemWeight));
        sb.append(',');
        sb.append("personalItemWidth");
        sb.append('=');
        sb.append(((this.personalItemWidth == null)?"<null>":this.personalItemWidth));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
