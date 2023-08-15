package com.sky.SkyFlights.domain.FlightSearchAPI;

import com.sky.SkyFlights.domain.APIQueryParams;

public class flightSearchURIBuilder {

    public static String uri;

    public static String uriBuilder() {
        uri = "&max_fly_duration=" + APIQueryParams.getMaxFlyDuration()
                + "&ret_from_diff_city=" + APIQueryParams.getReturnFromDifferentCity()
                + "&ret_to_diff_city=" + APIQueryParams.getReturnToDifferentCity()
                + "&one_for_city=" + APIQueryParams.getOneForCity()
                + "&one_per_date=" + APIQueryParams.getOnePerDate()
                + "&adults=" + APIQueryParams.getNumberOfAdults()
                + "&selected_cabins=" + APIQueryParams.getSelectedCabins()
                + "&adult_hold_bag=" + APIQueryParams.getAdultHoldBag()
                + "&adult_hand_bag=" + APIQueryParams.getAdultHandBag()
                + "&only_working_days=" + APIQueryParams.getOnlyWeekDays()
                + "&only_weekends=" + APIQueryParams.getOnlyWeekends()
                + "&partner_market=" + APIQueryParams.getPartnerMarket()
                + "&curr=" + APIQueryParams.getCurrency()
                + "&locale=" + APIQueryParams.getSearchLocale()
                + "&max_stopovers=" + APIQueryParams.getMaxStopovers()
                + "&max_sector_stopovers=" + APIQueryParams.getMaxSectorStopovers()
                + "&vehicle_type=" + APIQueryParams.getVehicleType()
                + "&limit=" + APIQueryParams.getReturnLimits();
        return uri;
    };

    public static String uriBuilderFiltered() {
        uri = "&max_fly_duration=" + APIQueryParams.getMaxFlyDuration()
                + "&ret_from_diff_city=" + APIQueryParams.getReturnFromDifferentCity()
                + "&ret_to_diff_city=" + APIQueryParams.getReturnToDifferentCity()
                + "&one_for_city=" + APIQueryParams.getOneForCity()
                + "&one_per_date=" + APIQueryParams.getOnePerDate()
                + "&adult_hold_bag=" + APIQueryParams.getAdultHoldBag()
                + "&adult_hand_bag=" + APIQueryParams.getAdultHandBag()
                + "&partner_market=" + APIQueryParams.getPartnerMarket()
                + "&locale=" + APIQueryParams.getSearchLocale()
                + "&max_sector_stopovers=" + APIQueryParams.getMaxSectorStopovers()
                + "&vehicle_type=" + APIQueryParams.getVehicleType()
                + "&limit=" + APIQueryParams.getReturnLimits();

        return uri;
    };

}
