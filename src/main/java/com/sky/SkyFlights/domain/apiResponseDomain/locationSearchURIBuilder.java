package com.sky.SkyFlights.domain.apiResponseDomain;
import com.sky.SkyFlights.domain.APIQueryParams;

public class locationSearchURIBuilder {

    private APIQueryParams apiQueryParams;
    public static String uri;

    public String uriBuilder() {
        uri = "&locale=" + this.apiQueryParams.getLocale()
                + "&location_types=" + this.apiQueryParams.getLocationTypes()
                + "&limit=" + this.apiQueryParams.getReturnLimits()
                + "&active_only=" + this.apiQueryParams.getActiveOnly();
        return uri;
    }




}
