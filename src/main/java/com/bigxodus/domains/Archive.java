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
    private Long archiveId;

    @Column(name="quest_id", nullable=false)
    private Long questId;

    @Column(name="user_id", nullable=false)
    private Long userId;

    @Column(name="start_tm", nullable=true)
    private LocalDateTime startTm;

    @Column(name="end_tm", nullable=true)
    private LocalDateTime endTm;

    @Column(name="content", nullable=true)
    private String content;

    @Column(name="reg_tm", nullable=true)
    private LocalDateTime regTm;

    @Column(name="edit_tm", nullable=true)
    private LocalDateTime editTm;

}
