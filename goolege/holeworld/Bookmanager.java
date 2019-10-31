package com.classbook.chapter.six;

/**
 * @program: classprogram
 * @Description: 演示父类和子类的关系
 * @author: cxt
 * @date: 2019/10/21 3.19下午
 */
public class Book {
    private String bookId;
    private String bookName;
    protected int pages;

    public Book() {
    }

    public Book(String bookId, String bookName, int pages) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.pages = pages;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
