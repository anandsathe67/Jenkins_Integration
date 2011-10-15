package com.inkiru.hello;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

public class HelloWorld {
    final static Logger logger = Logger.getLogger(HelloWorld.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();
        logger.info("Hello World!!!");     
    }
}