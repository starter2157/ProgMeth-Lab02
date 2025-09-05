package logic.unit;

import java.util.ArrayList;

public class BaseUnit {
    private int row, column;
    int power = 1, hp = 2;
    private boolean isWhite;
    boolean isFlying = false;
    private String name;

    public BaseUnit(int startColumn, int startRow, boolean isWhite, String name){
        setColumn(startColumn);
        setRow(startRow);
        setWhite(isWhite);
        setName(name);
    }

    public boolean move(int direction){
        switch (direction){
            case (0) :
                if(getRow()+1<=4){
                    this.setRow(this.getRow()+1);
                    return true;
                }
                break;
            case (1) :
                if(getColumn()+1<=4){
                    this.setColumn(this.getColumn()+1);
                    return true;
                }
                break;
            case (2) :
                if(getRow()-1>=0){
                    this.setRow(this.getRow()-1);
                    return true;
                }
                break;
            case (3) :
                if(getColumn()-1>=0){
                    this.setColumn(this.getColumn()-1);
                    return true;
                }
                break;
            default :
                return false;
        }
        return false;
    }

    public void attack(ArrayList<BaseUnit> targetPieces){
        for (int i = 0; i < targetPieces.size(); i++) {
            if(!targetPieces.get(i).isFlying() && targetPieces.get(i).getRow() == this.getRow() && targetPieces.get(i).getColumn() == this.getColumn()) {
                System.out.println(this.getName() + " attacks " + targetPieces.get(i).getName());
                targetPieces.get(i).setHp(targetPieces.get(i).getHp()-this.power);
            }
        }
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        if (row<0){
            this.row = 0;
        } else if (row>4){
            this.row = 4;
        } else {
            this.row = row;
        }
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        if (column<0){
            this.column = 0;
        } else if (column>4){
            this.column = 4;
        } else {
            this.column = column;
        }
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp<0){
            this.hp = 0;
        } else {
            this.hp = hp;
        }
    }

    public int getPower() {
        return power;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public void setWhite(boolean white) {
        isWhite = white;
    }

    public boolean isFlying() {
        return isFlying;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
