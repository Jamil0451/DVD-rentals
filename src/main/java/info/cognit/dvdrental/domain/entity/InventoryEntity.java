package info.cognit.dvdrental.domain.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "INVENTORY")
@Data
public class InventoryEntity {

    @Id
    @Column(name = "INVENTORY_ID")
    private Integer inventoryId;

    @Id
    @Column(name = "FILM_ID")
    private Integer filmId;

    @Id
    @Column(name = "STORE_ID")
    private Integer storeId;

    @Id
    @Column(name = "LAST_UPDATE")
    private LocalDateTime lastUpdate;

}
