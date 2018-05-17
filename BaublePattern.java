public class BaublePattern extends Pattern {
    public void pattern(){
        ShortLineStitch shortL = new ShortLineStitch();
        CircleStitch circle = new CircleStitch();
        int x = 0;

        do{
            shortL.sew();
            shortL.sew();
            circle.sew();
            x++;
        }while(x<5);
    }
}
