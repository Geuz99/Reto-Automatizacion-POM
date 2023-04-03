package com.saucedemo.main.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

public class Constantes {

    private Constantes(){

    }

    private static final Logger LOGGER = LoggerFactory.getLogger(Constantes.class);
    private static final String RUTA_PROPERTIES = "src/test/resources/properties/general.properties";
    private  static  final Properties PROPERTIES = loadProperties();
    public static  final String USERNAME = PROPERTIES.getProperty("username");
    public static final String PASSWORD = PROPERTIES.getProperty("password");
    private static Properties loadProperties(){
        Properties properties = new Properties();
        try {
            String s = GeneralUtil.formatMessageInformation("Cargando los datos de configuracion");
            LOGGER.info(s);
            properties.load(Files.newInputStream(Path.of(RUTA_PROPERTIES)));
        }catch (IOException e ){
            String s = GeneralUtil.formatMessageInformation("Error al cargar el archivo de configuracion");
            LOGGER.info(s);
        }
        return properties;
    }
}
