package logic.unit;

public class MeleeUnit extends BaseUnit{

    public MeleeUnit(int startColumn, int startRow, boolean isWhite, String name){
        super(startColumn, startRow, isWhite, name);
        power = 2;
        hp = 5;
        isFlying = false;
    }
}
