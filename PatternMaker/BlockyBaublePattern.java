package PatternMaker;

public class BlockyBaublePattern extends Pattern {
    boolean needleJam = (Math.random() < 0.10d);

    public void pattern(){
        if(!needleJam){
            for(int i = 0; i < 3; i++){
                System.out.print(b + s + s + o + s + s);
            }
        } else {
            for(int i = 0; i < 2; i++){
                System.out.print(b + s + s + o + s + s);
            }
        }
    }
}
