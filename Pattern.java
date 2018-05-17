import static java.lang.System.out;

public class Pattern {

    public void pattern(){

    }

    public void print8x3(Pattern p) {
        for (int y = 0; y < 3; y++) {
            for (int z = 0; z < 8; z++) {
                p.pattern();
            }
            out.println();
        }
    }
        public void print6x8(Pattern p) {
            for(int y=0; y<8; y++){
                for(int z=0; z<6; z++){
                    this.pattern();
                }
                out.println();
            }
        }
    }