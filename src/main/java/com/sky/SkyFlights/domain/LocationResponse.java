package com.sky.SkyFlights.domain;

import java.util.List;
public class LocationResponse {
    private String id;
    private int int_id;
    private int airport_int_id;
    private boolean active;
    private String code;
    private String icao;
    private String name;
    private String slug;
    private String slug_en;
    private List<String> alternative_names;
    private int rank;
    private int global_rank_dst;
    private int dst_popularity_score;
    private String timezone;
    private City city;
    private LocationDetails location;
    private List<AlternativeDeparturePoint> alternative_departure_points;
    private List<Tag> tags;
    private List<Integer> providers;
    private List<Special> special;
    private List<TouristRegion> tourist_region;
    private List<CarRental> car_rentals;
    private boolean new_ground;
    private int routing_priority;
    private String type;

    // Getters and setters for all fields


    public LocationResponse(String id, int int_id, int airport_int_id, boolean active, String code, String icao, String name, String slug, String slug_en, List<String> alternative_names, int rank, int global_rank_dst, int dst_popularity_score, String timezone, City city, LocationDetails location, List<AlternativeDeparturePoint> alternative_departure_points, List<Tag> tags, List<Integer> providers, List<Special> special, List<TouristRegion> tourist_region, List<CarRental> car_rentals, boolean new_ground, int routing_priority, String type) {
        this.id = id;
        this.int_id = int_id;
        this.airport_int_id = airport_int_id;
        this.active = active;
        this.code = code;
        this.icao = icao;
        this.name = name;
        this.slug = slug;
        this.slug_en = slug_en;
        this.alternative_names = alternative_names;
        this.rank = rank;
        this.global_rank_dst = global_rank_dst;
        this.dst_popularity_score = dst_popularity_score;
        this.timezone = timezone;
        this.city = city;
        this.location = location;
        this.alternative_departure_points = alternative_departure_points;
        this.tags = tags;
        this.providers = providers;
        this.special = special;
        this.tourist_region = tourist_region;
        this.car_rentals = car_rentals;
        this.new_ground = new_ground;
        this.routing_priority = routing_priority;
        this.type = type;
    }

    public LocationResponse() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getInt_id() {
        return int_id;
    }

    public void setInt_id(int int_id) {
        this.int_id = int_id;
    }

    public int getAirport_int_id() {
        return airport_int_id;
    }

    public void setAirport_int_id(int airport_int_id) {
        this.airport_int_id = airport_int_id;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getIcao() {
        return icao;
    }

    public void setIcao(String icao) {
        this.icao = icao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getSlug_en() {
        return slug_en;
    }

    public void setSlug_en(String slug_en) {
        this.slug_en = slug_en;
    }

    public List<String> getAlternative_names() {
        return alternative_names;
    }

    public void setAlternative_names(List<String> alternative_names) {
        this.alternative_names = alternative_names;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getGlobal_rank_dst() {
        return global_rank_dst;
    }

    public void setGlobal_rank_dst(int global_rank_dst) {
        this.global_rank_dst = global_rank_dst;
    }

    public int getDst_popularity_score() {
        return dst_popularity_score;
    }

    public void setDst_popularity_score(int dst_popularity_score) {
        this.dst_popularity_score = dst_popularity_score;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public LocationDetails getLocation() {
        return location;
    }

    public void setLocation(LocationDetails location) {
        this.location = location;
    }

    public List<AlternativeDeparturePoint> getAlternative_departure_points() {
        return alternative_departure_points;
    }

    public void setAlternative_departure_points(List<AlternativeDeparturePoint> alternative_departure_points) {
        this.alternative_departure_points = alternative_departure_points;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public List<Integer> getProviders() {
        return providers;
    }

    public void setProviders(List<Integer> providers) {
        this.providers = providers;
    }

    public List<Special> getSpecial() {
        return special;
    }

    public void setSpecial(List<Special> special) {
        this.special = special;
    }

    public List<TouristRegion> getTourist_region() {
        return tourist_region;
    }

    public void setTourist_region(List<TouristRegion> tourist_region) {
        this.tourist_region = tourist_region;
    }

    public List<CarRental> getCar_rentals() {
        return car_rentals;
    }

    public void setCar_rentals(List<CarRental> car_rentals) {
        this.car_rentals = car_rentals;
    }

    public boolean isNew_ground() {
        return new_ground;
    }

    public void setNew_ground(boolean new_ground) {
        this.new_ground = new_ground;
    }

    public int getRouting_priority() {
        return routing_priority;
    }

    public void setRouting_priority(int routing_priority) {
        this.routing_priority = routing_priority;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Inner classes representing nested structures
    public static class City {
        private String id;
        private String name;
        private String code;
        private String slug;
        private String subdivision;
        private String autonomous_territory;
        private Country country;
        private Region region;
        private Continent continent;

        // Getters and setters

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public String getSubdivision() {
            return subdivision;
        }

        public void setSubdivision(String subdivision) {
            this.subdivision = subdivision;
        }

        public String getAutonomous_territory() {
            return autonomous_territory;
        }

        public void setAutonomous_territory(String autonomous_territory) {
            this.autonomous_territory = autonomous_territory;
        }

        public Country getCountry() {
            return country;
        }

        public void setCountry(Country country) {
            this.country = country;
        }

        public Region getRegion() {
            return region;
        }

        public void setRegion(Region region) {
            this.region = region;
        }

        public Continent getContinent() {
            return continent;
        }

        public void setContinent(Continent continent) {
            this.continent = continent;
        }
    }

    public static class Country {
        private String id;
        private String name;
        private String slug;
        private String code;

        // Getters and setters

        public Country(String id, String name, String slug, String code) {
            this.id = id;
            this.name = name;
            this.slug = slug;
            this.code = code;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }
    }

    public static class Region {
        private String id;
        private String name;
        private String slug;

        public Region(String id, String name, String slug) {
            this.id = id;
            this.name = name;
            this.slug = slug;
        }

        // Getters and setters

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }
    }

    public static class Continent {
        private String id;
        private String name;
        private String slug;
        private String code;

        // Getters and setters

        public Continent(String id, String name, String slug, String code) {
            this.id = id;
            this.name = name;
            this.slug = slug;
            this.code = code;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }
    }

    public static class LocationDetails {
        private String lon;
        private String lat;

        // Getters and setters


        public LocationDetails(String lon, String lat) {
            this.lon = lon;
            this.lat = lat;
        }

        public String getLon() {
            return lon;
        }

        public void setLon(String lon) {
            this.lon = lon;
        }

        public String getLat() {
            return lat;
        }

        public void setLat(String lat) {
            this.lat = lat;
        }
    }

    public static class AlternativeDeparturePoint {
        private String id;
        private double distance;
        private double duration;

        public AlternativeDeparturePoint(String id, double distance, double duration) {
            this.id = id;
            this.distance = distance;
            this.duration = duration;
        }

        // Getters and setters

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public double getDistance() {
            return distance;
        }

        public void setDistance(double distance) {
            this.distance = distance;
        }

        public double getDuration() {
            return duration;
        }

        public void setDuration(double duration) {
            this.duration = duration;
        }
    }

    public static class Tag {
        private String tag;
        private int month_to;
        private int month_from;

        public Tag(String tag, int month_to, int month_from) {
            this.tag = tag;
            this.month_to = month_to;
            this.month_from = month_from;
        }

        // Getters and setters

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public int getMonth_to() {
            return month_to;
        }

        public void setMonth_to(int month_to) {
            this.month_to = month_to;
        }

        public int getMonth_from() {
            return month_from;
        }

        public void setMonth_from(int month_from) {
            this.month_from = month_from;
        }
    }

    public static class Special {
        private String id;
        private String name;
        private String slug;

        // Getters and setters


        public Special(String id, String name, String slug) {
            this.id = id;
            this.name = name;
            this.slug = slug;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }
    }

    public static class TouristRegion {
        private String id;
        private String name;
        private String slug;

        public TouristRegion(String id, String name, String slug) {
            this.id = id;
            this.name = name;
            this.slug = slug;
        }

        // Getters and setters

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }
    }

    public static class CarRental {
        private int provider_id;
        private String providers_locations;

        public CarRental(int provider_id, String providers_locations) {
            this.provider_id = provider_id;
            this.providers_locations = providers_locations;
        }

        // Getters and setters

        public int getProvider_id() {
            return provider_id;
        }

        public void setProvider_id(int provider_id) {
            this.provider_id = provider_id;
        }

        public String getProviders_locations() {
            return providers_locations;
        }

        public void setProviders_locations(String providers_locations) {
            this.providers_locations = providers_locations;
        }
    }

    public static class Meta {
        private Locale locale;

        public Meta(Locale locale) {
            this.locale = locale;
        }

        public Locale getLocale() {
            return locale;
        }

        public void setLocale(Locale locale) {
            this.locale = locale;
        }
    }

    public class Locale {
        private String code;
        private String status;

        public Locale(String code, String status) {
            this.code = code;
            this.status = status;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }
}







