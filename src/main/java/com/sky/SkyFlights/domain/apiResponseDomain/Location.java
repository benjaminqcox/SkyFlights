
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
    "id",
    "int_id",
    "airport_int_id",
    "active",
    "code",
    "icao",
    "name",
    "slug",
    "slug_en",
    "alternative_names",
    "rank",
    "global_rank_dst",
    "dst_popularity_score",
    "timezone",
    "city",
    "location",
    "alternative_departure_points",
    "tags",
    "providers",
    "special",
    "tourist_region",
    "car_rentals",
    "new_ground",
    "routing_priority",
    "type"
})
@Generated("jsonschema2pojo")
public class Location {

    @JsonProperty("id")
    private String id;
    @JsonProperty("int_id")
    private Integer intId;
    @JsonProperty("airport_int_id")
    private Integer airportIntId;
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("code")
    private String code;
    @JsonProperty("icao")
    private String icao;
    @JsonProperty("name")
    private String name;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("slug_en")
    private String slugEn;
    @JsonProperty("alternative_names")
    private List<String> alternativeNames;
    @JsonProperty("rank")
    private Integer rank;
    @JsonProperty("global_rank_dst")
    private Integer globalRankDst;
    @JsonProperty("dst_popularity_score")
    private Integer dstPopularityScore;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("city")
    private City city;
    @JsonProperty("location")
    private Location__1 location;
    @JsonProperty("alternative_departure_points")
    private List<AlternativeDeparturePoint> alternativeDeparturePoints;
    @JsonProperty("tags")
    private List<Tag> tags;
    @JsonProperty("providers")
    private List<Integer> providers;
    @JsonProperty("special")
    private List<Special> special;
    @JsonProperty("tourist_region")
    private List<Object> touristRegion;
//    @JsonProperty("car_rentals")
//    private List<CarRental> carRentals;
    @JsonProperty("new_ground")
    private Boolean newGround;
    @JsonProperty("routing_priority")
    private Integer routingPriority;
    @JsonProperty("type")
    private String type;
//    @JsonIgnore
//    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Location() {
    }

    /**
     * 
     * @param routingPriority
     * @param code
     * @param city
     * @param timezone
     * @param airportIntId
     * @param dstPopularityScore
     * @param type
     * @param intId
     * @param slugEn
     * @param alternativeNames
     * @param rank
     * @param id
     * @param slug
     * @param touristRegion
     * @param newGround
     * @param active
     * @param carRentals
     * @param tags
     * @param special
     * @param alternativeDeparturePoints
     * @param globalRankDst
     * @param name
     * @param icao
     * @param location
     * @param providers
     */
//    public Location(String id, Integer intId, Integer airportIntId, Boolean active, String code, String icao, String name, String slug, String slugEn, List<String> alternativeNames, Integer rank, Integer globalRankDst, Integer dstPopularityScore, String timezone, City city, Location__1 location, List<AlternativeDeparturePoint> alternativeDeparturePoints, List<Tag> tags, List<Integer> providers, List<Special> special, List<Object> touristRegion, List<CarRental> carRentals, Boolean newGround, Integer routingPriority, String type) {
//        super();
//        this.id = id;
//        this.intId = intId;
//        this.airportIntId = airportIntId;
//        this.active = active;
//        this.code = code;
//        this.icao = icao;
//        this.name = name;
//        this.slug = slug;
//        this.slugEn = slugEn;
//        this.alternativeNames = alternativeNames;
//        this.rank = rank;
//        this.globalRankDst = globalRankDst;
//        this.dstPopularityScore = dstPopularityScore;
//        this.timezone = timezone;
//        this.city = city;
//        this.location = location;
//        this.alternativeDeparturePoints = alternativeDeparturePoints;
//        this.tags = tags;
//        this.providers = providers;
//        this.special = special;
//        this.touristRegion = touristRegion;
//        this.carRentals = carRentals;
//        this.newGround = newGround;
//        this.routingPriority = routingPriority;
//        this.type = type;
//    }
    public Location(String id, Integer intId, Integer airportIntId, Boolean active, String code, String icao, String name, String slug, String slugEn, List<String> alternativeNames, Integer rank, Integer globalRankDst, Integer dstPopularityScore, String timezone, City city, Location__1 location, List<AlternativeDeparturePoint> alternativeDeparturePoints, List<Tag> tags, List<Integer> providers, List<Special> special, List<Object> touristRegion, Boolean newGround, Integer routingPriority, String type) {
        super();
        this.id = id;
        this.intId = intId;
        this.airportIntId = airportIntId;
        this.active = active;
        this.code = code;
        this.icao = icao;
        this.name = name;
        this.slug = slug;
        this.slugEn = slugEn;
        this.alternativeNames = alternativeNames;
        this.rank = rank;
        this.globalRankDst = globalRankDst;
        this.dstPopularityScore = dstPopularityScore;
        this.timezone = timezone;
        this.city = city;
        this.location = location;
        this.alternativeDeparturePoints = alternativeDeparturePoints;
        this.tags = tags;
        this.providers = providers;
        this.special = special;
        this.touristRegion = touristRegion;
        this.newGround = newGround;
        this.routingPriority = routingPriority;
        this.type = type;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("int_id")
    public Integer getIntId() {
        return intId;
    }

    @JsonProperty("int_id")
    public void setIntId(Integer intId) {
        this.intId = intId;
    }

    @JsonProperty("airport_int_id")
    public Integer getAirportIntId() {
        return airportIntId;
    }

    @JsonProperty("airport_int_id")
    public void setAirportIntId(Integer airportIntId) {
        this.airportIntId = airportIntId;
    }

    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("icao")
    public String getIcao() {
        return icao;
    }

    @JsonProperty("icao")
    public void setIcao(String icao) {
        this.icao = icao;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    @JsonProperty("slug")
    public void setSlug(String slug) {
        this.slug = slug;
    }

    @JsonProperty("slug_en")
    public String getSlugEn() {
        return slugEn;
    }

    @JsonProperty("slug_en")
    public void setSlugEn(String slugEn) {
        this.slugEn = slugEn;
    }

    @JsonProperty("alternative_names")
    public List<String> getAlternativeNames() {
        return alternativeNames;
    }

    @JsonProperty("alternative_names")
    public void setAlternativeNames(List<String> alternativeNames) {
        this.alternativeNames = alternativeNames;
    }

    @JsonProperty("rank")
    public Integer getRank() {
        return rank;
    }

    @JsonProperty("rank")
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    @JsonProperty("global_rank_dst")
    public Integer getGlobalRankDst() {
        return globalRankDst;
    }

    @JsonProperty("global_rank_dst")
    public void setGlobalRankDst(Integer globalRankDst) {
        this.globalRankDst = globalRankDst;
    }

    @JsonProperty("dst_popularity_score")
    public Integer getDstPopularityScore() {
        return dstPopularityScore;
    }

    @JsonProperty("dst_popularity_score")
    public void setDstPopularityScore(Integer dstPopularityScore) {
        this.dstPopularityScore = dstPopularityScore;
    }

    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @JsonProperty("city")
    public City getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(City city) {
        this.city = city;
    }

    @JsonProperty("location")
    public Location__1 getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location__1 location) {
        this.location = location;
    }

    @JsonProperty("alternative_departure_points")
    public List<AlternativeDeparturePoint> getAlternativeDeparturePoints() {
        return alternativeDeparturePoints;
    }

    @JsonProperty("alternative_departure_points")
    public void setAlternativeDeparturePoints(List<AlternativeDeparturePoint> alternativeDeparturePoints) {
        this.alternativeDeparturePoints = alternativeDeparturePoints;
    }

    @JsonProperty("tags")
    public List<Tag> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @JsonProperty("providers")
    public List<Integer> getProviders() {
        return providers;
    }

    @JsonProperty("providers")
    public void setProviders(List<Integer> providers) {
        this.providers = providers;
    }

    @JsonProperty("special")
    public List<Special> getSpecial() {
        return special;
    }

    @JsonProperty("special")
    public void setSpecial(List<Special> special) {
        this.special = special;
    }

    @JsonProperty("tourist_region")
    public List<Object> getTouristRegion() {
        return touristRegion;
    }

    @JsonProperty("tourist_region")
    public void setTouristRegion(List<Object> touristRegion) {
        this.touristRegion = touristRegion;
    }

//    @JsonProperty("car_rentals")
//    public List<CarRental> getCarRentals() {
//        return carRentals;
//    }
//
//    @JsonProperty("car_rentals")
//    public void setCarRentals(List<CarRental> carRentals) {
//        this.carRentals = carRentals;
//    }

    @JsonProperty("new_ground")
    public Boolean getNewGround() {
        return newGround;
    }

    @JsonProperty("new_ground")
    public void setNewGround(Boolean newGround) {
        this.newGround = newGround;
    }

    @JsonProperty("routing_priority")
    public Integer getRoutingPriority() {
        return routingPriority;
    }

    @JsonProperty("routing_priority")
    public void setRoutingPriority(Integer routingPriority) {
        this.routingPriority = routingPriority;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

//    @JsonAnyGetter
//    public Map<String, Object> getAdditionalProperties() {
//        return this.additionalProperties;
//    }
//
//    @JsonAnySetter
//    public void setAdditionalProperty(String name, Object value) {
//        this.additionalProperties.put(name, value);
//    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Location.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("intId");
        sb.append('=');
        sb.append(((this.intId == null)?"<null>":this.intId));
        sb.append(',');
        sb.append("airportIntId");
        sb.append('=');
        sb.append(((this.airportIntId == null)?"<null>":this.airportIntId));
        sb.append(',');
        sb.append("active");
        sb.append('=');
        sb.append(((this.active == null)?"<null>":this.active));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("icao");
        sb.append('=');
        sb.append(((this.icao == null)?"<null>":this.icao));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("slug");
        sb.append('=');
        sb.append(((this.slug == null)?"<null>":this.slug));
        sb.append(',');
        sb.append("slugEn");
        sb.append('=');
        sb.append(((this.slugEn == null)?"<null>":this.slugEn));
        sb.append(',');
        sb.append("alternativeNames");
        sb.append('=');
        sb.append(((this.alternativeNames == null)?"<null>":this.alternativeNames));
        sb.append(',');
        sb.append("rank");
        sb.append('=');
        sb.append(((this.rank == null)?"<null>":this.rank));
        sb.append(',');
        sb.append("globalRankDst");
        sb.append('=');
        sb.append(((this.globalRankDst == null)?"<null>":this.globalRankDst));
        sb.append(',');
        sb.append("dstPopularityScore");
        sb.append('=');
        sb.append(((this.dstPopularityScore == null)?"<null>":this.dstPopularityScore));
        sb.append(',');
        sb.append("timezone");
        sb.append('=');
        sb.append(((this.timezone == null)?"<null>":this.timezone));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("alternativeDeparturePoints");
        sb.append('=');
        sb.append(((this.alternativeDeparturePoints == null)?"<null>":this.alternativeDeparturePoints));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
        sb.append(',');
        sb.append("providers");
        sb.append('=');
        sb.append(((this.providers == null)?"<null>":this.providers));
        sb.append(',');
        sb.append("special");
        sb.append('=');
        sb.append(((this.special == null)?"<null>":this.special));
        sb.append(',');
        sb.append("touristRegion");
        sb.append('=');
        sb.append(((this.touristRegion == null)?"<null>":this.touristRegion));
        sb.append(',');
//        sb.append("carRentals");
//        sb.append('=');
//        sb.append(((this.carRentals == null)?"<null>":this.carRentals));
//        sb.append(',');
        sb.append("newGround");
        sb.append('=');
        sb.append(((this.newGround == null)?"<null>":this.newGround));
        sb.append(',');
        sb.append("routingPriority");
        sb.append('=');
        sb.append(((this.routingPriority == null)?"<null>":this.routingPriority));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
//        sb.append("additionalProperties");
//        sb.append('=');
//        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
//        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
