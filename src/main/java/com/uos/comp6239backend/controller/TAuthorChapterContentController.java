package com.uos.comp6239backend.controller;

import com.uos.comp6239backend.service.TAuthorChapterContentService;
import com.uos.comp6239backend.service.TChapterContentService;
import com.uos.comp6239backend.utils.ResponseMap;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @title: TChapterContentController
 * @Author Hym
 * @Date: 2024-05-01 18:40
 * @Description:
 * @Version 1.0
 */
@RestController
@RequestMapping("/TAuthorChapterContentCtrl")
@Api(value = "章节和内容查询管理", tags = "Chapter and Content Management")
public class TAuthorChapterContentController {
    @Autowired
    private TAuthorChapterContentService tAuthorChapterContentService;

    /**
     *根据故事ID显示该故事下的所有信息
     * @param values
     * @return
     */
    @PostMapping("/tRootAuthorStoryByStoryId")
    @ApiOperation(value = "根据故事ID显示该故事下的所有信息", notes = "根据故事ID显示该故事下的所有信息")
    public ResponseMap.ResultData tRootAuthorStoryByStoryId(@RequestBody Map<String,Object> values, HttpServletRequest request){
        return tAuthorChapterContentService.tRootAuthorStoryByStoryId(values);
    }


    /**
     *根据故事ID显示本故事的基本信息
     * @param values
     * @return
     */
    @PostMapping("/tAuthorStoryByStoryId")
    @ApiOperation(value = "根据故事ID显示本故事的基本信息", notes = "根据故事ID显示本故事的基本信息")
    public ResponseMap.ResultData tAuthorStoryByStoryId(@RequestBody Map<String,Object> values, HttpServletRequest request){
        return tAuthorChapterContentService.tAuthorStoryByStoryId(values);
    }

    /**
     *根据章节ID显示本章节的基本信息
     * @param values
     * @return
     */
    @PostMapping("/tAuthorChapterByChapterId")
    @ApiOperation(value = "根据章节ID显示本章节的基本信息", notes = "根据章节ID显示本章节的基本信息")
    public ResponseMap.ResultData tAuthorChapterByChapterId(@RequestBody Map<String,Object> values, HttpServletRequest request){
        return tAuthorChapterContentService.tAuthorChapterByChapterId(values);
    }


    /**
     *根据故事ID显示本故事的所有章节
     * @param values
     * @return
     */
    @PostMapping("/tAuthorChapterListByStoryId")
    @ApiOperation(value = "根据故事ID显示本故事的所有章节", notes = "根据故事ID显示本故事的所有章节")
    public ResponseMap.ResultData tAuthorChapterListByStoryId(@RequestBody Map<String,Object> values, HttpServletRequest request){
        return tAuthorChapterContentService.tAuthorChapterListByStoryId(values);
    }

    /**
     *根据作者名模糊查询其所喜欢的作者
     * @param values
     * @return
     */
    @PostMapping("/tAuthorContentListByChapterId")
    @ApiOperation(value = "根据章节ID显示本章节的所有内容", notes = "根据章节ID显示本章节的所有内容")
    public ResponseMap.ResultData tAuthorContentListByChapterId(@RequestBody Map<String,Object> values, HttpServletRequest request){
        return tAuthorChapterContentService.tAuthorContentListByChapterId(values);
    }

    /**
     *添加喜欢的作者
     * @param values
     * @return
     */
    @PostMapping("/tAuthorOptionListByChapterId")
    @ApiOperation(value = "根据章节ID显示本章节的所有选项", notes = "根据章节ID显示本章节的所有选项")
    public ResponseMap.ResultData tAuthorOptionListByChapterId(@RequestBody Map<String,Object> values, HttpServletRequest request){
        return tAuthorChapterContentService.tAuthorOptionListByChapterId(values);
    }

    /**
     *根据读者ID和作者ID删除某项喜欢的作者
     * @param values
     * @return
     */
    @PostMapping("/tAuthorChapterByStoryIdAndChapterTitle")
    @ApiOperation(value = "根据故事ID和章节名模糊查询章节", notes = "根据故事ID和章节名模糊查询章节")
    public ResponseMap.ResultData tAuthorChapterByStoryIdAndChapterTitle(@RequestBody Map<String,Object> values, HttpServletRequest request){
        return tAuthorChapterContentService.tAuthorChapterByStoryIdAndChapterTitle(values);
    }
}
