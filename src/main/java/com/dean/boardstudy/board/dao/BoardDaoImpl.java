package com.dean.boardstudy.board.dao;

import com.dean.boardstudy.board.vo.BoardVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository("boardDaoImpl")
public class BoardDaoImpl implements BoardDao {

    @Resource(name="sqlSessionTemplate")
    private SqlSessionTemplate template;

    public List<BoardVO> showAllBoardList() throws Exception {
        List<BoardVO> boardList = template.selectList("board.showAllBoardList");
        return boardList;
    }
}
