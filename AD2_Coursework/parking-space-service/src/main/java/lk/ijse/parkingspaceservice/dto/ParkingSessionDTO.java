package lk.ijse.parkingspaceservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParkingSessionDTO {

    private Long sessionId;

    private int parkingId;
    private int userId;

    private LocalDateTime entryTime;
    private LocalDateTime exitTime;

    private Boolean isPaid;
    private Double totalFee;

    public ParkingSessionDTO(int parkingId, int userId) {
        this.parkingId = parkingId;
        this.userId = userId;
    }
}
