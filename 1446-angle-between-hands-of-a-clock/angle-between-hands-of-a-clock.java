class Solution {
    public double angleClock(int hour, int minutes) {
        double hangle=30*hour+0.5*minutes;
        double mangle=6*minutes;
        double diff=Math.abs(hangle-mangle);
        diff=Math.min(diff,Math.abs(360-diff));
        return diff;

    }
}