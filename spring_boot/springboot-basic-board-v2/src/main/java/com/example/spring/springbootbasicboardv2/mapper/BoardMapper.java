package com.example.spring.springbootbasicboardv2.mapper;

import com.example.spring.springbootbasicboardv2.model.Board;
import com.example.spring.springbootbasicboardv2.model.Paging;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    List<Board> selectBoardList(Paging page);
    int countBoards();
    Board selectBoardDetail(long id);
    void saveArticle(Board board);
    void deleteBoardById(long id);
    void updateArticle(Board build);
}
