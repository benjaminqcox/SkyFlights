package com.sky.SkyFlights.domain;

public class APIQueryParams {

    private String locale = "en-US";

    private String locationTypes = "airport";

    private String returnLimits = "5";

    private String activeOnly = "true";

    private String searchLocale = "gb";

    private String maxFlyDuration = "24";

    private String returnFromDifferentCity = "false";

    private String returnToDifferentCity = "false";

    private String oneForCity = "0";

    private String onePerDate = "0";

    private String numberOfAdults = "2";

    private String selectedCabins = "M";

    private String adultHoldBag = "1,0";

    private String adultHandBag = "1,1";

    private String onlyWeekDays = "false";

    private String onlyWeekends = "false";

    private String partnerMarket = "us";

    private String currency = "GBP";

    private String maxStopovers = "0";

    private String maxSectorStopovers = "1";

    private String vehicleType = "aircraft";



    public APIQueryParams() {
    }

    public APIQueryParams(String locale, String locationTypes, String returnLimits, String activeOnly) {
        this.locale = locale;
        this.locationTypes = locationTypes;
        this.returnLimits = returnLimits;
        this.activeOnly = activeOnly;
    }

    public APIQueryParams(String locale, String maxFlyDuration, String locationTypes, String returnLimits, String activeOnly, String searchLocale, String returnFromDifferentCity, String returnToDifferentCity, String oneForCity, String onePerDate, String numberOfAdults, String selectedCabins, String adultHoldBag, String adultHandBag, String onlyWeekDays, String onlyWeekends, String partnerMarket, String currency, String maxStopovers, String maxSectorStopovers, String vehicleType) {
        this.locale = locale;
        this.maxFlyDuration = maxFlyDuration;
        this.locationTypes = locationTypes;
        this.returnLimits = returnLimits;
        this.activeOnly = activeOnly;
        this.searchLocale = searchLocale;
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

    public String getMaxFlyDuration() {
        return maxFlyDuration;
    }

    public void setMaxFlyDuration(String maxFlyDuration) {
        this.maxFlyDuration = maxFlyDuration;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getLocationTypes() {
        return locationTypes;
    }

    public void setLocationTypes(String locationTypes) {
        this.locationTypes = locationTypes;
    }

    public String getReturnLimits() {
        return returnLimits;
    }

    public void setReturnLimits(String returnLimits) {
        this.returnLimits = returnLimits;
    }

    public String getActiveOnly() {
        return activeOnly;
    }

    public void setActiveOnly(String activeOnly) {
        this.activeOnly = activeOnly;
    }

    public  String getReturnFromDifferentCity() {
        return returnFromDifferentCity;
    }

    public void setReturnFromDifferentCity(String returnFromDifferentCity) {
        this.returnFromDifferentCity = returnFromDifferentCity;
    }

    public String getReturnToDifferentCity() {
        return returnToDifferentCity;
    }

    public void setReturnToDifferentCity(String returnToDifferentCity) {
        this.returnToDifferentCity = returnToDifferentCity;
    }

    public String getOneForCity() {
        return oneForCity;
    }

    public void setOneForCity(String oneForCity) {
        this.oneForCity = oneForCity;
    }

    public String getOnePerDate() {
        return onePerDate;
    }

    public void setOnePerDate(String onePerDate) {
        this.onePerDate = onePerDate;
    }

    public String getNumberOfAdults() {
        return numberOfAdults;
    }

    public void setNumberOfAdults(String numberOfAdults) {
        this.numberOfAdults = numberOfAdults;
    }

    public String getSelectedCabins() {
        return selectedCabins;
    }

    public void setSelectedCabins(String selectedCabins) {
        this.selectedCabins = selectedCabins;
    }

    public String getAdultHoldBag() {
        return adultHoldBag;
    }

    public void setAdultHoldBag(String adultHoldBag) {
        this.adultHoldBag = adultHoldBag;
    }

    public String getAdultHandBag() {
        return adultHandBag;
    }

    public void setAdultHandBag(String adultHandBag) {
        this.adultHandBag = adultHandBag;
    }

    public String getOnlyWeekDays() {
        return onlyWeekDays;
    }

    public void setOnlyWeekDays(String onlyWeekDays) {
        this.onlyWeekDays = onlyWeekDays;
    }

    public String getOnlyWeekends() {
        return onlyWeekends;
    }

    public void setOnlyWeekends(String onlyWeekends) {
        this.onlyWeekends = onlyWeekends;
    }

    public String getPartnerMarket() {
        return partnerMarket;
    }

    public void setPartnerMarket(String partnerMarket) {
        this.partnerMarket = partnerMarket;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getMaxStopovers() {
        return maxStopovers;
    }

    public void setMaxStopovers(String maxStopovers) {
        this.maxStopovers = maxStopovers;
    }

    public String getMaxSectorStopovers() {
        return maxSectorStopovers;
    }

    public void setMaxSectorStopovers(String maxSectorStopovers) {
        this.maxSectorStopovers = maxSectorStopovers;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getSearchLocale() {
        return searchLocale;
    }

    public void setSearchLocale(String searchLocale) {
        this.searchLocale = searchLocale;
    }

    @Override
    public String toString() {
        return "APIQueryParams{" +
                "locale='" + locale + '\'' +
                ", locationTypes='" + locationTypes + '\'' +
                ", returnLimits='" + returnLimits + '\'' +
                ", activeOnly='" + activeOnly + '\'' +
                ", searchLocale='" + searchLocale + '\'' +
                ", maxFlyDuration='" + maxFlyDuration + '\'' +
                ", returnFromDifferentCity='" + returnFromDifferentCity + '\'' +
                ", returnToDifferentCity='" + returnToDifferentCity + '\'' +
                ", oneForCity='" + oneForCity + '\'' +
                ", onePerDate='" + onePerDate + '\'' +
                ", numberOfAdults='" + numberOfAdults + '\'' +
                ", selectedCabins='" + selectedCabins + '\'' +
                ", adultHoldBag='" + adultHoldBag + '\'' +
                ", adultHandBag='" + adultHandBag + '\'' +
                ", onlyWeekDays='" + onlyWeekDays + '\'' +
                ", onlyWeekends='" + onlyWeekends + '\'' +
                ", partnerMarket='" + partnerMarket + '\'' +
                ", currency='" + currency + '\'' +
                ", maxStopovers='" + maxStopovers + '\'' +
                ", maxSectorStopovers='" + maxSectorStopovers + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                '}';
    }
}
