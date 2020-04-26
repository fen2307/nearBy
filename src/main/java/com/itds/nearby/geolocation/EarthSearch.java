package com.itds.nearby.geolocation;

import com.google.maps.DirectionsApi.RouteRestriction;
import com.google.maps.DistanceMatrixApi;
import com.google.maps.DistanceMatrixApiRequest;
import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.errors.ApiException;
import com.google.maps.model.DistanceMatrix;
import com.google.maps.model.GeocodingResult;
import com.google.maps.model.LatLng;
import com.google.maps.model.TravelMode;

import java.io.IOException;

public class EarthSearch {
    private static final String API_KEY = "AIzaSyA7AeJRpr8tTKTpWZBN9sLew_dFS-QzzI0";

    public static String lookupAddr(String establishment) throws ApiException, InterruptedException, IOException {

        //set up key
        GeoApiContext lookupDoodad = new GeoApiContext.Builder()
                .apiKey(API_KEY)
                .build();
        GeocodingResult[] results = GeocodingApi.geocode(lookupDoodad,
                establishment).await();

        //converts results into usable address

        String address = (results[0].formattedAddress);

        return address;
    }

    public static LatLng lookupCoord(String establishment) throws ApiException, InterruptedException, IOException {

        //set up key
        GeoApiContext lookupDoodad = new GeoApiContext.Builder()
                .apiKey(API_KEY)
                .build();
        GeocodingResult[] results = GeocodingApi.geocode(lookupDoodad,
                establishment).await();

        //converts results into usable Coordinates

        LatLng coords = (results[0].geometry.location);
        //System.out.println(results[0].geometry.location);
        return coords;
    }

    public static long getDriveDist(String addrOne, String addrTwo) throws ApiException, InterruptedException, IOException {

        //set up key
        GeoApiContext distCalcer = new GeoApiContext.Builder()
                .apiKey(API_KEY)
                .build();

        DistanceMatrixApiRequest req = DistanceMatrixApi.newRequest(distCalcer);
        DistanceMatrix result = req.origins(addrOne)
                .destinations(addrTwo)
                .mode(TravelMode.DRIVING)
                .avoid(RouteRestriction.TOLLS)
                .language("en-US")
                .await();

        long distApart = result.rows[0].elements[0].distance.inMeters;

        return distApart;
    }

}
