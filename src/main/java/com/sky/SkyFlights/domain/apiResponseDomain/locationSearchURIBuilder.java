package com.sky.SkyFlights.domain.apiResponseDomain;
import com.sky.SkyFlights.domain.APIQueryParams;

public class locationSearchURIBuilder {

    public static String uri;

    public static String uriBuilder() {
        uri = "&locale=" + APIQueryParams.getLocale()
                + "&location_types=" + APIQueryParams.getLocationTypes()
                + "&limit=" + APIQueryParams.getReturnLimits()
                + "&active_only=" + APIQueryParams.getActiveOnly();
        return uri;
    }




}
