package com.dean.boardstudy.board.service;

import com.dean.boardstudy.board.dao.BoardDaoImpl;
import com.dean.boardstudy.board.vo.BoardVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("boardServiceImpl")
public class BoardServiceImpl implements BoardService {

    @Resource(name="boardDaoImpl")
    private BoardDaoImpl boardDao;

    public List<BoardVO> showAllBoardList() throws Exception {
        return boardDao.showAllBoardList();
    }
}
