package com.bafila.models;

import java.util.List;

public class Board extends BaseModel{

    private int size;
    private List<Cell> cell;
    private List<Snake> snake; //not a good way(as violates srp) but for simplicity impl this way, use ase for displaying all snakes and ladders in board in UI
    private List<Ladder> ladder; //not a good way(as violates srp) but for simplicity impl this way .....
    //private HashMap<CellType, List<Cell>> specialCells; this is to fix srp above but not impl for ease of impl
}
