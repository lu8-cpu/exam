package com.qfedu.examsys.dao;


import com.qfedu.examsys.pojo.Enroll;

import java.util.Date;
import java.util.List;


public interface EnrollDao {

    //向报名表中添加报名信息
    public int addEnrollInfo(Integer uid, Integer eid, Integer subjectid);

//    //根据报名时报名表中生成的id,展示本次考试的报名信息
//    public Enroll selectEnrollById(Integer id);

    //查询指定学生所有的考试信息
    public List<Enroll> findAllEnroll(Integer uid);

    //老师查看所有报名信息
    public List<Enroll> findAllEnrolls(Integer sid);

    //根据用户Id、学科Id、报名时间查询报名信息
    public List<Enroll> findEnrollsByUidAndSubjectIdAndCreatetime(Integer uid, Integer subjectId, Date createtime);

}
