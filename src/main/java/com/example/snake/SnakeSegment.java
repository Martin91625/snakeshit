package com.example.snake;

public class SnakeSegment extends Snake {

    private String type = "TAIL";
    private int[] segmentPosition = {0, 0};
    private String segmentDirection = "RIGHT";

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int[] getSegmentPosition() {
        return segmentPosition;
    }
    public void setSegmentPosition(int[] segmentPosition) {
        this.segmentPosition = segmentPosition;
    }
    public String getSegmentDirection() {
        return segmentDirection;
    }
    public void setSegmentDirection(String segmentDirection) {
        this.segmentDirection = segmentDirection;
    }
    

}