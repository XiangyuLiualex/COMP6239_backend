package com.uos.comp6239backend.mapper;

import com.uos.comp6239backend.tdata.entity.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @title: TChapterContentMapper
 * @Author Hym
 * @Date: 2024-05-01 18:29
 * @Description:
 * @Version 1.0
 */
@Mapper
@Repository
public interface TAuthorChapterContentMapper {
    List<Integer> tAuthorStorysByAuthorId(Map<String, Object> values);
    TAuthorStorys tAuthorStoryByStoryId(Map<String, Object> values);
    TAuthorChapter tAuthorChapterByChapterId(Map<String, Object> values);
    List<TAuthorChapter> tAuthorChapterListByStoryId(Map<String, Object> values);
    List<TContent> tAuthorContentListByChapterId(Map<String, Object> values);
    List<TOption>  tAuthorOptionListByChapterId(Map<String, Object> values);
    List<TAuthorChapter>  tAuthorChapterByStoryIdAndChapterTitle(Map<String, Object> values);
}
