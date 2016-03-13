package com.bigxodus.domains;

import lombok.Data;

@Data
public class Quest {
    private Long questId;
    private Long latitude;
    private Long longitude;
    private String title;
    private String description;
}
