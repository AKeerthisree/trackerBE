package com.example.tracker.beans;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table()
public class blockDetails {
    @Id
    private String block_id;

    @ManyToOne
    private sampleDetails sd;

    private String remarks;

    public blockDetails() {
    }

    public blockDetails(String block_id, sampleDetails sd, String remarks) {
        this.block_id = block_id;
        this.sd = sd;
        this.remarks = remarks;
    }

    public String getBlock_id() {
        return block_id;
    }

    public void setBlock_id(String block_id) {
        this.block_id = block_id;
    }

    public sampleDetails getSd() {
        return sd;
    }

    public void setSd(sampleDetails sd) {
        this.sd = sd;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "blockDetails{" +
                "block_id='" + block_id + '\'' +
                ", sd=" + sd +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
