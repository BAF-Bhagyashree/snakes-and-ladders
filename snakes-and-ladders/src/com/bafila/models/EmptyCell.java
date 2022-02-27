package com.bafila.models;

public class EmptyCell extends Cell {


    EmptyCell(CellType cellType) {
        super(cellType);//initialize the parent cell giving celltype
    }

    @Override
    public int nextLocation() {
        return this.getIndex();
    }
}
