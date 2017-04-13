package com.example.weather;

import android.app.Activity;
import android.content.SharedPreferences;

/**
 * Created by Марта on 13.04.2017.
 */

public class City {
    SharedPreferences prefs;

    public City(Activity activity){
        prefs = activity.getPreferences(Activity.MODE_PRIVATE);
    }

    // Если пользователь не выбрал город, на умолчанию
    // будем показывать погоду на Lviv
    String getCity(){
        return prefs.getString("city", "Lviv, UA");
    }

    void setCity(String city){
        prefs.edit().putString("city", city).commit();
    }
}
