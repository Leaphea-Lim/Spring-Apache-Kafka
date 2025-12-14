package istad.co.kafka_producer_demo.controller;

import istad.co.kafka_producer_demo.dto.OrderEvent;
import istad.co.kafka_producer_demo.dto.PaymentEvent;
import istad.co.kafka_producer_demo.service.EventProducerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.UUID;

@RestController
@RequestMapping("/api/events")
public class EventController {
    private final EventProducerService producer;


    public EventController(EventProducerService producer) {
        this.producer = producer;
    }


    @PostMapping("/order")
    public String sendOrder() {
        OrderEvent event = OrderEvent.builder()
                .orderId("ORD-" + UUID.randomUUID())
                .product("Laptop")
                .quantity(1)
                .price(1200.0)
                .createdAt(LocalDateTime.now())
                .build();


        producer.send("orders-topic", event.getOrderId(), event);
        return "OrderEvent sent";
    }


    @PostMapping("/payment")
    public String sendPayment() {
        PaymentEvent event = PaymentEvent.builder()
                .paymentId("PAY-" + UUID.randomUUID())
                .orderId("ORD-123")
                .amount(1200.0)
                .method("CARD")
                .paidAt(LocalDateTime.now())
                .build();


        producer.send("payments-topic", event.getPaymentId(), event);
        return "PaymentEvent sent";
    }
}
