package istad.co.kafka_producer_demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class EventProducerService {

    private static final Logger log = LoggerFactory.getLogger(EventProducerService.class);
    private final KafkaTemplate<String, Object> kafkaTemplate;

    public EventProducerService(KafkaTemplate<String, Object> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(String topic, String key, Object event) {
        log.info("SENDING → Topic={}, Key={}, Payload={}", topic, key, event.getClass().getSimpleName());
        kafkaTemplate.send(topic, key, event);
    }

}
