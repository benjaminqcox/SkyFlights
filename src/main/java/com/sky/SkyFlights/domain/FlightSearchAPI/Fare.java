
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
    "adults",
    "children",
    "infants"
})
@Generated("jsonschema2pojo")
public class Fare {

    @JsonProperty("adults")
    private Double adults;
    @JsonProperty("children")
    private Double children;
    @JsonProperty("infants")
    private Double infants;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Fare() {
    }

    /**
     * 
     * @param infants
     * @param children
     * @param adults
     */
    public Fare(Double adults, Double children, Double infants) {
        super();
        this.adults = adults;
        this.children = children;
        this.infants = infants;
    }

    @JsonProperty("adults")
    public Double getAdults() {
        return adults;
    }

    @JsonProperty("adults")
    public void setAdults(Double adults) {
        this.adults = adults;
    }

    public Fare withAdults(Double adults) {
        this.adults = adults;
        return this;
    }

    @JsonProperty("children")
    public Double getChildren() {
        return children;
    }

    @JsonProperty("children")
    public void setChildren(Double children) {
        this.children = children;
    }

    public Fare withChildren(Double children) {
        this.children = children;
        return this;
    }

    @JsonProperty("infants")
    public Double getInfants() {
        return infants;
    }

    @JsonProperty("infants")
    public void setInfants(Double infants) {
        this.infants = infants;
    }

    public Fare withInfants(Double infants) {
        this.infants = infants;
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

    public Fare withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Fare.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("adults");
        sb.append('=');
        sb.append(((this.adults == null)?"<null>":this.adults));
        sb.append(',');
        sb.append("children");
        sb.append('=');
        sb.append(((this.children == null)?"<null>":this.children));
        sb.append(',');
        sb.append("infants");
        sb.append('=');
        sb.append(((this.infants == null)?"<null>":this.infants));
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
