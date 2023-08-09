
package com.sky.SkyFlights.domain.apiResponseDomain;

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
    "tag",
    "month_to",
    "month_from"
})
@Generated("jsonschema2pojo")
public class Tag {

    @JsonProperty("tag")
    private String tag;
    @JsonProperty("month_to")
    private Integer monthTo;
    @JsonProperty("month_from")
    private Integer monthFrom;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Tag() {
    }

    /**
     * 
     * @param monthFrom
     * @param tag
     * @param monthTo
     */
    public Tag(String tag, Integer monthTo, Integer monthFrom) {
        super();
        this.tag = tag;
        this.monthTo = monthTo;
        this.monthFrom = monthFrom;
    }

    @JsonProperty("tag")
    public String getTag() {
        return tag;
    }

    @JsonProperty("tag")
    public void setTag(String tag) {
        this.tag = tag;
    }

    @JsonProperty("month_to")
    public Integer getMonthTo() {
        return monthTo;
    }

    @JsonProperty("month_to")
    public void setMonthTo(Integer monthTo) {
        this.monthTo = monthTo;
    }

    @JsonProperty("month_from")
    public Integer getMonthFrom() {
        return monthFrom;
    }

    @JsonProperty("month_from")
    public void setMonthFrom(Integer monthFrom) {
        this.monthFrom = monthFrom;
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
        sb.append(Tag.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tag");
        sb.append('=');
        sb.append(((this.tag == null)?"<null>":this.tag));
        sb.append(',');
        sb.append("monthTo");
        sb.append('=');
        sb.append(((this.monthTo == null)?"<null>":this.monthTo));
        sb.append(',');
        sb.append("monthFrom");
        sb.append('=');
        sb.append(((this.monthFrom == null)?"<null>":this.monthFrom));
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
