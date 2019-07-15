package com.dean.boardstudy.board.service;

import com.dean.boardstudy.board.vo.BoardVO;

import java.util.List;

public interface BoardService {


    List<BoardVO> showAllBoardList() throws Exception;

}
