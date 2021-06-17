package info.cognit.dvdrental.domain.entity;


import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name ="CUSTOMER")
@Data
public class CustomerEntity {

    @Id
    @Column(name = "CUSTOMER_ID")
    private Long customerId;

    @Column(name = "STORE_ID")
    private Integer storeId;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "ADDRESS_ID")
    private Integer addressId;

    @Column(name = "ACTIVEBOOL")
    private boolean activeBool;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @Column(name = "CREATE_DATE")
    private LocalDateTime createDate;

//    @Column(name = "LAST_UPDATE")
//    private LocalDateTime lastUpdate;

//    @Column(name = "ACTIVE")
//    private Long active;

}
