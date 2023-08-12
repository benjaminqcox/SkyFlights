package com.sky.SkyFlights.domain;

public class APIQueryParams {

    private static String locale = "en-US";

    private static String locationTypes = "airport";

    private static String returnLimits = "5";

    private static String activeOnly = "true";

    private static String returnFromDifferentCity;

    private static String returnToDifferentCity;

    private static String oneForCity;

    private static String onePerDate;

    private static String numberOfAdults;

    private static String selectedCabins;

    private static String adultHoldBag;

    private static String adultHandBag;

    private static String onlyWeekDays;

    private static String onlyWeekends;

    private static String partnerMarket;

    private static String currency;

    private static String maxStopovers;

    private static String maxSectorStopovers;

    private static String vehicleType;


    public APIQueryParams() {
    }

    public APIQueryParams(String locale, String locationTypes, String returnLimits, String activeOnly) {
        this.locale = locale;
        this.locationTypes = locationTypes;
        this.returnLimits = returnLimits;
        this.activeOnly = activeOnly;
    }

    public APIQueryParams(String locale, String locationTypes, String returnLimits, String activeOnly, String returnFromDifferentCity, String returnToDifferentCity, String oneForCity, String onePerDate, String numberOfAdults, String selectedCabins, String adultHoldBag, String adultHandBag, String onlyWeekDays, String onlyWeekends, String partnerMarket, String currency, String maxStopovers, String maxSectorStopovers, String vehicleType) {
        this.locale = locale;
        this.locationTypes = locationTypes;
        this.returnLimits = returnLimits;
        this.activeOnly = activeOnly;
        this.returnFromDifferentCity = returnFromDifferentCity;
        this.returnToDifferentCity = returnToDifferentCity;
        this.oneForCity = oneForCity;
        this.onePerDate = onePerDate;
        this.numberOfAdults = numberOfAdults;
        this.selectedCabins = selectedCabins;
        this.adultHoldBag = adultHoldBag;
        this.adultHandBag = adultHandBag;
        this.onlyWeekDays = onlyWeekDays;
        this.onlyWeekends = onlyWeekends;
        this.partnerMarket = partnerMarket;
        this.currency = currency;
        this.maxStopovers = maxStopovers;
        this.maxSectorStopovers = maxSectorStopovers;
        this.vehicleType = vehicleType;
    }

    public static String getLocale() {
        return locale;
    }

    public static void setLocale(String locale) {
        APIQueryParams.locale = locale;
    }

    public static String getLocationTypes() {
        return locationTypes;
    }

    public static void setLocationTypes(String locationTypes) {
        APIQueryParams.locationTypes = locationTypes;
    }

    public static String getReturnLimits() {
        return returnLimits;
    }

    public static void setReturnLimits(String returnLimits) {
        APIQueryParams.returnLimits = returnLimits;
    }

    public static String getActiveOnly() {
        return activeOnly;
    }

    public static void setActiveOnly(String activeOnly) {
        APIQueryParams.activeOnly = activeOnly;
    }

    public static String getReturnFromDifferentCity() {
        return returnFromDifferentCity;
    }

    public static void setReturnFromDifferentCity(String returnFromDifferentCity) {
        APIQueryParams.returnFromDifferentCity = returnFromDifferentCity;
    }

    public static String getReturnToDifferentCity() {
        return returnToDifferentCity;
    }

    public static void setReturnToDifferentCity(String returnToDifferentCity) {
        APIQueryParams.returnToDifferentCity = returnToDifferentCity;
    }

    public static String getOneForCity() {
        return oneForCity;
    }

    public static void setOneForCity(String oneForCity) {
        APIQueryParams.oneForCity = oneForCity;
    }

    public static String getOnePerDate() {
        return onePerDate;
    }

    public static void setOnePerDate(String onePerDate) {
        APIQueryParams.onePerDate = onePerDate;
    }

    public static String getNumberOfAdults() {
        return numberOfAdults;
    }

    public static void setNumberOfAdults(String numberOfAdults) {
        APIQueryParams.numberOfAdults = numberOfAdults;
    }

    public static String getSelectedCabins() {
        return selectedCabins;
    }

    public static void setSelectedCabins(String selectedCabins) {
        APIQueryParams.selectedCabins = selectedCabins;
    }

    public static String getAdultHoldBag() {
        return adultHoldBag;
    }

    public static void setAdultHoldBag(String adultHoldBag) {
        APIQueryParams.adultHoldBag = adultHoldBag;
    }

    public static String getAdultHandBag() {
        return adultHandBag;
    }

    public static void setAdultHandBag(String adultHandBag) {
        APIQueryParams.adultHandBag = adultHandBag;
    }

    public static String getOnlyWeekDays() {
        return onlyWeekDays;
    }

    public static void setOnlyWeekDays(String onlyWeekDays) {
        APIQueryParams.onlyWeekDays = onlyWeekDays;
    }

    public static String getOnlyWeekends() {
        return onlyWeekends;
    }

    public static void setOnlyWeekends(String onlyWeekends) {
        APIQueryParams.onlyWeekends = onlyWeekends;
    }

    public static String getPartnerMarket() {
        return partnerMarket;
    }

    public static void setPartnerMarket(String partnerMarket) {
        APIQueryParams.partnerMarket = partnerMarket;
    }

    public static String getCurrency() {
        return currency;
    }

    public static void setCurrency(String currency) {
        APIQueryParams.currency = currency;
    }

    public static String getMaxStopovers() {
        return maxStopovers;
    }

    public static void setMaxStopovers(String maxStopovers) {
        APIQueryParams.maxStopovers = maxStopovers;
    }

    public static String getMaxSectorStopovers() {
        return maxSectorStopovers;
    }

    public static void setMaxSectorStopovers(String maxSectorStopovers) {
        APIQueryParams.maxSectorStopovers = maxSectorStopovers;
    }

    public static String getVehicleType() {
        return vehicleType;
    }

    public static void setVehicleType(String vehicleType) {
        APIQueryParams.vehicleType = vehicleType;
    }
}
