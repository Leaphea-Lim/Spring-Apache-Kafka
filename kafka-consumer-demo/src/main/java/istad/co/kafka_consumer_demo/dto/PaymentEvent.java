package istad.co.kafka_consumer_demo.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class PaymentEvent {
    private String paymentId;
    private String orderId;
    private Double amount;
    private String method;
    private LocalDateTime paidAt;
}
