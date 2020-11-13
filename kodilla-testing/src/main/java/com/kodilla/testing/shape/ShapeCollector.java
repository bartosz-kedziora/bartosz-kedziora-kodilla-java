package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector
{
    private List <Shape> shapeCollectorList = new ArrayList();

    public List<Shape> getShapeCollectorList()
    {
        return shapeCollectorList;
    }

    void addFigure(Shape shape)
    {
        shapeCollectorList.add(shape);
    }

    void removeFigure(Shape shape)
    {
        shapeCollectorList.remove(shape);
    }

    Shape getFigure(int n)
    {
        return shapeCollectorList.get(n);
    }

    String showFigures()
    {
        String shapeName = "";
        for (Shape shapeShow: shapeCollectorList)
        {
            shapeName=shapeName + " " + shapeShow.getShapeName();
        }
        return shapeName.substring(1);
    }
}
