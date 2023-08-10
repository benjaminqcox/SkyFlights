
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
    "id",
    "combination_id",
    "flyFrom",
    "flyTo",
    "cityFrom",
    "cityCodeFrom",
    "cityTo",
    "cityCodeTo",
    "local_departure",
    "utc_departure",
    "local_arrival",
    "utc_arrival",
    "airline",
    "flight_no",
    "operating_carrier",
    "operating_flight_no",
    "fare_basis",
    "fare_category",
    "fare_classes",
    "fare_family",
    "return",
    "bags_recheck_required",
    "vi_connection",
    "guarantee",
    "equipment",
    "vehicle_type"
})
@Generated("jsonschema2pojo")
public class Route {

    @JsonProperty("id")
    private String id;
    @JsonProperty("combination_id")
    private String combinationId;
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
    @JsonProperty("local_departure")
    private String localDeparture;
    @JsonProperty("utc_departure")
    private String utcDeparture;
    @JsonProperty("local_arrival")
    private String localArrival;
    @JsonProperty("utc_arrival")
    private String utcArrival;
    @JsonProperty("airline")
    private String airline;
    @JsonProperty("flight_no")
    private Integer flightNo;
    @JsonProperty("operating_carrier")
    private String operatingCarrier;
    @JsonProperty("operating_flight_no")
    private String operatingFlightNo;
    @JsonProperty("fare_basis")
    private String fareBasis;
    @JsonProperty("fare_category")
    private String fareCategory;
    @JsonProperty("fare_classes")
    private String fareClasses;
    @JsonProperty("fare_family")
    private String fareFamily;
    @JsonProperty("return")
    private Integer _return;
    @JsonProperty("bags_recheck_required")
    private Boolean bagsRecheckRequired;
    @JsonProperty("vi_connection")
    private Boolean viConnection;
    @JsonProperty("guarantee")
    private Boolean guarantee;
    @JsonProperty("equipment")
    private Object equipment;
    @JsonProperty("vehicle_type")
    private String vehicleType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Route() {
    }

    /**
     * 
     * @param fareClasses
     * @param utcDeparture
     * @param guarantee
     * @param cityFrom
     * @param fareCategory
     * @param id
     * @param airline
     * @param operatingCarrier
     * @param flyTo
     * @param vehicleType
     * @param operatingFlightNo
     * @param cityCodeTo
     * @param combinationId
     * @param utcArrival
     * @param equipment
     * @param localArrival
     * @param cityTo
     * @param flyFrom
     * @param bagsRecheckRequired
     * @param localDeparture
     * @param _return
     * @param flightNo
     * @param viConnection
     * @param cityCodeFrom
     * @param fareBasis
     * @param fareFamily
     */
    public Route(String id, String combinationId, String flyFrom, String flyTo, String cityFrom, String cityCodeFrom, String cityTo, String cityCodeTo, String localDeparture, String utcDeparture, String localArrival, String utcArrival, String airline, Integer flightNo, String operatingCarrier, String operatingFlightNo, String fareBasis, String fareCategory, String fareClasses, String fareFamily, Integer _return, Boolean bagsRecheckRequired, Boolean viConnection, Boolean guarantee, Object equipment, String vehicleType) {
        super();
        this.id = id;
        this.combinationId = combinationId;
        this.flyFrom = flyFrom;
        this.flyTo = flyTo;
        this.cityFrom = cityFrom;
        this.cityCodeFrom = cityCodeFrom;
        this.cityTo = cityTo;
        this.cityCodeTo = cityCodeTo;
        this.localDeparture = localDeparture;
        this.utcDeparture = utcDeparture;
        this.localArrival = localArrival;
        this.utcArrival = utcArrival;
        this.airline = airline;
        this.flightNo = flightNo;
        this.operatingCarrier = operatingCarrier;
        this.operatingFlightNo = operatingFlightNo;
        this.fareBasis = fareBasis;
        this.fareCategory = fareCategory;
        this.fareClasses = fareClasses;
        this.fareFamily = fareFamily;
        this._return = _return;
        this.bagsRecheckRequired = bagsRecheckRequired;
        this.viConnection = viConnection;
        this.guarantee = guarantee;
        this.equipment = equipment;
        this.vehicleType = vehicleType;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Route withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("combination_id")
    public String getCombinationId() {
        return combinationId;
    }

    @JsonProperty("combination_id")
    public void setCombinationId(String combinationId) {
        this.combinationId = combinationId;
    }

    public Route withCombinationId(String combinationId) {
        this.combinationId = combinationId;
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

    public Route withFlyFrom(String flyFrom) {
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

    public Route withFlyTo(String flyTo) {
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

    public Route withCityFrom(String cityFrom) {
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

    public Route withCityCodeFrom(String cityCodeFrom) {
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

    public Route withCityTo(String cityTo) {
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

    public Route withCityCodeTo(String cityCodeTo) {
        this.cityCodeTo = cityCodeTo;
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

    public Route withLocalDeparture(String localDeparture) {
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

    public Route withUtcDeparture(String utcDeparture) {
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

    public Route withLocalArrival(String localArrival) {
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

    public Route withUtcArrival(String utcArrival) {
        this.utcArrival = utcArrival;
        return this;
    }

    @JsonProperty("airline")
    public String getAirline() {
        return airline;
    }

    @JsonProperty("airline")
    public void setAirline(String airline) {
        this.airline = airline;
    }

    public Route withAirline(String airline) {
        this.airline = airline;
        return this;
    }

    @JsonProperty("flight_no")
    public Integer getFlightNo() {
        return flightNo;
    }

    @JsonProperty("flight_no")
    public void setFlightNo(Integer flightNo) {
        this.flightNo = flightNo;
    }

    public Route withFlightNo(Integer flightNo) {
        this.flightNo = flightNo;
        return this;
    }

    @JsonProperty("operating_carrier")
    public String getOperatingCarrier() {
        return operatingCarrier;
    }

    @JsonProperty("operating_carrier")
    public void setOperatingCarrier(String operatingCarrier) {
        this.operatingCarrier = operatingCarrier;
    }

    public Route withOperatingCarrier(String operatingCarrier) {
        this.operatingCarrier = operatingCarrier;
        return this;
    }

    @JsonProperty("operating_flight_no")
    public String getOperatingFlightNo() {
        return operatingFlightNo;
    }

    @JsonProperty("operating_flight_no")
    public void setOperatingFlightNo(String operatingFlightNo) {
        this.operatingFlightNo = operatingFlightNo;
    }

    public Route withOperatingFlightNo(String operatingFlightNo) {
        this.operatingFlightNo = operatingFlightNo;
        return this;
    }

    @JsonProperty("fare_basis")
    public String getFareBasis() {
        return fareBasis;
    }

    @JsonProperty("fare_basis")
    public void setFareBasis(String fareBasis) {
        this.fareBasis = fareBasis;
    }

    public Route withFareBasis(String fareBasis) {
        this.fareBasis = fareBasis;
        return this;
    }

    @JsonProperty("fare_category")
    public String getFareCategory() {
        return fareCategory;
    }

    @JsonProperty("fare_category")
    public void setFareCategory(String fareCategory) {
        this.fareCategory = fareCategory;
    }

    public Route withFareCategory(String fareCategory) {
        this.fareCategory = fareCategory;
        return this;
    }

    @JsonProperty("fare_classes")
    public String getFareClasses() {
        return fareClasses;
    }

    @JsonProperty("fare_classes")
    public void setFareClasses(String fareClasses) {
        this.fareClasses = fareClasses;
    }

    public Route withFareClasses(String fareClasses) {
        this.fareClasses = fareClasses;
        return this;
    }

    @JsonProperty("fare_family")
    public String getFareFamily() {
        return fareFamily;
    }

    @JsonProperty("fare_family")
    public void setFareFamily(String fareFamily) {
        this.fareFamily = fareFamily;
    }

    public Route withFareFamily(String fareFamily) {
        this.fareFamily = fareFamily;
        return this;
    }

    @JsonProperty("return")
    public Integer getReturn() {
        return _return;
    }

    @JsonProperty("return")
    public void setReturn(Integer _return) {
        this._return = _return;
    }

    public Route withReturn(Integer _return) {
        this._return = _return;
        return this;
    }

    @JsonProperty("bags_recheck_required")
    public Boolean getBagsRecheckRequired() {
        return bagsRecheckRequired;
    }

    @JsonProperty("bags_recheck_required")
    public void setBagsRecheckRequired(Boolean bagsRecheckRequired) {
        this.bagsRecheckRequired = bagsRecheckRequired;
    }

    public Route withBagsRecheckRequired(Boolean bagsRecheckRequired) {
        this.bagsRecheckRequired = bagsRecheckRequired;
        return this;
    }

    @JsonProperty("vi_connection")
    public Boolean getViConnection() {
        return viConnection;
    }

    @JsonProperty("vi_connection")
    public void setViConnection(Boolean viConnection) {
        this.viConnection = viConnection;
    }

    public Route withViConnection(Boolean viConnection) {
        this.viConnection = viConnection;
        return this;
    }

    @JsonProperty("guarantee")
    public Boolean getGuarantee() {
        return guarantee;
    }

    @JsonProperty("guarantee")
    public void setGuarantee(Boolean guarantee) {
        this.guarantee = guarantee;
    }

    public Route withGuarantee(Boolean guarantee) {
        this.guarantee = guarantee;
        return this;
    }

    @JsonProperty("equipment")
    public Object getEquipment() {
        return equipment;
    }

    @JsonProperty("equipment")
    public void setEquipment(Object equipment) {
        this.equipment = equipment;
    }

    public Route withEquipment(Object equipment) {
        this.equipment = equipment;
        return this;
    }

    @JsonProperty("vehicle_type")
    public String getVehicleType() {
        return vehicleType;
    }

    @JsonProperty("vehicle_type")
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Route withVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
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

    public Route withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Route.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("combinationId");
        sb.append('=');
        sb.append(((this.combinationId == null)?"<null>":this.combinationId));
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
        sb.append("airline");
        sb.append('=');
        sb.append(((this.airline == null)?"<null>":this.airline));
        sb.append(',');
        sb.append("flightNo");
        sb.append('=');
        sb.append(((this.flightNo == null)?"<null>":this.flightNo));
        sb.append(',');
        sb.append("operatingCarrier");
        sb.append('=');
        sb.append(((this.operatingCarrier == null)?"<null>":this.operatingCarrier));
        sb.append(',');
        sb.append("operatingFlightNo");
        sb.append('=');
        sb.append(((this.operatingFlightNo == null)?"<null>":this.operatingFlightNo));
        sb.append(',');
        sb.append("fareBasis");
        sb.append('=');
        sb.append(((this.fareBasis == null)?"<null>":this.fareBasis));
        sb.append(',');
        sb.append("fareCategory");
        sb.append('=');
        sb.append(((this.fareCategory == null)?"<null>":this.fareCategory));
        sb.append(',');
        sb.append("fareClasses");
        sb.append('=');
        sb.append(((this.fareClasses == null)?"<null>":this.fareClasses));
        sb.append(',');
        sb.append("fareFamily");
        sb.append('=');
        sb.append(((this.fareFamily == null)?"<null>":this.fareFamily));
        sb.append(',');
        sb.append("_return");
        sb.append('=');
        sb.append(((this._return == null)?"<null>":this._return));
        sb.append(',');
        sb.append("bagsRecheckRequired");
        sb.append('=');
        sb.append(((this.bagsRecheckRequired == null)?"<null>":this.bagsRecheckRequired));
        sb.append(',');
        sb.append("viConnection");
        sb.append('=');
        sb.append(((this.viConnection == null)?"<null>":this.viConnection));
        sb.append(',');
        sb.append("guarantee");
        sb.append('=');
        sb.append(((this.guarantee == null)?"<null>":this.guarantee));
        sb.append(',');
        sb.append("equipment");
        sb.append('=');
        sb.append(((this.equipment == null)?"<null>":this.equipment));
        sb.append(',');
        sb.append("vehicleType");
        sb.append('=');
        sb.append(((this.vehicleType == null)?"<null>":this.vehicleType));
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
