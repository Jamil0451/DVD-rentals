package info.cognit.dvdrental.domain.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "RENTAL")
@Data
public class RentalEntity {
    @Id
    @Column(name = "RENTAL_ID")
    private Long rentalId;

    @Column(name = "RENTAL_DATE")
    private LocalDateTime rentalDate;

    @Column(name = "INVENTORY_ID")
    private Integer inventoryId;

    @Column(name = "CUSTOMER_ID")
    private Integer customerId;

    @Column(name = "RETURN_DATE")
    private LocalDateTime returnDate;

    @Column(name = "STAFF_ID")
    private Integer staffId;
}
