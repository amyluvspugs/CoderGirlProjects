import static java.lang.System.out;

public class TapestryController {

    public static void main(String[] args) {
        CrossStitchWigglePattern csw = new CrossStitchWigglePattern();
        ZigZagLinesPattern zzl = new ZigZagLinesPattern();
        BaublePattern b = new BaublePattern();
        BlockyBaublePattern bb = new BlockyBaublePattern();
        BrokenWigglePattern bw = new BrokenWigglePattern();

        Pattern[] patterns = {csw, zzl, b, bb, bw};

        for (int p = 0; p < patterns.length; p++) {
        patterns[p].print8x3(patterns[p]);
        }

        out.println();
        out.println();
        out.println();

        for(int p = 0; p<patterns.length; p++){
            patterns[p].print6x8(patterns[p]);
        }
    }
}
