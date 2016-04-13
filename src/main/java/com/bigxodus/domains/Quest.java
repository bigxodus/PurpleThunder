package com.bigxodus.domains;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;


@Data
@Entity
@Table(name = "tb_quest")
public class Quest implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "questId", nullable = false)
    private Long questId;

    @Column(name = "latitude", nullable = true)
    private Double latitude;

    @Column(name = "longitude", nullable = true)
    private Double longitude;

    @Column(name = "title", nullable = true)
    private String title;

    @Column(name = "description", nullable = true)
    private String description;

    @Column(name = "regTm", nullable = true)
    private LocalDateTime regTm;

    @Column(name = "editTm", nullable = true)
    private LocalDateTime editTm;
}
