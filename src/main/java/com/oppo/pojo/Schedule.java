package com.oppo.pojo;


import lombok.Data;

@Data
public class Schedule {

    private Integer id;
    private  Integer beginTime;
    private Integer endTime;
    private Integer posId;
    private String timeSet;
    private Integer totalCpm;
    private Integer pmpEnabled;
    private Integer ownerId;

}
