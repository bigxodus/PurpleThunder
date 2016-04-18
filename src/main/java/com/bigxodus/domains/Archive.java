package com.bigxodus.domains;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author: Lawrence
 * @since: 2016. 4. 13.
 * @note:
 */

@Data
@Entity
@Table(name="tb_archive")
public class Archive implements Serializable{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="archive_id", nullable=false)
    private Long archive_id;

    @Column(name="quest_id", nullable=false)
    private Long quest_id;

    @Column(name="user_id", nullable=false)
    private Long user_id;

    @Column(name="start_tm", nullable=true)
    private LocalDateTime start_tm;

    @Column(name="end_tm", nullable=true)
    private LocalDateTime end_tm;

    @Column(name="content", nullable=true)
    private String content;

    @Column(name="reg_tm", nullable=true)
    private LocalDateTime reg_tm;

    @Column(name="edit_tm", nullable=true)
    private LocalDateTime edit_tm;

}
