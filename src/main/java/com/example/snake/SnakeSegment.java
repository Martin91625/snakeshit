package com.example.snake;

public class SnakeSegment extends Snake {

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