package com.uos.comp6239backend.mapper;

import com.uos.comp6239backend.tdata.entity.TChapter;
import com.uos.comp6239backend.tdata.entity.TContent;
import com.uos.comp6239backend.tdata.entity.TOption;
import com.uos.comp6239backend.tdata.entity.TUsers;
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
public interface TChapterContentMapper {
    List<TChapter> tChapterListByStoryId(Map<String, Object> values);
    List<TContent> tContentListByChapterId(Map<String, Object> values);
    List<TOption>  tOptionListByChapterId(Map<String, Object> values);
    List<TChapter>  tChapterByStoryIdAndChapterTitle(Map<String, Object> values);
}
