package com.qfedu.examsys.dao;


import com.qfedu.examsys.pojo.Judge;
import com.qfedu.examsys.pojo.ShortAnswer;
import io.lettuce.core.dynamic.annotation.Param;

import java.util.List;

public interface ShortAnswerDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ShortAnswer record);

    int insertSelective(ShortAnswer record);

    ShortAnswer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShortAnswer record);

    int updateByPrimaryKey(ShortAnswer record);

    //根据subjectId 返回shortAnswer集合
    List<ShortAnswer> findShortAnswers(Integer subjectId);

    //批量导入简答题
    void insertManyShortAnswer(List<ShortAnswer> shortAnswers);

    // 查询所有简答题
    List<Judge> findAllShortAnswers(@Param("name") String name);

    // 根据id查询
    ShortAnswer QueryShortAnswerById(Integer id);
    //修改答案
    void updateShortAnswerAnswer(ShortAnswer shortAnswer);

    // 总题库
    List<ShortAnswer> findAnythingShortAnswer(@Param("name") String name);

    void updateShortAnswerRecentType(ShortAnswer shortAnswer);
    // 批量录入 修改
    void updateRecentTypeByIds(List<Integer> ids);
}