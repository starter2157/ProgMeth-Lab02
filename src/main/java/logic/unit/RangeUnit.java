package logic.unit;

import java.util.ArrayList;

public class RangeUnit extends BaseUnit{

    public RangeUnit(int startColumn, int startRow, boolean isWhite, String name){
        super(startColumn, startRow, isWhite, name);
        power = 1;
        hp = 2;
        isFlying = false;
    }

    @Override
    public void attack(ArrayList<BaseUnit> targetPieces){
        for (int i = 0; i < targetPieces.size(); i++) {
            if(this.isWhite() && targetPieces.get(i).getRow() == this.getRow()+1 && targetPieces.get(i).getColumn() == this.getColumn()) {
                System.out.println(this.getName() + " attacks " + targetPieces.get(i).getName());
                targetPieces.get(i).setHp(targetPieces.get(i).getHp()-this.getPower());
            } else if (!this.isWhite() && targetPieces.get(i).getRow() == this.getRow()-1 && targetPieces.get(i).getColumn() == this.getColumn()) {
                System.out.println(this.getName() + " attacks " + targetPieces.get(i).getName());
                targetPieces.get(i).setHp(targetPieces.get(i).getHp()-this.getPower());
            }
        }
    }
}
