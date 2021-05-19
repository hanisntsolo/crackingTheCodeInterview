package dhirendra.april27;

class FarthestBuildingYouCanReach {
    public static int furthestBuilding(int[] heights, int bricks, int ladders) {
        int finalLadder = 0;
        for(int i=0;i<heights.length-1;i++) {
            if(heights[i]>heights[i+1])
                continue;
            else if((heights[i]<heights[i+1])) {
                int bricksNeeded = heights[i+1] - heights[i];
                if(bricks >= bricksNeeded) {
                    bricks -= bricksNeeded;
                    continue;
                }
                else if(bricks < bricksNeeded && ladders!=0)
                    ladders--;
            }
            else {
                finalLadder = i;
                break;
            }
        }
        return finalLadder;
    }

    public static void main(String[] args) {
        int[] height = {14,3,19,3};
        int result = furthestBuilding(height,17,0);
        System.out.println(result);
    }
}
