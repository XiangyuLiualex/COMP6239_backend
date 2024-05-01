package com.uos.comp6239backend.tdata.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @title: TOption
 * @Author Hym
 * @Date: 2024-05-01 18:18
 * @Description:
 * @Version 1.0
 */
@Data
@ApiModel(description = "选项实体")
@Getter
@Setter
@ToString
public class TOption  implements Serializable {
    private static final long serialVersionUID = 239859184047767915L;

    /**
     * 选项ID
     */
    @ApiModelProperty(value = "选项ID")
    private Integer optionId;

    /**
     * 选项名
     */
    @ApiModelProperty(value = "选项名")
    private String optionName;

    /**
     * 所属章节ID
     */
    @ApiModelProperty(value = "所属章节ID")
    private Integer chapterId;

    /**
     * 选项描述（可选）
     */
    @ApiModelProperty(value = "选项描述（可选）")
    private String optionDescription;

    /**
     * 下一章节ID
     */
    @ApiModelProperty(value = "下一章节ID")
    private Integer nextChapterId;

    /**
     * 是否使用
     */
    @ApiModelProperty(value = "是否使用")
    private Integer isUsed;

    /**
     * 顺序
     */
    @ApiModelProperty(value = "顺序")
    private Integer order;
}
