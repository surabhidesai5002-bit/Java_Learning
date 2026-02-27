package Strings.StringBufferBuuilder;

public class BuilderBufferPerformance {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuffer sbs = new StringBuffer("placements");
        for(int i =0 ; i < 100000000; i++){
            sbs.append("Training");
        }
        System.out.println("Time taken by String Buffer : " + (System.currentTimeMillis() - startTime) + "ms");

        startTime = System.currentTimeMillis();
        StringBuilder sbl = new StringBuilder("Placement");
        for(int i =0 ; i < 100000000; i++){
            sbl.append("Training");
        }
        System.out.println("Time taken by String Builder : " + (System.currentTimeMillis() - startTime) + "ms");

    }
}
