package com.example.serviceedu.entity.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class SubSectionVo implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String title;
    private Boolean free;
    private String videoOriginalName;
    private String videoSourceId;
}
