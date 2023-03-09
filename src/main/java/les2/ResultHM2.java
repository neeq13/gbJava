package les2;

import les2.HomeWork.HomeWork1;
import les2.HomeWork.HomeWork2;
import les2.HomeWork.HomeWork3;

public class ResultHM2 {
    private static final HomeWork1 home1 = new HomeWork1();
    private static final HomeWork2 home2 = new HomeWork2();
    private static final HomeWork3 home3 = new HomeWork3();

    private static final Task1 task1 = new Task1();
    private static final Task2 task2 = new Task2();

    public static void start(){
        home1.sqlWhere();
        home2.bubble();
        home3.builder();

    }
}
