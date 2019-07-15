package com.dean.boardstudy.board.vo;

import java.io.Serializable;
import java.util.Date;

public class BoardVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private int boardNo;                /** board number */
    private String boardTitle;          /** board title  */
    private String boardWriter;         /** board writer */
    private String boardContents;       /** board contents */
    private Date boardWDate;            /** board write date */

    // constructor
    public BoardVO(int boardNo, String boardTitle, String boardWriter, String boardContents, Date boardWDate) {
        this.boardNo = boardNo;
        this.boardTitle = boardTitle;
        this.boardWriter = boardWriter;
        this.boardContents = boardContents;
        this.boardWDate = boardWDate;
    }

    public int getBoardNo() {
        return boardNo;
    }
    public void setBoardNo(int boardNo) {
        this.boardNo = boardNo;
    }
    public String getBoardTitle() {
        return boardTitle;
    }
    public void setBoardTitle(String boardTitle) {
        this.boardTitle = boardTitle;
    }
    public String getBoardWriter() {
        return boardWriter;
    }
    public void setBoardWriter(String boardWriter) {
        this.boardWriter = boardWriter;
    }
    public String getBoardContents() {
        return boardContents;
    }
    public void setBoardContents(String boardContents) {
        this.boardContents = boardContents;
    }
    public Date getBoardWDate() {
        return boardWDate;
    }
    public void setBoardWDate(Date boardWDate) {
        this.boardWDate = boardWDate;
    }
}
