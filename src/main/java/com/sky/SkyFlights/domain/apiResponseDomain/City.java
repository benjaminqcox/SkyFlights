
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
    "id",
    "name",
    "code",
    "slug",
    "country",
    "continent",
    "region",
    "autonomous_territory",
    "nearby_country",
    "subdivision"
})
@Generated("jsonschema2pojo")
public class City {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("code")
    private String code;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("country")
    private Country country;
    @JsonProperty("continent")
    private Continent continent;
    @JsonProperty("region")
    private Region region;
    @JsonProperty("autonomous_territory")
    private Object autonomousTerritory;
    @JsonProperty("nearby_country")
    private Object nearbyCountry;
    @JsonProperty("subdivision")
    private Object subdivision;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public City() {
    }

    /**
     * 
     * @param continent
     * @param country
     * @param subdivision
     * @param code
     * @param name
     * @param nearbyCountry
     * @param id
     * @param autonomousTerritory
     * @param region
     * @param slug
     */
    public City(String id, String name, String code, String slug, Country country, Continent continent, Region region, Object autonomousTerritory, Object nearbyCountry, Object subdivision) {
        super();
        this.id = id;
        this.name = name;
        this.code = code;
        this.slug = slug;
        this.country = country;
        this.continent = continent;
        this.region = region;
        this.autonomousTerritory = autonomousTerritory;
        this.nearbyCountry = nearbyCountry;
        this.subdivision = subdivision;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    @JsonProperty("slug")
    public void setSlug(String slug) {
        this.slug = slug;
    }

    @JsonProperty("country")
    public Country getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(Country country) {
        this.country = country;
    }

    @JsonProperty("continent")
    public Continent getContinent() {
        return continent;
    }

    @JsonProperty("continent")
    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    @JsonProperty("region")
    public Region getRegion() {
        return region;
    }

    @JsonProperty("region")
    public void setRegion(Region region) {
        this.region = region;
    }

    @JsonProperty("autonomous_territory")
    public Object getAutonomousTerritory() {
        return autonomousTerritory;
    }

    @JsonProperty("autonomous_territory")
    public void setAutonomousTerritory(Object autonomousTerritory) {
        this.autonomousTerritory = autonomousTerritory;
    }

    @JsonProperty("nearby_country")
    public Object getNearbyCountry() {
        return nearbyCountry;
    }

    @JsonProperty("nearby_country")
    public void setNearbyCountry(Object nearbyCountry) {
        this.nearbyCountry = nearbyCountry;
    }

    @JsonProperty("subdivision")
    public Object getSubdivision() {
        return subdivision;
    }

    @JsonProperty("subdivision")
    public void setSubdivision(Object subdivision) {
        this.subdivision = subdivision;
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
        sb.append(City.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("slug");
        sb.append('=');
        sb.append(((this.slug == null)?"<null>":this.slug));
        sb.append(',');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("continent");
        sb.append('=');
        sb.append(((this.continent == null)?"<null>":this.continent));
        sb.append(',');
        sb.append("region");
        sb.append('=');
        sb.append(((this.region == null)?"<null>":this.region));
        sb.append(',');
        sb.append("autonomousTerritory");
        sb.append('=');
        sb.append(((this.autonomousTerritory == null)?"<null>":this.autonomousTerritory));
        sb.append(',');
        sb.append("nearbyCountry");
        sb.append('=');
        sb.append(((this.nearbyCountry == null)?"<null>":this.nearbyCountry));
        sb.append(',');
        sb.append("subdivision");
        sb.append('=');
        sb.append(((this.subdivision == null)?"<null>":this.subdivision));
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
