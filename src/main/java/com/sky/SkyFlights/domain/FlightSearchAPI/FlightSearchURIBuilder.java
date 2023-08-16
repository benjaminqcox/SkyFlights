package com.sky.SkyFlights.domain.FlightSearchAPI;

import com.sky.SkyFlights.domain.APIQueryParams;

public class FlightSearchURIBuilder {


    public static String uri;

    public String uriBuilder() {
        APIQueryParams apiQueryParams = new APIQueryParams();
        uri = "&max_fly_duration=" + apiQueryParams.getMaxFlyDuration()
                + "&ret_from_diff_city=" + apiQueryParams.getReturnFromDifferentCity()
                + "&ret_to_diff_city=" + apiQueryParams.getReturnToDifferentCity()
                + "&one_for_city=" + apiQueryParams.getOneForCity()
                + "&one_per_date=" + apiQueryParams.getOnePerDate()
                + "&adults=" + apiQueryParams.getNumberOfAdults()
                + "&selected_cabins=" + apiQueryParams.getSelectedCabins()
                + "&adult_hold_bag=" + apiQueryParams.getAdultHoldBag()
                + "&adult_hand_bag=" + apiQueryParams.getAdultHandBag()
                + "&only_working_days=" + apiQueryParams.getOnlyWeekDays()
                + "&only_weekends=" + apiQueryParams.getOnlyWeekends()
                + "&partner_market=" + apiQueryParams.getPartnerMarket()
                + "&curr=" + apiQueryParams.getCurrency()
                + "&locale=" + apiQueryParams.getSearchLocale()
                + "&max_stopovers=" + apiQueryParams.getMaxStopovers()
                + "&max_sector_stopovers=" + apiQueryParams.getMaxSectorStopovers()
                + "&vehicle_type=" + apiQueryParams.getVehicleType()
                + "&limit=" + apiQueryParams.getReturnLimits();
        return uri;
    };

    public String uriBuilderFiltered(String adultBagString) {
        APIQueryParams apiQueryParams = new APIQueryParams();
        apiQueryParams.setAdultHandBag(adultBagString);
        apiQueryParams.setAdultHoldBag(adultBagString);

        uri = "&max_fly_duration=" + apiQueryParams.getMaxFlyDuration()
                + "&ret_from_diff_city=" + apiQueryParams.getReturnFromDifferentCity()
                + "&ret_to_diff_city=" + apiQueryParams.getReturnToDifferentCity()
                + "&one_for_city=" + apiQueryParams.getOneForCity()
                + "&one_per_date=" + apiQueryParams.getOnePerDate()
                + "&adult_hold_bag=" + apiQueryParams.getAdultHoldBag()
                + "&adult_hand_bag=" + apiQueryParams.getAdultHandBag()
                + "&partner_market=" + apiQueryParams.getPartnerMarket()
                + "&locale=" + apiQueryParams.getSearchLocale()
                + "&max_sector_stopovers=" + apiQueryParams.getMaxSectorStopovers()
                + "&vehicle_type=" + apiQueryParams.getVehicleType()
                + "&limit=" + apiQueryParams.getReturnLimits();

        return uri;
    };

}
