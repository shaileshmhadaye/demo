package com.example.demo.abstractClassEx;

class MyBook extends Book {
    int price;

    /**
     *   Class Constructor
     *
     *   @param title The book's title.
     *   @param author The book's author.
     *   @param price The book's price.
     **/
    // Write your constructor here
    MyBook(String title, String author, int price){
        super(title, author);
        this.price = price;
    }

    @Override
    void display() {
        System.out.println("Title: "+title+"\nAuthor: "+author+"\nPrice: "+price);
    }
    /**
     *   Method Name: display
     *
     *   Print the title, author, and price in the specified format.
     **/
    // Write your method here
}
// End class
