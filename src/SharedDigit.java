public class SharedDigit {

    public static boolean hasSharedDigit(int x, int y){
        if(x <= 9 || x >= 100){
            return false;
        }
        if(y <= 9 || y >= 100){
            return false;
        }
        int modx2 = x % 10;
        int mody2 = y % 10;
        int mody = y / 10;
        int modx = x / 10;

        return (mody == modx || mody2 == modx2 || modx == mody2 || mody == modx2);
    }
}
