package les1;

import les2.HomeWork.HomeWork2;

import java.io.FileInputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Calk {
    private Logger log;
    {
        try(FileInputStream ins = new FileInputStream("src/main/resources/logger.properties")){
            LogManager.getLogManager().readConfiguration(ins);
            log = Logger.getLogger(HomeWork2.class.getName());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public double mul(int a, int b){
        log.info(String.valueOf(a * b));
        return a * b;
    }
    public double sum(int a, int b){
        log.info(String.valueOf(a + b));
        return a + b;
    }
    public double div(int a, int b){
        if (a != 0) {
            log.info(String.valueOf(a / b));
            return a / b;
        }
        log.info("Делить на ноль нельзя");
        return 0;
    }
    public double sub(int a, int b){
        log.info(String.valueOf(a - b));
        return a - b;
    }
}
