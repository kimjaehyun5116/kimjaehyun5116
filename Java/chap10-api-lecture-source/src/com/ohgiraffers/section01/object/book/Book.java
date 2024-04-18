package com.ohgiraffers.section01.object.book;

public class Book {
    private int num;
    private String title;
    private String author;
    private int price;

    public Book() {
    }

    public Book(int num, java.lang.String title, java.lang.String author, int price) {
        this.num = num;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public java.lang.String getTitle() {
        return title;
    }

    public void setTitle(java.lang.String title) {
        this.title = title;
    }

    public java.lang.String getAuthor() {
        return author;
    }

    public void setAuthor(java.lang.String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Book{" +
                "num=" + num +
                ", title=" + title +
                ", author=" + author +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        Book other = (Book) obj;

        if (this.num != other.num){
            return false;
        }
        if (this.author == null) {

            if (other.author != null) {

                return false;
            }

        } else if(!this.author.equals(other.author)){

            return false;
        }

        if(this.price != other.price){

            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {

        int result = 1;

        final int PRIME = 31;

        result = PRIME * result + this.num;

        result = PRIME * result + this.title.hashCode();
        result = PRIME * result + this.author.hashCode();
        result = PRIME * result + this.price;

        return result;
    }
}


