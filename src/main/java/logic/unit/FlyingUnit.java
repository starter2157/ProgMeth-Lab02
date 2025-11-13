package logic.unit;

public class FlyingUnit extends BaseUnit{

    public FlyingUnit(int startColumn, int startRow, boolean isWhite, String name){
        super(startColumn, startRow, isWhite, name);
        this.power = 1;
        this.hp = 2;
        this.isFlying = true;
    }

    @Override
    public boolean move(int direction){
        switch (direction){
            case (0) :
                if(getRow()+2<=4){
                    this.setRow(this.getRow()+2);
                    return true;
                }
                break;
            case (1) :
                if(getColumn()+2<=4){
                    this.setColumn(this.getColumn()+2);
                    return true;
                }
                break;
            case (2) :
                if(getRow()-2>=0){
                    this.setRow(this.getRow()-2);
                    return true;
                }
                break;
            case (3) :
                if(getColumn()-2>=0){
                    this.setColumn(this.getColumn()-2);
                    return true;
                }
                break;
            default :
                return false;
        }
        return false;
    }
}