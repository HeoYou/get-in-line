package com.heoyou.getinline.domain;


import com.heoyou.getinline.constant.EventStatus;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Event {
    private Long id;

    private Long placeId;
    private String eventName;
    private EventStatus eventStatus;
    private LocalDateTime eventStartDatetime;
    private LocalDateTime eventEndDatetime;
    private Integer currentNumberOfPeople;
    private Integer capacity;
    private String memo;

    private LocalDateTime createAt;
    private LocalDateTime modifiedAt;
}
