package com.bafila.models;

import java.util.List;

public abstract class Cell extends BaseModel {

    private int index;
    private CellType cellType; //whether normal cell(curindex->curindex) snakecell(curindex->next index) ladder(curIndex->nextIndex)
    private List<Piece> pieces; //pieces are present in a particular cell

    Cell(CellType cellType){
        this.cellType=cellType; //cell is of a particular cell type, way to take take of subclass
    }

    public abstract int nextLocation();

    public int getIndex() {
        return index;
    }

    /*public void setIndex(int index) {
        this.index = index;
    }*/

    public CellType getCellType() {
        return cellType;
    }

    public void setCellType(CellType cellType) {
        this.cellType = cellType;
    }

    public List<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(List<Piece> pieces) {
        this.pieces = pieces;
    }
}
