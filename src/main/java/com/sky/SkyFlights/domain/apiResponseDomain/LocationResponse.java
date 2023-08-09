
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
    "locations",
    "meta",
    "last_refresh",
    "results_retrieved"
})
@Generated("jsonschema2pojo")
public class LocationResponse {

    @JsonProperty("locations")
    private List<Location> locations;
    @JsonProperty("meta")
    private Meta meta;
    @JsonProperty("last_refresh")
    private Integer lastRefresh;
    @JsonProperty("results_retrieved")
    private Integer resultsRetrieved;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public LocationResponse() {
    }

    /**
     * 
     * @param lastRefresh
     * @param meta
     * @param locations
     * @param resultsRetrieved
     */
    public LocationResponse(List<Location> locations, Meta meta, Integer lastRefresh, Integer resultsRetrieved) {
        super();
        this.locations = locations;
        this.meta = meta;
        this.lastRefresh = lastRefresh;
        this.resultsRetrieved = resultsRetrieved;
    }

    @JsonProperty("locations")
    public List<Location> getLocations() {
        return locations;
    }

    @JsonProperty("locations")
    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    @JsonProperty("meta")
    public Meta getMeta() {
        return meta;
    }

    @JsonProperty("meta")
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    @JsonProperty("last_refresh")
    public Integer getLastRefresh() {
        return lastRefresh;
    }

    @JsonProperty("last_refresh")
    public void setLastRefresh(Integer lastRefresh) {
        this.lastRefresh = lastRefresh;
    }

    @JsonProperty("results_retrieved")
    public Integer getResultsRetrieved() {
        return resultsRetrieved;
    }

    @JsonProperty("results_retrieved")
    public void setResultsRetrieved(Integer resultsRetrieved) {
        this.resultsRetrieved = resultsRetrieved;
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
        sb.append(LocationResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("locations");
        sb.append('=');
        sb.append(((this.locations == null)?"<null>":this.locations));
        sb.append(',');
        sb.append("meta");
        sb.append('=');
        sb.append(((this.meta == null)?"<null>":this.meta));
        sb.append(',');
        sb.append("lastRefresh");
        sb.append('=');
        sb.append(((this.lastRefresh == null)?"<null>":this.lastRefresh));
        sb.append(',');
        sb.append("resultsRetrieved");
        sb.append('=');
        sb.append(((this.resultsRetrieved == null)?"<null>":this.resultsRetrieved));
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
