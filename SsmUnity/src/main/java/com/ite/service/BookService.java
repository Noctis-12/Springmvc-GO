package com.ite.service;

import com.ite.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 23187
 * @date 2022/7/4 12:18
 */
@Transactional
public interface BookService {

    /**
     * 保存
     * @param book
     * @return
     */
    public boolean save(Book book);

    /**
     * 修改
     * @param book
     * @return
     */
    public boolean update(Book book);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    public boolean delete(Integer id);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    public Book getById(Integer id);

    /**
     * 查询所有
     * @return
     */
    public List<Book> getAll();
}
