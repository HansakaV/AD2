package lk.ijse.parkingspaceservice.repo;

import lk.ijse.parkingspaceservice.entity.ParkingSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingSessionRepo extends JpaRepository<ParkingSession, Integer> {
}
