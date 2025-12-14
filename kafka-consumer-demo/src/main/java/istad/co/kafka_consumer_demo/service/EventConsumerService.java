package istad.co.kafka_consumer_demo.service;

import istad.co.kafka_consumer_demo.dto.OrderEvent;
import istad.co.kafka_consumer_demo.dto.PaymentEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class EventConsumerService {
    private static final Logger log = LoggerFactory.getLogger(EventConsumerService.class);

    @KafkaListener(topics = "orders-topic", groupId = "multi-event-group")
    public void consumeOrder(OrderEvent event) {
        log.info("RECEIVED OrderEvent → {}", event);
    }

    @KafkaListener(topics = "payments-topic", groupId = "multi-event-group")
    public void consumePayment(PaymentEvent event) {
        log.info("RECEIVED PaymentEvent → {}", event);
    }
}
