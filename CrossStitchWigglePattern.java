public class CrossStitchWigglePattern extends Pattern {
    public void pattern() {
        SmallCrossStitch small = new SmallCrossStitch();
        LargeCrossStitch large = new LargeCrossStitch();
        int x = 0;
        boolean needleJam = (Math.random() < 0.05d);
        if (needleJam == false) {
            do {
                small.sew();
                large.sew();
                x++;
            } while (x < 5);}
            else {
                small.sew();
                large.sew();
                small.sew();
                large.sew();
                small.sew();
                System.out.print(" *JAM* ");
            }
    }
}