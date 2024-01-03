// automatically generated by the FlatBuffers compiler, do not modify

package com.openmeteo.sdk;

@SuppressWarnings("unused")
public final class Variable {
  private Variable() { }
  public static final int undefined = 0;
  public static final int apparent_temperature = 1;
  public static final int cape = 2;
  public static final int cloud_cover = 3;
  public static final int cloud_cover_high = 4;
  public static final int cloud_cover_low = 5;
  public static final int cloud_cover_mid = 6;
  public static final int daylight_duration = 7;
  public static final int dew_point = 8;
  public static final int diffuse_radiation = 9;
  public static final int diffuse_radiation_instant = 10;
  public static final int direct_normal_irradiance = 11;
  public static final int direct_normal_irradiance_instant = 12;
  public static final int direct_radiation = 13;
  public static final int direct_radiation_instant = 14;
  public static final int et0_fao_evapotranspiration = 15;
  public static final int evapotranspiration = 16;
  public static final int freezing_level_height = 17;
  public static final int growing_degree_days = 18;
  public static final int is_day = 19;
  public static final int latent_heat_flux = 20;
  public static final int leaf_wetness_probability = 21;
  public static final int lifted_index = 22;
  public static final int lightning_potential = 23;
  public static final int precipitation = 24;
  public static final int precipitation_hours = 25;
  public static final int precipitation_probability = 26;
  public static final int pressure_msl = 27;
  public static final int rain = 28;
  public static final int relative_humidity = 29;
  public static final int runoff = 30;
  public static final int sensible_heat_flux = 31;
  public static final int shortwave_radiation = 32;
  public static final int shortwave_radiation_instant = 33;
  public static final int showers = 34;
  public static final int snow_depth = 35;
  public static final int snow_height = 36;
  public static final int snowfall = 37;
  public static final int snowfall_height = 38;
  public static final int snowfall_water_equivalent = 39;
  public static final int sunrise = 40;
  public static final int sunset = 41;
  public static final int soil_moisture = 42;
  public static final int soil_moisture_index = 43;
  public static final int soil_temperature = 44;
  public static final int surface_pressure = 45;
  public static final int surface_temperature = 46;
  public static final int temperature = 47;
  public static final int terrestrial_radiation = 48;
  public static final int terrestrial_radiation_instant = 49;
  public static final int total_column_integrated_water_vapour = 50;
  public static final int updraft = 51;
  public static final int uv_index = 52;
  public static final int uv_index_clear_sky = 53;
  public static final int vapour_pressure_deficit = 54;
  public static final int visibility = 55;
  public static final int weather_code = 56;
  public static final int wind_direction = 57;
  public static final int wind_gusts = 58;
  public static final int wind_speed = 59;
  public static final int vertical_velocity = 60;
  public static final int geopotential_height = 61;
  public static final int wet_bulb_temperature = 62;
  public static final int river_discharge = 63;
  public static final int wave_height = 64;
  public static final int wave_period = 65;
  public static final int wave_direction = 66;
  public static final int wind_wave_height = 67;
  public static final int wind_wave_period = 68;
  public static final int wind_wave_peak_period = 69;
  public static final int wind_wave_direction = 70;
  public static final int swell_wave_height = 71;
  public static final int swell_wave_period = 72;
  public static final int swell_wave_peak_period = 73;
  public static final int swell_wave_direction = 74;
  public static final int pm10 = 75;
  public static final int pm2p5 = 76;
  public static final int dust = 77;
  public static final int aerosol_optical_depth = 78;
  public static final int carbon_monoxide = 79;
  public static final int nitrogen_dioxide = 80;
  public static final int ammonia = 81;
  public static final int ozone = 82;
  public static final int sulphur_dioxide = 83;
  public static final int alder_pollen = 84;
  public static final int birch_pollen = 85;
  public static final int grass_pollen = 86;
  public static final int mugwort_pollen = 87;
  public static final int olive_pollen = 88;
  public static final int ragweed_pollen = 89;
  public static final int european_aqi = 90;
  public static final int european_aqi_pm2p5 = 91;
  public static final int european_aqi_pm10 = 92;
  public static final int european_aqi_nitrogen_dioxide = 93;
  public static final int european_aqi_ozone = 94;
  public static final int european_aqi_sulphur_dioxide = 95;
  public static final int us_aqi = 96;
  public static final int us_aqi_pm2p5 = 97;
  public static final int us_aqi_pm10 = 98;
  public static final int us_aqi_nitrogen_dioxide = 99;
  public static final int us_aqi_ozone = 100;
  public static final int us_aqi_sulphur_dioxide = 101;
  public static final int us_aqi_carbon_monoxide = 102;
  public static final int sunshine_duration = 103;
  public static final int convective_inhibition = 104;
  public static final int shortwave_radiation_clear_sky = 105;

  public static final String[] names = { "undefined", "apparent_temperature", "cape", "cloud_cover", "cloud_cover_high", "cloud_cover_low", "cloud_cover_mid", "daylight_duration", "dew_point", "diffuse_radiation", "diffuse_radiation_instant", "direct_normal_irradiance", "direct_normal_irradiance_instant", "direct_radiation", "direct_radiation_instant", "et0_fao_evapotranspiration", "evapotranspiration", "freezing_level_height", "growing_degree_days", "is_day", "latent_heat_flux", "leaf_wetness_probability", "lifted_index", "lightning_potential", "precipitation", "precipitation_hours", "precipitation_probability", "pressure_msl", "rain", "relative_humidity", "runoff", "sensible_heat_flux", "shortwave_radiation", "shortwave_radiation_instant", "showers", "snow_depth", "snow_height", "snowfall", "snowfall_height", "snowfall_water_equivalent", "sunrise", "sunset", "soil_moisture", "soil_moisture_index", "soil_temperature", "surface_pressure", "surface_temperature", "temperature", "terrestrial_radiation", "terrestrial_radiation_instant", "total_column_integrated_water_vapour", "updraft", "uv_index", "uv_index_clear_sky", "vapour_pressure_deficit", "visibility", "weather_code", "wind_direction", "wind_gusts", "wind_speed", "vertical_velocity", "geopotential_height", "wet_bulb_temperature", "river_discharge", "wave_height", "wave_period", "wave_direction", "wind_wave_height", "wind_wave_period", "wind_wave_peak_period", "wind_wave_direction", "swell_wave_height", "swell_wave_period", "swell_wave_peak_period", "swell_wave_direction", "pm10", "pm2p5", "dust", "aerosol_optical_depth", "carbon_monoxide", "nitrogen_dioxide", "ammonia", "ozone", "sulphur_dioxide", "alder_pollen", "birch_pollen", "grass_pollen", "mugwort_pollen", "olive_pollen", "ragweed_pollen", "european_aqi", "european_aqi_pm2p5", "european_aqi_pm10", "european_aqi_nitrogen_dioxide", "european_aqi_ozone", "european_aqi_sulphur_dioxide", "us_aqi", "us_aqi_pm2p5", "us_aqi_pm10", "us_aqi_nitrogen_dioxide", "us_aqi_ozone", "us_aqi_sulphur_dioxide", "us_aqi_carbon_monoxide", "sunshine_duration", "convective_inhibition", "shortwave_radiation_clear_sky", };

  public static String name(int e) { return names[e]; }
}

