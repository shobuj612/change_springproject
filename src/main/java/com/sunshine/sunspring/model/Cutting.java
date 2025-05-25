package com.sunshine.sunspring.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "cutting")
public class Cutting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cutting_id")
    private Long cutting_id;

    @Column(name = "order_id", nullable = false)
    private Long order_id;

    @Column(name = "cutting_start_date")
    @Temporal(TemporalType.DATE)
    private Date cutting_start_date;

    @Column(name = "cutting_end_date")
    @Temporal(TemporalType.DATE)
    private Date cutting_end_date;

    @Column(name = "cut_qty")
    private int cut_qty;

    @Column(name = "supervisor_name")
    private String supervisor_name;

    // Default constructor
    public Cutting() {}

    // Getters and Setters
    public Long getCutting_id() {
        return cutting_id;
    }

    public void setCutting_id(Long cutting_id) {
        this.cutting_id = cutting_id;
    }

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }

    public Date getCutting_start_date() {
        return cutting_start_date;
    }

    public void setCutting_start_date(Date cutting_start_date) {
        this.cutting_start_date = cutting_start_date;
    }

    public Date getCutting_end_date() {
        return cutting_end_date;
    }

    public void setCutting_end_date(Date cutting_end_date) {
        this.cutting_end_date = cutting_end_date;
    }

    public int getCut_qty() {
        return cut_qty;
    }

    public void setCut_qty(int cut_qty) {
        this.cut_qty = cut_qty;
    }

    public String getSupervisor_name() {
        return supervisor_name;
    }

    public void setSupervisor_name(String supervisor_name) {
        this.supervisor_name = supervisor_name;
    }
}
