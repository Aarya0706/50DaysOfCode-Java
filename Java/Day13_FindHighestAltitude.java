class Solution {
    public int largestAltitude(int[] gain) {

        int altitude = 0;
        int max = 0;

        for(int g : gain){
            altitude += g;
            if(altitude > max)
                max = altitude;
        }

        return max;
    }
}
