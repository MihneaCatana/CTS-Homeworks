package adapter.classes;

public class AdaptorIntrare implements IReceptor{

    private Cablu cabluIntrare;

    public AdaptorIntrare(Cablu cabluIntrare) {
        this.cabluIntrare = cabluIntrare;
    }


    @Override
    public void primesteSemnal() {
        System.out.print("In receptor intra un ");
        cabluIntrare.transmiteSemnal();
    }
}
