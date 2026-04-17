package com.example.snake;

import java.util.ArrayList;

public class SnakeSegment extends Snake {
    
    private ArrayList<int[]> positions = new ArrayList<>();

    public SnakeSegment() {
        if (getLength() > 2) {
            initSnakeBody();            
        }
        initSnakeTail();

    }

    private void initSnakeBody(){

    }

    private void initSnakeTail(){
        if (getLength() < 2) {
            
        }
    }
}