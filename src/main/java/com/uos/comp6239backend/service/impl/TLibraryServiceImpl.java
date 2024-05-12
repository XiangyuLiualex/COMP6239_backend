package com.uos.comp6239backend.service.impl;

import com.uos.comp6239backend.mapper.TLibraryMapper;
import com.uos.comp6239backend.mapper.TUsersMapper;
import com.uos.comp6239backend.service.TLibraryService;
import com.uos.comp6239backend.tdata.entity.TStorys;
import com.uos.comp6239backend.tdata.entity.TStorysForUiState;
import com.uos.comp6239backend.utils.ResponseMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @title: TLibraryServiceImpl
 * @Author Hym
 * @Date: 2024-04-29 10:35
 * @Description:
 * @Version 1.0
 */
@Service
public class TLibraryServiceImpl implements TLibraryService {
    private final static Logger log = LoggerFactory.getLogger(TLibraryServiceImpl.class);

    @Autowired
    private TLibraryMapper tLibraryMapper;

//    根据读者ID和剧本ID和剧本作者ID展示剧本作者，阅读进度
    @Override
    public ResponseMap.ResultData tLibraryListReaderStoryForUiState(Map<String, Object> values) {
        List<TStorysForUiState> tStorysForUiStates = tLibraryMapper.tLibraryListReaderStoryForUiState(values);
        log.info("根据读者ID和剧本ID和剧本作者ID展示剧本作者，阅读进度:"+values);
        return ResponseMap.ok(tStorysForUiStates);
    }

    //    根据读者ID展示图书馆
    @Override
    public ResponseMap.ResultData tLibraryList(Map<String, Object> values) {
        List<TStorys> tStorysList = tLibraryMapper.tLibraryList(values);
        log.info("根据读者ID展示图书馆:"+values);
        return ResponseMap.ok(tStorysList);
    }

//    收藏某个剧本
    @Override
    @Transactional//添加事务
    public ResponseMap.ResultData tLibraryInsert(Map<String, Object> values) {
        tLibraryMapper.tLibraryInsert(values);
        log.info("收藏某个剧本:"+values);
        return ResponseMap.ok();
    }

//    取消收藏某个剧本
    @Override
    public ResponseMap.ResultData tLibraryDel(Map<String, Object> values) {
        tLibraryMapper.tLibraryDel(values);
        log.info("取消收藏某个剧本:"+values);
        return ResponseMap.ok();
    }
}
