package com.uos.comp6239backend.tdata.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @title: TStorysForUiState
 * @Author Hym
 * @Date: 2024-05-12 5:04
 * @Description:
 * @Version 1.0
 */
@Data
@ApiModel(description = "剧本实体剩下的属性")
@Getter
@Setter
@ToString
public class TStorysForUiState {
    /**
     * 剧本ID
     */
    @ApiModelProperty(value = "剧本ID")
    private Integer storyId;
    /**
     * 剧本名
     */
    @ApiModelProperty(value = "剧本名")
    private String storyName;
    /**
     * 剧本简介
     *
     */
    @ApiModelProperty(value = "剧本简介")
    private String storyDescription;
    /**
     * 剧本热度
     */
    @ApiModelProperty(value = "剧本热度")
    private Integer storyTrends;
    /**
     * 剧本封面
     */
    @ApiModelProperty(value = "剧本封面")
    private String storyCoverUrl;

    /**
     * 剧本作者ID
     */
    @ApiModelProperty(value = "剧本作者ID")
    private Integer authorId;

    //以上是新加的

    /**
     * 剧本作者
     */
    @ApiModelProperty(value = "剧本作者")
    private String username;

    /**
     * 剧本阅读进度
     */
    @ApiModelProperty(value = "剧本阅读进度")
    private Integer currentProgress;
    /**
     * 剧本当前被阅读到那个章节
     */
//    @ApiModelProperty(value = "剧本当前被阅读到那个章节")
//    private String currentChapterName;


}
