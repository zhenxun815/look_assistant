package com.yiheng.look_assistant.db.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Yiheng
 * @since 2021/3/12 上午12:31
 */
@Slf4j
@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createTime", "updateTime"}, allowGetters = true, ignoreUnknown = true)
public class BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
    //@GeneratedValue(generator = "jpa-uuid")
    @JsonInclude
    protected String id;

    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    //@JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    protected Date createTime;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    //@JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    protected Date updateTime;

    @Column
    @JsonIgnore
    protected Integer delFlag;
}
