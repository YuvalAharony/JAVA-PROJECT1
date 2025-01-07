package Project2;

public class Villa extends Residential{
    private int levels=1;

    //costractor
    public Villa(String adress, double area, double price, int parkingSlot, int levels) {
        super(adress, area, price, parkingSlot);
        try {
            setLevels(levels);
        } catch (IllegalArgumentException e) {
            System.out.println("levels needs to be at least 1");
        }
    }

    //getters and setters
    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        if (levels > 0) {
            this.levels =levels;
        }else{
            throw new IllegalArgumentException("levels needs to be at least 1");
        }
    }

    //methods
    @Override
    public String toString() {
        return "Villa{" +
                "levels=" + levels +
                '}'+super.toString();
    }
}
