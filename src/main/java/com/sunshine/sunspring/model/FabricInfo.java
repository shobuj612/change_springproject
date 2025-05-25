package com.sunshine.sunspring.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "fabric_info")
public class FabricInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fabric_id")
    private Long fabric_id;

    @Column(name = "order_id", nullable = false)
    private Long order_id;

    @Column(name = "fabric_type", nullable = false)
    private String fabric_type;

    @Column(name = "fabric_qty")
    private int fabric_qty;

    @Column(name = "received_date")
    @Temporal(TemporalType.DATE)
    private Date received_date;

    @Column(name = "available_stock")
    private int available_stock;

    // Default constructor
    public FabricInfo() {}

    // Getters and Setters
    public Long getFabric_id() {
        return fabric_id;
    }

    public void setFabric_id(Long fabric_id) {
        this.fabric_id = fabric_id;
    }

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }

    public String getFabric_type() {
        return fabric_type;
    }

    public void setFabric_type(String fabric_type) {
        this.fabric_type = fabric_type;
    }

    public int getFabric_qty() {
        return fabric_qty;
    }

    public void setFabric_qty(int fabric_qty) {
        this.fabric_qty = fabric_qty;
    }

    public Date getReceived_date() {
        return received_date;
    }

    public void setReceived_date(Date received_date) {
        this.received_date = received_date;
    }

    public int getAvailable_stock() {
        return available_stock;
    }

    public void setAvailable_stock(int available_stock) {
        this.available_stock = available_stock;
    }
}
