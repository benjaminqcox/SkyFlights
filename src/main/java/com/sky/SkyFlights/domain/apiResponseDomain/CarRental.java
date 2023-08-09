
package com.sky.SkyFlights.domain.apiResponseDomain;

import java.util.LinkedHashMap;
import java.util.List;
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
    "provider_id",
    "providers_locations"
})
@Generated("jsonschema2pojo")
public class CarRental {

    @JsonProperty("provider_id")
    private Integer providerId;
    @JsonProperty("providers_locations")
    private List<String> providersLocations;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public CarRental() {
    }

    /**
     * 
     * @param providerId
     * @param providersLocations
     */
    public CarRental(Integer providerId, List<String> providersLocations) {
        super();
        this.providerId = providerId;
        this.providersLocations = providersLocations;
    }

    @JsonProperty("provider_id")
    public Integer getProviderId() {
        return providerId;
    }

    @JsonProperty("provider_id")
    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }

    @JsonProperty("providers_locations")
    public List<String> getProvidersLocations() {
        return providersLocations;
    }

    @JsonProperty("providers_locations")
    public void setProvidersLocations(List<String> providersLocations) {
        this.providersLocations = providersLocations;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CarRental.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("providerId");
        sb.append('=');
        sb.append(((this.providerId == null)?"<null>":this.providerId));
        sb.append(',');
        sb.append("providersLocations");
        sb.append('=');
        sb.append(((this.providersLocations == null)?"<null>":this.providersLocations));
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
