package com.zzw.centerservice.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Event {
    private String eventTypeCode;
    private Date eventTime;
    private String eventBy;
}
