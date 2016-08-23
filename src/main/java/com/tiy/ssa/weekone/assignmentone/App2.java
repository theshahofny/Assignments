package com.tiy.ssa.weekone.assignmentone;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;


public class App2 {


	static final Logger LOGGER = LogManager.getLogger(App2.class);
    
    public static void main( String[] args )
    {
        LOGGER.debug("debug message");
        LOGGER.debug("What time is it? ()", LocalDate.now());
        System.out.println("hello world");

    }
    
    
}
