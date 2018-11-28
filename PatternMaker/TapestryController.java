package PatternMaker;
import java.util.ArrayList;

public class TapestryController {
    private static ArrayList<Pattern> allPatterns = new ArrayList();

    public void add(Pattern p){
        allPatterns.add(p);
    }

    public static void printPatterns(int width, int height) {
        for(int i = 0; i < allPatterns.size(); i++){
            Pattern index = allPatterns.get(i);
            for(int j = 0; j < height; j++){
                index.pattern();
                for(int k = 0; k < width; k ++){
                    index.pattern();
                }
                System.out.println();
            }
        }

    }
    public static void main(String[] args){
        CrossStichWigglePattern xX = new CrossStichWigglePattern();
        allPatterns.add(xX);
        ZigZagLinesPattern zz = new ZigZagLinesPattern();
        allPatterns.add(zz);
        BaublePattern bb = new BaublePattern();
        allPatterns.add(bb);
        BlockyBaublePattern bbp = new BlockyBaublePattern();
        allPatterns.add(bbp);
        BrokenWigglePattern bw = new BrokenWigglePattern();
        allPatterns.add(bw);

        printPatterns(8, 3);
        System.out.println("\n\n");
        printPatterns(6, 8);


    }
}
