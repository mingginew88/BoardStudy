package com.dean.boardstudy.board.dao;

import com.dean.boardstudy.board.vo.BoardVO;

import java.util.List;

public interface BoardDao {

    List<BoardVO> showAllBoardList() throws Exception;
}
