public class ZigZagLinesPattern extends Pattern {
    public void pattern(){
        ZigZagStitch zig = new ZigZagStitch();
        FillStitch fill = new FillStitch();
        int x = 0;

        do{
            zig.sew();
            zig.sew();
            zig.sew();
            fill.sew();
            fill.sew();
            fill.sew();
            x++;
        }while(x<2);
    }
}

