
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
    "EUR",
    "GBP"
})
@Generated("jsonschema2pojo")
public class Conversion {

    @JsonProperty("EUR")
    private Double eur;
    @JsonProperty("GBP")
    private Double gbp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Conversion() {
    }

    /**
     * 
     * @param eur
     * @param gbp
     */
    public Conversion(Double eur, Double gbp) {
        super();
        this.eur = eur;
        this.gbp = gbp;
    }

    @JsonProperty("EUR")
    public Double getEur() {
        return eur;
    }

    @JsonProperty("EUR")
    public void setEur(Double eur) {
        this.eur = eur;
    }

    public Conversion withEur(Double eur) {
        this.eur = eur;
        return this;
    }

    @JsonProperty("GBP")
    public Double getGbp() {
        return gbp;
    }

    @JsonProperty("GBP")
    public void setGbp(Double gbp) {
        this.gbp = gbp;
    }

    public Conversion withGbp(Double gbp) {
        this.gbp = gbp;
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

    public Conversion withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Conversion.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("eur");
        sb.append('=');
        sb.append(((this.eur == null)?"<null>":this.eur));
        sb.append(',');
        sb.append("gbp");
        sb.append('=');
        sb.append(((this.gbp == null)?"<null>":this.gbp));
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
