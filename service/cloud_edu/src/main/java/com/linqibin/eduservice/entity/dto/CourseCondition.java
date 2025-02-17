package com.linqibin.eduservice.entity.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@ApiModel(value = "Course查询对象", description = "课程查询对象封装")
@Accessors(chain = true)
public class CourseCondition implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "课程名称")
    private String title;

    @ApiModelProperty(value = "讲师id")
    private String teacherId;

    @ApiModelProperty(value = "一级类别")
    private String subjectParentId;

    @ApiModelProperty(value = "二级类别")
    private String subjectId;
}
