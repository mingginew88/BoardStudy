package com.dean.boardstudy.board.web;

import com.dean.boardstudy.board.service.BoardServiceImpl;
import com.dean.boardstudy.board.vo.BoardVO;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class BoardController {

    @Resource(name="boardServiceImpl")
    private BoardServiceImpl boardService;

    @RequestMapping(value = "/board/boardView")
    public String boardView(Model model) throws Exception {

        List<BoardVO> boardList = boardService.showAllBoardList();
        model.addAttribute("boardList", boardList);

        return "board/boardView";
    }




}
