package box3d;

import model.Box;

public class BoxImpl implements BoxImplI{
    private Box box;

    public BoxImpl(Box box) {
        this.box = box;
    }

    @Override
    public double getSurfaceArea() {
        return (box.getLength()*box.getWidth());
    }

    @Override
    public double getVolume() {
        return 0;
    }
}
