package com.bigxodus.domains;

import lombok.Data;

@Data
public class Quest {
    private Long questId;
    private Double latitude;
    private Double longitude;
    private String title;
    private String description;
}
