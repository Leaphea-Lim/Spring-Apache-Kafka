package istad.co.kafka_producer_demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

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
