
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
    "id",
    "flyFrom",
    "flyTo",
    "cityFrom",
    "cityCodeFrom",
    "cityTo",
    "cityCodeTo",
    "countryFrom",
    "countryTo",
    "local_departure",
    "utc_departure",
    "local_arrival",
    "utc_arrival",
    "nightsInDest",
    "quality",
    "distance",
    "duration",
    "price",
    "conversion",
    "fare",
    "bags_price",
    "baglimit",
    "availability",
    "airlines",
    "route",
    "booking_token",
    "deep_link",
    "facilitated_booking_available",
    "pnr_count",
    "has_airport_change",
    "technical_stops",
    "throw_away_ticketing",
    "hidden_city_ticketing",
    "virtual_interlining"
})
@Generated("jsonschema2pojo")
public class Datum {

    @JsonProperty("id")
    private String id;
    @JsonProperty("flyFrom")
    private String flyFrom;
    @JsonProperty("flyTo")
    private String flyTo;
    @JsonProperty("cityFrom")
    private String cityFrom;
    @JsonProperty("cityCodeFrom")
    private String cityCodeFrom;
    @JsonProperty("cityTo")
    private String cityTo;
    @JsonProperty("cityCodeTo")
    private String cityCodeTo;
    @JsonProperty("countryFrom")
    private CountryFrom countryFrom;
    @JsonProperty("countryTo")
    private CountryTo countryTo;
    @JsonProperty("local_departure")
    private String localDeparture;
    @JsonProperty("utc_departure")
    private String utcDeparture;
    @JsonProperty("local_arrival")
    private String localArrival;
    @JsonProperty("utc_arrival")
    private String utcArrival;
    @JsonProperty("nightsInDest")
    private Integer nightsInDest;
    @JsonProperty("quality")
    private Double quality;
    @JsonProperty("distance")
    private Double distance;
    @JsonProperty("duration")
    private Duration duration;
    @JsonProperty("price")
    private Double price;
    @JsonProperty("conversion")
    private Conversion conversion;
    @JsonProperty("fare")
    private Fare fare;
    @JsonProperty("bags_price")
    private BagsPrice bagsPrice;
    @JsonProperty("baglimit")
    private Baglimit baglimit;
    @JsonProperty("availability")
    private Availability availability;
    @JsonProperty("airlines")
    private List<String> airlines;
    @JsonProperty("route")
    private List<Route> route;
    @JsonProperty("booking_token")
    private String bookingToken;
    @JsonProperty("deep_link")
    private String deepLink;
    @JsonProperty("facilitated_booking_available")
    private Boolean facilitatedBookingAvailable;
    @JsonProperty("pnr_count")
    private Integer pnrCount;
    @JsonProperty("has_airport_change")
    private Boolean hasAirportChange;
    @JsonProperty("technical_stops")
    private Integer technicalStops;
    @JsonProperty("throw_away_ticketing")
    private Boolean throwAwayTicketing;
    @JsonProperty("hidden_city_ticketing")
    private Boolean hiddenCityTicketing;
    @JsonProperty("virtual_interlining")
    private Boolean virtualInterlining;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Datum() {
    }

    /**
     * 
     * @param fare
     * @param hasAirportChange
     * @param distance
     * @param technicalStops
     * @param utcDeparture
     * @param cityFrom
     * @param availability
     * @param duration
     * @param nightsInDest
     * @param hiddenCityTicketing
     * @param price
     * @param countryFrom
     * @param airlines
     * @param id
     * @param bookingToken
     * @param flyTo
     * @param bagsPrice
     * @param conversion
     * @param cityCodeTo
     * @param baglimit
     * @param pnrCount
     * @param utcArrival
     * @param virtualInterlining
     * @param localArrival
     * @param cityTo
     * @param flyFrom
     * @param countryTo
     * @param quality
     * @param localDeparture
     * @param facilitatedBookingAvailable
     * @param route
     * @param deepLink
     * @param cityCodeFrom
     * @param throwAwayTicketing
     */
    public Datum(String id, String flyFrom, String flyTo, String cityFrom, String cityCodeFrom, String cityTo, String cityCodeTo, CountryFrom countryFrom, CountryTo countryTo, String localDeparture, String utcDeparture, String localArrival, String utcArrival, Integer nightsInDest, Double quality, Double distance, Duration duration, Double price, Conversion conversion, Fare fare, BagsPrice bagsPrice, Baglimit baglimit, Availability availability, List<String> airlines, List<Route> route, String bookingToken, String deepLink, Boolean facilitatedBookingAvailable, Integer pnrCount, Boolean hasAirportChange, Integer technicalStops, Boolean throwAwayTicketing, Boolean hiddenCityTicketing, Boolean virtualInterlining) {
        super();
        this.id = id;
        this.flyFrom = flyFrom;
        this.flyTo = flyTo;
        this.cityFrom = cityFrom;
        this.cityCodeFrom = cityCodeFrom;
        this.cityTo = cityTo;
        this.cityCodeTo = cityCodeTo;
        this.countryFrom = countryFrom;
        this.countryTo = countryTo;
        this.localDeparture = localDeparture;
        this.utcDeparture = utcDeparture;
        this.localArrival = localArrival;
        this.utcArrival = utcArrival;
        this.nightsInDest = nightsInDest;
        this.quality = quality;
        this.distance = distance;
        this.duration = duration;
        this.price = price;
        this.conversion = conversion;
        this.fare = fare;
        this.bagsPrice = bagsPrice;
        this.baglimit = baglimit;
        this.availability = availability;
        this.airlines = airlines;
        this.route = route;
        this.bookingToken = bookingToken;
        this.deepLink = deepLink;
        this.facilitatedBookingAvailable = facilitatedBookingAvailable;
        this.pnrCount = pnrCount;
        this.hasAirportChange = hasAirportChange;
        this.technicalStops = technicalStops;
        this.throwAwayTicketing = throwAwayTicketing;
        this.hiddenCityTicketing = hiddenCityTicketing;
        this.virtualInterlining = virtualInterlining;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Datum withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("flyFrom")
    public String getFlyFrom() {
        return flyFrom;
    }

    @JsonProperty("flyFrom")
    public void setFlyFrom(String flyFrom) {
        this.flyFrom = flyFrom;
    }

    public Datum withFlyFrom(String flyFrom) {
        this.flyFrom = flyFrom;
        return this;
    }

    @JsonProperty("flyTo")
    public String getFlyTo() {
        return flyTo;
    }

    @JsonProperty("flyTo")
    public void setFlyTo(String flyTo) {
        this.flyTo = flyTo;
    }

    public Datum withFlyTo(String flyTo) {
        this.flyTo = flyTo;
        return this;
    }

    @JsonProperty("cityFrom")
    public String getCityFrom() {
        return cityFrom;
    }

    @JsonProperty("cityFrom")
    public void setCityFrom(String cityFrom) {
        this.cityFrom = cityFrom;
    }

    public Datum withCityFrom(String cityFrom) {
        this.cityFrom = cityFrom;
        return this;
    }

    @JsonProperty("cityCodeFrom")
    public String getCityCodeFrom() {
        return cityCodeFrom;
    }

    @JsonProperty("cityCodeFrom")
    public void setCityCodeFrom(String cityCodeFrom) {
        this.cityCodeFrom = cityCodeFrom;
    }

    public Datum withCityCodeFrom(String cityCodeFrom) {
        this.cityCodeFrom = cityCodeFrom;
        return this;
    }

    @JsonProperty("cityTo")
    public String getCityTo() {
        return cityTo;
    }

    @JsonProperty("cityTo")
    public void setCityTo(String cityTo) {
        this.cityTo = cityTo;
    }

    public Datum withCityTo(String cityTo) {
        this.cityTo = cityTo;
        return this;
    }

    @JsonProperty("cityCodeTo")
    public String getCityCodeTo() {
        return cityCodeTo;
    }

    @JsonProperty("cityCodeTo")
    public void setCityCodeTo(String cityCodeTo) {
        this.cityCodeTo = cityCodeTo;
    }

    public Datum withCityCodeTo(String cityCodeTo) {
        this.cityCodeTo = cityCodeTo;
        return this;
    }

    @JsonProperty("countryFrom")
    public CountryFrom getCountryFrom() {
        return countryFrom;
    }

    @JsonProperty("countryFrom")
    public void setCountryFrom(CountryFrom countryFrom) {
        this.countryFrom = countryFrom;
    }

    public Datum withCountryFrom(CountryFrom countryFrom) {
        this.countryFrom = countryFrom;
        return this;
    }

    @JsonProperty("countryTo")
    public CountryTo getCountryTo() {
        return countryTo;
    }

    @JsonProperty("countryTo")
    public void setCountryTo(CountryTo countryTo) {
        this.countryTo = countryTo;
    }

    public Datum withCountryTo(CountryTo countryTo) {
        this.countryTo = countryTo;
        return this;
    }

    @JsonProperty("local_departure")
    public String getLocalDeparture() {
        return localDeparture;
    }

    @JsonProperty("local_departure")
    public void setLocalDeparture(String localDeparture) {
        this.localDeparture = localDeparture;
    }

    public Datum withLocalDeparture(String localDeparture) {
        this.localDeparture = localDeparture;
        return this;
    }

    @JsonProperty("utc_departure")
    public String getUtcDeparture() {
        return utcDeparture;
    }

    @JsonProperty("utc_departure")
    public void setUtcDeparture(String utcDeparture) {
        this.utcDeparture = utcDeparture;
    }

    public Datum withUtcDeparture(String utcDeparture) {
        this.utcDeparture = utcDeparture;
        return this;
    }

    @JsonProperty("local_arrival")
    public String getLocalArrival() {
        return localArrival;
    }

    @JsonProperty("local_arrival")
    public void setLocalArrival(String localArrival) {
        this.localArrival = localArrival;
    }

    public Datum withLocalArrival(String localArrival) {
        this.localArrival = localArrival;
        return this;
    }

    @JsonProperty("utc_arrival")
    public String getUtcArrival() {
        return utcArrival;
    }

    @JsonProperty("utc_arrival")
    public void setUtcArrival(String utcArrival) {
        this.utcArrival = utcArrival;
    }

    public Datum withUtcArrival(String utcArrival) {
        this.utcArrival = utcArrival;
        return this;
    }

    @JsonProperty("nightsInDest")
    public Integer getNightsInDest() {
        return nightsInDest;
    }

    @JsonProperty("nightsInDest")
    public void setNightsInDest(Integer nightsInDest) {
        this.nightsInDest = nightsInDest;
    }

    public Datum withNightsInDest(Integer nightsInDest) {
        this.nightsInDest = nightsInDest;
        return this;
    }

    @JsonProperty("quality")
    public Double getQuality() {
        return quality;
    }

    @JsonProperty("quality")
    public void setQuality(Double quality) {
        this.quality = quality;
    }

    public Datum withQuality(Double quality) {
        this.quality = quality;
        return this;
    }

    @JsonProperty("distance")
    public Double getDistance() {
        return distance;
    }

    @JsonProperty("distance")
    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Datum withDistance(Double distance) {
        this.distance = distance;
        return this;
    }

    @JsonProperty("duration")
    public Duration getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public Datum withDuration(Duration duration) {
        this.duration = duration;
        return this;
    }

    @JsonProperty("price")
    public Double getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Double price) {
        this.price = price;
    }

    public Datum withPrice(Double price) {
        this.price = price;
        return this;
    }

    @JsonProperty("conversion")
    public Conversion getConversion() {
        return conversion;
    }

    @JsonProperty("conversion")
    public void setConversion(Conversion conversion) {
        this.conversion = conversion;
    }

    public Datum withConversion(Conversion conversion) {
        this.conversion = conversion;
        return this;
    }

    @JsonProperty("fare")
    public Fare getFare() {
        return fare;
    }

    @JsonProperty("fare")
    public void setFare(Fare fare) {
        this.fare = fare;
    }

    public Datum withFare(Fare fare) {
        this.fare = fare;
        return this;
    }

    @JsonProperty("bags_price")
    public BagsPrice getBagsPrice() {
        return bagsPrice;
    }

    @JsonProperty("bags_price")
    public void setBagsPrice(BagsPrice bagsPrice) {
        this.bagsPrice = bagsPrice;
    }

    public Datum withBagsPrice(BagsPrice bagsPrice) {
        this.bagsPrice = bagsPrice;
        return this;
    }

    @JsonProperty("baglimit")
    public Baglimit getBaglimit() {
        return baglimit;
    }

    @JsonProperty("baglimit")
    public void setBaglimit(Baglimit baglimit) {
        this.baglimit = baglimit;
    }

    public Datum withBaglimit(Baglimit baglimit) {
        this.baglimit = baglimit;
        return this;
    }

    @JsonProperty("availability")
    public Availability getAvailability() {
        return availability;
    }

    @JsonProperty("availability")
    public void setAvailability(Availability availability) {
        this.availability = availability;
    }

    public Datum withAvailability(Availability availability) {
        this.availability = availability;
        return this;
    }

    @JsonProperty("airlines")
    public List<String> getAirlines() {
        return airlines;
    }

    @JsonProperty("airlines")
    public void setAirlines(List<String> airlines) {
        this.airlines = airlines;
    }

    public Datum withAirlines(List<String> airlines) {
        this.airlines = airlines;
        return this;
    }

    @JsonProperty("route")
    public List<Route> getRoute() {
        return route;
    }

    @JsonProperty("route")
    public void setRoute(List<Route> route) {
        this.route = route;
    }

    public Datum withRoute(List<Route> route) {
        this.route = route;
        return this;
    }

    @JsonProperty("booking_token")
    public String getBookingToken() {
        return bookingToken;
    }

    @JsonProperty("booking_token")
    public void setBookingToken(String bookingToken) {
        this.bookingToken = bookingToken;
    }

    public Datum withBookingToken(String bookingToken) {
        this.bookingToken = bookingToken;
        return this;
    }

    @JsonProperty("deep_link")
    public String getDeepLink() {
        return deepLink;
    }

    @JsonProperty("deep_link")
    public void setDeepLink(String deepLink) {
        this.deepLink = deepLink;
    }

    public Datum withDeepLink(String deepLink) {
        this.deepLink = deepLink;
        return this;
    }

    @JsonProperty("facilitated_booking_available")
    public Boolean getFacilitatedBookingAvailable() {
        return facilitatedBookingAvailable;
    }

    @JsonProperty("facilitated_booking_available")
    public void setFacilitatedBookingAvailable(Boolean facilitatedBookingAvailable) {
        this.facilitatedBookingAvailable = facilitatedBookingAvailable;
    }

    public Datum withFacilitatedBookingAvailable(Boolean facilitatedBookingAvailable) {
        this.facilitatedBookingAvailable = facilitatedBookingAvailable;
        return this;
    }

    @JsonProperty("pnr_count")
    public Integer getPnrCount() {
        return pnrCount;
    }

    @JsonProperty("pnr_count")
    public void setPnrCount(Integer pnrCount) {
        this.pnrCount = pnrCount;
    }

    public Datum withPnrCount(Integer pnrCount) {
        this.pnrCount = pnrCount;
        return this;
    }

    @JsonProperty("has_airport_change")
    public Boolean getHasAirportChange() {
        return hasAirportChange;
    }

    @JsonProperty("has_airport_change")
    public void setHasAirportChange(Boolean hasAirportChange) {
        this.hasAirportChange = hasAirportChange;
    }

    public Datum withHasAirportChange(Boolean hasAirportChange) {
        this.hasAirportChange = hasAirportChange;
        return this;
    }

    @JsonProperty("technical_stops")
    public Integer getTechnicalStops() {
        return technicalStops;
    }

    @JsonProperty("technical_stops")
    public void setTechnicalStops(Integer technicalStops) {
        this.technicalStops = technicalStops;
    }

    public Datum withTechnicalStops(Integer technicalStops) {
        this.technicalStops = technicalStops;
        return this;
    }

    @JsonProperty("throw_away_ticketing")
    public Boolean getThrowAwayTicketing() {
        return throwAwayTicketing;
    }

    @JsonProperty("throw_away_ticketing")
    public void setThrowAwayTicketing(Boolean throwAwayTicketing) {
        this.throwAwayTicketing = throwAwayTicketing;
    }

    public Datum withThrowAwayTicketing(Boolean throwAwayTicketing) {
        this.throwAwayTicketing = throwAwayTicketing;
        return this;
    }

    @JsonProperty("hidden_city_ticketing")
    public Boolean getHiddenCityTicketing() {
        return hiddenCityTicketing;
    }

    @JsonProperty("hidden_city_ticketing")
    public void setHiddenCityTicketing(Boolean hiddenCityTicketing) {
        this.hiddenCityTicketing = hiddenCityTicketing;
    }

    public Datum withHiddenCityTicketing(Boolean hiddenCityTicketing) {
        this.hiddenCityTicketing = hiddenCityTicketing;
        return this;
    }

    @JsonProperty("virtual_interlining")
    public Boolean getVirtualInterlining() {
        return virtualInterlining;
    }

    @JsonProperty("virtual_interlining")
    public void setVirtualInterlining(Boolean virtualInterlining) {
        this.virtualInterlining = virtualInterlining;
    }

    public Datum withVirtualInterlining(Boolean virtualInterlining) {
        this.virtualInterlining = virtualInterlining;
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

    public Datum withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Datum.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("flyFrom");
        sb.append('=');
        sb.append(((this.flyFrom == null)?"<null>":this.flyFrom));
        sb.append(',');
        sb.append("flyTo");
        sb.append('=');
        sb.append(((this.flyTo == null)?"<null>":this.flyTo));
        sb.append(',');
        sb.append("cityFrom");
        sb.append('=');
        sb.append(((this.cityFrom == null)?"<null>":this.cityFrom));
        sb.append(',');
        sb.append("cityCodeFrom");
        sb.append('=');
        sb.append(((this.cityCodeFrom == null)?"<null>":this.cityCodeFrom));
        sb.append(',');
        sb.append("cityTo");
        sb.append('=');
        sb.append(((this.cityTo == null)?"<null>":this.cityTo));
        sb.append(',');
        sb.append("cityCodeTo");
        sb.append('=');
        sb.append(((this.cityCodeTo == null)?"<null>":this.cityCodeTo));
        sb.append(',');
        sb.append("countryFrom");
        sb.append('=');
        sb.append(((this.countryFrom == null)?"<null>":this.countryFrom));
        sb.append(',');
        sb.append("countryTo");
        sb.append('=');
        sb.append(((this.countryTo == null)?"<null>":this.countryTo));
        sb.append(',');
        sb.append("localDeparture");
        sb.append('=');
        sb.append(((this.localDeparture == null)?"<null>":this.localDeparture));
        sb.append(',');
        sb.append("utcDeparture");
        sb.append('=');
        sb.append(((this.utcDeparture == null)?"<null>":this.utcDeparture));
        sb.append(',');
        sb.append("localArrival");
        sb.append('=');
        sb.append(((this.localArrival == null)?"<null>":this.localArrival));
        sb.append(',');
        sb.append("utcArrival");
        sb.append('=');
        sb.append(((this.utcArrival == null)?"<null>":this.utcArrival));
        sb.append(',');
        sb.append("nightsInDest");
        sb.append('=');
        sb.append(((this.nightsInDest == null)?"<null>":this.nightsInDest));
        sb.append(',');
        sb.append("quality");
        sb.append('=');
        sb.append(((this.quality == null)?"<null>":this.quality));
        sb.append(',');
        sb.append("distance");
        sb.append('=');
        sb.append(((this.distance == null)?"<null>":this.distance));
        sb.append(',');
        sb.append("duration");
        sb.append('=');
        sb.append(((this.duration == null)?"<null>":this.duration));
        sb.append(',');
        sb.append("price");
        sb.append('=');
        sb.append(((this.price == null)?"<null>":this.price));
        sb.append(',');
        sb.append("conversion");
        sb.append('=');
        sb.append(((this.conversion == null)?"<null>":this.conversion));
        sb.append(',');
        sb.append("fare");
        sb.append('=');
        sb.append(((this.fare == null)?"<null>":this.fare));
        sb.append(',');
        sb.append("bagsPrice");
        sb.append('=');
        sb.append(((this.bagsPrice == null)?"<null>":this.bagsPrice));
        sb.append(',');
        sb.append("baglimit");
        sb.append('=');
        sb.append(((this.baglimit == null)?"<null>":this.baglimit));
        sb.append(',');
        sb.append("availability");
        sb.append('=');
        sb.append(((this.availability == null)?"<null>":this.availability));
        sb.append(',');
        sb.append("airlines");
        sb.append('=');
        sb.append(((this.airlines == null)?"<null>":this.airlines));
        sb.append(',');
        sb.append("route");
        sb.append('=');
        sb.append(((this.route == null)?"<null>":this.route));
        sb.append(',');
        sb.append("bookingToken");
        sb.append('=');
        sb.append(((this.bookingToken == null)?"<null>":this.bookingToken));
        sb.append(',');
        sb.append("deepLink");
        sb.append('=');
        sb.append(((this.deepLink == null)?"<null>":this.deepLink));
        sb.append(',');
        sb.append("facilitatedBookingAvailable");
        sb.append('=');
        sb.append(((this.facilitatedBookingAvailable == null)?"<null>":this.facilitatedBookingAvailable));
        sb.append(',');
        sb.append("pnrCount");
        sb.append('=');
        sb.append(((this.pnrCount == null)?"<null>":this.pnrCount));
        sb.append(',');
        sb.append("hasAirportChange");
        sb.append('=');
        sb.append(((this.hasAirportChange == null)?"<null>":this.hasAirportChange));
        sb.append(',');
        sb.append("technicalStops");
        sb.append('=');
        sb.append(((this.technicalStops == null)?"<null>":this.technicalStops));
        sb.append(',');
        sb.append("throwAwayTicketing");
        sb.append('=');
        sb.append(((this.throwAwayTicketing == null)?"<null>":this.throwAwayTicketing));
        sb.append(',');
        sb.append("hiddenCityTicketing");
        sb.append('=');
        sb.append(((this.hiddenCityTicketing == null)?"<null>":this.hiddenCityTicketing));
        sb.append(',');
        sb.append("virtualInterlining");
        sb.append('=');
        sb.append(((this.virtualInterlining == null)?"<null>":this.virtualInterlining));
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
