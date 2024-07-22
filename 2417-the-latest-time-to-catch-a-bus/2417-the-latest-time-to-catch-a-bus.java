class Solution {
    public int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {
        Arrays.sort(buses);
        Arrays.sort(passengers);
        int capFilled = 0;
        int pi=0;
        for(int bi=0; bi<buses.length; bi++) {
            capFilled = 0;
            while(capFilled < capacity && pi<passengers.length && passengers[pi] <= buses[bi]) {
                capFilled++;
                pi++;
            }
        }
        pi--;
        if(capFilled < capacity && (pi<0 || buses[buses.length-1] > passengers[pi])) {
            return buses[buses.length-1];
        }
        while(pi>0 && passengers[pi]-1 == passengers[pi-1]) {
            pi--;
        }
        return passengers[pi]-1;
    }
}
