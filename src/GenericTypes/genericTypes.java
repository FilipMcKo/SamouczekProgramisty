package samouczekProgramisty.genericTypes;

import java.util.ArrayList;
import java.util.List;

public class genericTypes {

    private static void method2(FancyBox<? extends Rectangle> box) {
        Figure figure = box.object;
        System.out.println(figure);
    }

    private static void method3(FancyBox<Figure> box) {
        Figure figure = box.object;
        System.out.println(figure);
    }


    public static void main(String[] args) {
        FancyBox<Figure> fancyFigureBox = new FancyBox<>(new Figure());
        FancyBox<Circle> fancyCircleBox = new FancyBox<>(new Circle());
        FancyBox<Square> fancySquareBox = new FancyBox<>(new Square());
        FancyBox<Rectangle> fancyRectangleBox = new FancyBox<>(new Rectangle());
        FancyBox<?> box = new FancyBox<>("object");
        box.object = null;
        List<Square> list = new ArrayList<>();
       // method2(fancyFigureBox);
        //method2(fancyCircleBox);
        method2(fancySquareBox);
        method2(fancyRectangleBox);
        method3(fancyFigureBox);

    }
}
