package com.uos.comp6239backend.service.impl;

import com.uos.comp6239backend.mapper.TAuthorChapterContentMapper;
import com.uos.comp6239backend.mapper.TChapterContentMapper;
import com.uos.comp6239backend.service.TAuthorChapterContentService;
import com.uos.comp6239backend.service.TChapterContentService;
import com.uos.comp6239backend.tdata.entity.*;
import com.uos.comp6239backend.utils.ResponseMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @title: TChapterContentServiceImpl
 * @Author Hym
 * @Date: 2024-05-01 18:32
 * @Description:
 * @Version 1.0
 */
@Service
public class TAuthorChapterContentServiceImpl implements TAuthorChapterContentService {
    private final static Logger log = LoggerFactory.getLogger(TAuthorChapterContentServiceImpl.class);

    @Autowired
    private TAuthorChapterContentMapper tAuthorChapterContentMapper;

    @Override
    public ResponseMap.ResultData tRootAuthorStoryByStoryId(Map<String, Object> values) {
        TAuthorStorys tAuthorStorys = tAuthorChapterContentMapper.tAuthorStoryByStoryId(values);
        List<TAuthorChapter> tAuthorChapterList = tAuthorChapterContentMapper.tAuthorChapterListByStoryId(values);
        for (TAuthorChapter item : tAuthorChapterList){
//            HashMap <String,Integer> parm = Map("",)
//            tAuthorChapterContentMapper.tAuthorContentListByChapterId(Map("chapterId",item.getChapterId()));
        }


        log.info("根据故事ID显示本故事的基本信息:"+values);
        return ResponseMap.ok(tAuthorStorys);
    }



//    根据故事ID显示本故事的基本信息
    @Override
    public ResponseMap.ResultData tAuthorStoryByStoryId(Map<String, Object> values) {
        TAuthorStorys tAuthorStorys = tAuthorChapterContentMapper.tAuthorStoryByStoryId(values);
        log.info("根据故事ID显示本故事的基本信息:"+values);
        return ResponseMap.ok(tAuthorStorys);
    }

//    根据章节ID显示本章节的基本信息
    @Override
    public ResponseMap.ResultData tAuthorChapterByChapterId(Map<String, Object> values) {
        TAuthorChapter tAuthorChapter = tAuthorChapterContentMapper.tAuthorChapterByChapterId(values);
        log.info("根据章节ID显示本章节的基本信息:"+values);
        return ResponseMap.ok(tAuthorChapter);
    }

    //    根据故事ID显示本故事的所有章节
    @Override
    public ResponseMap.ResultData tAuthorChapterListByStoryId(Map<String, Object> values) {
        List<TAuthorChapter> tAuthorChapterList = tAuthorChapterContentMapper.tAuthorChapterListByStoryId(values);
        log.info("根据故事ID显示本故事的所有章节:"+values);
        return ResponseMap.ok(tAuthorChapterList);
    }

//    根据章节ID显示本章节的所有内容
    @Override
    public ResponseMap.ResultData tAuthorContentListByChapterId(Map<String, Object> values) {
        List<TContent> tContentList = tAuthorChapterContentMapper.tAuthorContentListByChapterId(values);
        log.info("根据章节ID显示本章节的所有内容:"+values);
        return ResponseMap.ok(tContentList);
    }

//    根据章节ID显示本章节的所有选项
    @Override
    public ResponseMap.ResultData tAuthorOptionListByChapterId(Map<String, Object> values) {
        List<TOption> tOptionList = tAuthorChapterContentMapper.tAuthorOptionListByChapterId(values);
        log.info("根据章节ID显示本章节的所有选项:"+values);
        return ResponseMap.ok(tOptionList);
    }

//    根据故事ID和章节名模糊查询章节
    @Override
    public ResponseMap.ResultData tAuthorChapterByStoryIdAndChapterTitle(Map<String, Object> values) {
        List<TAuthorChapter> tAuthorChapterList = tAuthorChapterContentMapper.tAuthorChapterByStoryIdAndChapterTitle(values);
        log.info("根据故事ID和章节名模糊查询章节:"+values);
        return ResponseMap.ok(tAuthorChapterList);
    }
}
