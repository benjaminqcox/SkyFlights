
package com.sky.SkyFlights.domain.FlightSearchAPI;

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
    "search_id",
    "currency",
    "fx_rate",
    "data",
    "_results"
})
@Generated("jsonschema2pojo")
public class FlightSearchResponse {

    @JsonProperty("search_id")
    private String searchId;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("fx_rate")
    private Double fxRate;
    @JsonProperty("data")
    private List<Datum> data;
    @JsonProperty("_results")
    private Integer results;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public FlightSearchResponse() {
    }

    /**
     * 
     * @param fxRate
     * @param searchId
     * @param data
     * @param currency
     * @param results
     */
    public FlightSearchResponse(String searchId, String currency, Double fxRate, List<Datum> data, Integer results) {
        super();
        this.searchId = searchId;
        this.currency = currency;
        this.fxRate = fxRate;
        this.data = data;
        this.results = results;
    }

    @JsonProperty("search_id")
    public String getSearchId() {
        return searchId;
    }

    @JsonProperty("search_id")
    public void setSearchId(String searchId) {
        this.searchId = searchId;
    }

    public FlightSearchResponse withSearchId(String searchId) {
        this.searchId = searchId;
        return this;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public FlightSearchResponse withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    @JsonProperty("fx_rate")
    public Double getFxRate() {
        return fxRate;
    }

    @JsonProperty("fx_rate")
    public void setFxRate(Double fxRate) {
        this.fxRate = fxRate;
    }

    public FlightSearchResponse withFxRate(Double fxRate) {
        this.fxRate = fxRate;
        return this;
    }

    @JsonProperty("data")
    public List<Datum> getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(List<Datum> data) {
        this.data = data;
    }

    public FlightSearchResponse withData(List<Datum> data) {
        this.data = data;
        return this;
    }

    @JsonProperty("_results")
    public Integer getResults() {
        return results;
    }

    @JsonProperty("_results")
    public void setResults(Integer results) {
        this.results = results;
    }

    public FlightSearchResponse withResults(Integer results) {
        this.results = results;
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

    public FlightSearchResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FlightSearchResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("searchId");
        sb.append('=');
        sb.append(((this.searchId == null)?"<null>":this.searchId));
        sb.append(',');
        sb.append("currency");
        sb.append('=');
        sb.append(((this.currency == null)?"<null>":this.currency));
        sb.append(',');
        sb.append("fxRate");
        sb.append('=');
        sb.append(((this.fxRate == null)?"<null>":this.fxRate));
        sb.append(',');
        sb.append("data");
        sb.append('=');
        sb.append(((this.data == null)?"<null>":this.data));
        sb.append(',');
        sb.append("results");
        sb.append('=');
        sb.append(((this.results == null)?"<null>":this.results));
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
