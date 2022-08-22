package com.fastcampus.ch4.dao;

import com.fastcampus.ch4.domain.BoardDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

public class BoardDao {
    @Autowired
    SqlSession session;

    String namespace="com.fastcampus.ch4.dao.BoardMapper.";

    BoardDto select(int bno) throws Exception {
        return session.selectOne( namespace+"select",bno);
    }
}
