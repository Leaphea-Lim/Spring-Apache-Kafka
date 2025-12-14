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

public class OrderEvent {
    private String orderId;
    private String product;
    private Integer quantity;
    private Double price;
    private LocalDateTime createdAt;
}
