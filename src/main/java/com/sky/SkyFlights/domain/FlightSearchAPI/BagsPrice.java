
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
    "1",
    "2"
})
@Generated("jsonschema2pojo")
public class BagsPrice {

    @JsonProperty("1")
    private Double _1;
    @JsonProperty("2")
    private Double _2;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public BagsPrice() {
    }

    /**
     * 
     * @param _1
     * @param _2
     */
    public BagsPrice(Double _1, Double _2) {
        super();
        this._1 = _1;
        this._2 = _2;
    }

    @JsonProperty("1")
    public Double get1() {
        return _1;
    }

    @JsonProperty("1")
    public void set1(Double _1) {
        this._1 = _1;
    }

    public BagsPrice with1(Double _1) {
        this._1 = _1;
        return this;
    }

    @JsonProperty("2")
    public Double get2() {
        return _2;
    }

    @JsonProperty("2")
    public void set2(Double _2) {
        this._2 = _2;
    }

    public BagsPrice with2(Double _2) {
        this._2 = _2;
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

    public BagsPrice withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BagsPrice.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("_1");
        sb.append('=');
        sb.append(((this._1 == null)?"<null>":this._1));
        sb.append(',');
        sb.append("_2");
        sb.append('=');
        sb.append(((this._2 == null)?"<null>":this._2));
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
