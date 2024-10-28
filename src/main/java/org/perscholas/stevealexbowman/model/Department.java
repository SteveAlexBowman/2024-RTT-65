package org.perscholas.stevealexbowman.model;

import jakarta.persistence.*;

@Entity // States that this class will model a table in the database
@Table (name="DEPARTMENT") // if we need to name the table differently than the class name
public class Department {
    @Column(name="DID_ID") // optional but we use if we want the column name to be different
    @Id // To tell SQL that this will be the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer dId;
    private String name;
    private String state;

    public Department() {

    }

    public Department(Integer dId, String name, String state) {
        this.dId = dId;
        this.name = name;
        this.state = state;

    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
