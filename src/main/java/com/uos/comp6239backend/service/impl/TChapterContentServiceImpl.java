package com.uos.comp6239backend.service.impl;

import com.uos.comp6239backend.mapper.TChapterContentMapper;
import com.uos.comp6239backend.service.TChapterContentService;
import com.uos.comp6239backend.tdata.entity.TChapter;
import com.uos.comp6239backend.tdata.entity.TContent;
import com.uos.comp6239backend.tdata.entity.TOption;
import com.uos.comp6239backend.utils.ResponseMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
public class TChapterContentServiceImpl implements TChapterContentService {
    private final static Logger log = LoggerFactory.getLogger(TChapterContentServiceImpl.class);

    @Autowired
    private TChapterContentMapper tChapterContentMapper;


    @Override
    public ResponseMap.ResultData tChapterListByStoryId(Map<String, Object> values) {
        List<TChapter> tChapterList = tChapterContentMapper.tChapterListByStoryId(values);
        return ResponseMap.ok(tChapterList);
    }

    @Override
    public ResponseMap.ResultData tContentListByChapterId(Map<String, Object> values) {
        List<TContent> tContentList = tChapterContentMapper.tContentListByChapterId(values);
        return ResponseMap.ok(tContentList);
    }

    @Override
    public ResponseMap.ResultData tOptionListByChapterId(Map<String, Object> values) {
        List<TOption> tOptionList = tChapterContentMapper.tOptionListByChapterId(values);
        return ResponseMap.ok(tOptionList);
    }

    @Override
    public ResponseMap.ResultData tChapterByStoryIdAndChapterTitle(Map<String, Object> values) {
        List<TChapter> tChapterList = tChapterContentMapper.tChapterByStoryIdAndChapterTitle(values);
        return ResponseMap.ok(tChapterList);
    }
}
