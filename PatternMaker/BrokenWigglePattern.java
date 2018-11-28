package PatternMaker;

public class BrokenWigglePattern extends Pattern {

    boolean needleJam = (Math.random() < 0.40d);

    @Override
    public void pattern(){
        if(!needleJam){
            for(int i = 0; i < 5; i++){
                System.out.print(x + X); }
        } else {
            for(int i = 0; i < 3; i++){
                System.out.print(x + X); }
        }
    }


}
