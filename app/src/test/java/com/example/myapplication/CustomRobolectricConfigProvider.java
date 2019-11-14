package com.example.myapplication;


import com.google.auto.service.AutoService;

import org.robolectric.annotation.Config;
import org.robolectric.pluginapi.config.GlobalConfigProvider;

@AutoService(GlobalConfigProvider.class)
public class CustomRobolectricConfigProvider implements GlobalConfigProvider {

    private static final String RU_LOCALE = "ru";

    @Override
    public Config get() {
        return new Config.Builder()
                .setQualifiers(RU_LOCALE)
                .build();
    }
}