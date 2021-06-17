package info.cognit.dvdrental.domain.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PAYMENT")
@Data
public class PaymentEntity {
    @Id
    @Column(name = "PAYMENT_ID")
    private Long paymentId;

    @Column(name = "CUSTOMER_ID")
    private Integer customerId;

    @Column(name = "STAFF_ID")
    private Integer staffId;

    @Column(name = "RENTAL_ID")
    private Integer rentalId;

    @Column(name = "AMOUNT")
    private Double amount;
}