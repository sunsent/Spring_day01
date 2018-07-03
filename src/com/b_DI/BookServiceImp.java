package com.b_DI;

public class BookServiceImp implements BookService {
    private BookDao bookDao;
    public void setBookDao(BookDao bookDao){
        this.bookDao=bookDao;
    }
    @Override
    public void addBook(){
        this.bookDao.addboook();
    }
}
