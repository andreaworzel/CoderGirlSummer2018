package PatternMaker;

public class Pattern {
    protected SmallCrossStitch xStitch = new SmallCrossStitch();
    protected LargeCrossStitch XStitch = new LargeCrossStitch();
    protected ZigZagStitch zigZagStitch = new ZigZagStitch();
    protected FillStitch fill = new FillStitch();
    protected ShortLineStitch shortStitch = new ShortLineStitch();
    protected CircleStitch oStitch = new CircleStitch();
    protected BlockStitch bracket = new BlockStitch();
    protected String b = bracket.sew();

    protected String x = xStitch.sew();
    protected String X = XStitch.sew();
    protected String z = zigZagStitch.sew();
    protected String f = fill.sew();
    protected String s = shortStitch.sew();
    protected String o = oStitch.sew();

    public void pattern(){

    }
}
