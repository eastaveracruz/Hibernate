package com;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
//@Table(name = "books", schema = "lessons")
@SecondaryTables({@SecondaryTable(name = "price"), @SecondaryTable(name = "avalable")})
public class BooksEntity {
    @Id @GeneratedValue
    private int id;
    private String title;
    private Timestamp date;

    @Column(table = "price")
    private int cost;

    @Column(table = "avalable")
    private boolean avalable;

    public BooksEntity(String title, Timestamp date, int cost) {
        this.title = title;
        this.date = date;
        this.cost = cost;
    }

    public BooksEntity() {
    }


}
