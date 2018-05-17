public class BlockyBaublePattern extends Pattern {
    public void pattern(){
        BlockStitch block = new BlockStitch();
        ShortLineStitch shortL = new ShortLineStitch();
        CircleStitch circle = new CircleStitch();
        int x = 0;
        boolean needleJam = (Math.random() < 0.10d);

        if (needleJam == false){
            do{
                block.sew();
                shortL.sew();
                shortL.sew();
                circle.sew();
                shortL.sew();
                shortL.sew();
                x++;
            }while(x<3);}
        else{
                block.sew();
                shortL.sew();
                shortL.sew();
                circle.sew();
                shortL.sew();
                shortL.sew();
                block.sew();
                shortL.sew();
                shortL.sew();
                circle.sew();
                System.out.print(" *JAM* ");
            }
    }
}
