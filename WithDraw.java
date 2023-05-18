public class WithDraw {
    public float WithDraw_1(int balance , int amountOfWithDraw){
        if (balance<amountOfWithDraw){
            return -1;
        }
        else if (balance>amountOfWithDraw) {
            return balance-amountOfWithDraw;
        }
        else if (balance==amountOfWithDraw) {
            return 0;
        }
        return -1;
    }
    public boolean WithDraw_2(int balance , int amountOfWithDraw) {
        if (balance < amountOfWithDraw) {
            return false;
        } else if (balance > amountOfWithDraw) {
            return true;
        } else if (balance == amountOfWithDraw) {
            return true;
        }
        return false;
    }
}
