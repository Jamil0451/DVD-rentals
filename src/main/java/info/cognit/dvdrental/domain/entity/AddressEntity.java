package info.cognit.dvdrental.domain.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="ADDRESS")
@Data
public class AddressEntity {

    @Id
    @Column(name = "ADDRESS_ID")
    private Integer addressId;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "ADDRESS2")
    private String address2;

    @Column(name = "DISTRICT")
    private String district;

    @Column(name = "CITY_ID")
    private Integer cityId;

    @Column(name = "POSTAL_CODE")
    private String postalCode;

    @Column(name = "PHONE")
    private String phone;
}
