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

public class OrderEvent {
    private String orderId;
    private String product;
    private Integer quantity;
    private Double price;
    private LocalDateTime createdAt;
}
