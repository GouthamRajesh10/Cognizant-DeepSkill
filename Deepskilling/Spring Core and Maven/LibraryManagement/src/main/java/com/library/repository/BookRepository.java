package com.library.repository;

public class BookRepository{
    public String findBookyById(int id)
    {
        return "Book #"+id+": The Spring Framework Handbook";
    }
}