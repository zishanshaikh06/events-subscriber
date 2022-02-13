package com.events.eventsprocessor.receiver;

import com.events.eventsprocessor.event.TemperatureEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.annotation.RabbitListenerConfigurer;
import org.springframework.amqp.rabbit.listener.RabbitListenerEndpointRegistrar;
import org.springframework.stereotype.Component;

@Component
public class Receiver implements RabbitListenerConfigurer {

    private static Logger LOG = LoggerFactory.getLogger(Receiver.class);

    @Override
    public void configureRabbitListeners(RabbitListenerEndpointRegistrar rabbitListenerEndpointRegistrar) {
    }

    @RabbitListener(queues = "${spring.rabbitmq.temperature.queue}")
    public void receive(TemperatureEvent temperatureEvent) {
        LOG.info("Received temperature event: {}", temperatureEvent);
        LOG.info("--------------------------------------");
        LOG.info("Temperature = {}", temperatureEvent);
        LOG.info("--------------------------------------");
    }
}