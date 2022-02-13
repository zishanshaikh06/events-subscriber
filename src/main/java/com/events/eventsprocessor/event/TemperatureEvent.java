package com.events.eventsprocessor.event;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class TemperatureEvent {
    /** Temperature in Celcius. */
    private Double temperature;

    /** Time temerature reading was taken. */
    private Date timeOfReading;


    /**
     * Get the Temperature.
     * @return Temperature in Celsius
     */
    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public void setTimeOfReading(Date timeOfReading) {
        this.timeOfReading = timeOfReading;
    }

    /**
     * Get time Temperature reading was taken.
     * @return Time of Reading
     */
    public Date getTimeOfReading() {
        return timeOfReading;
    }

    @Override
    public String toString() {
        return "TemperatureEvent [" + temperature + "C]";
    }
}
