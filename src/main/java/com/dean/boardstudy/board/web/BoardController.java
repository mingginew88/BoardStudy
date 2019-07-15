package com.dean.boardstudy.board.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {

    @RequestMapping(value = "/board/boardView")
    public String boardView(){




        return "board/boardView";
    }




}
