import DOM.Parser;
import entity.Flower;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        File xml = new File("src/main/resources/Flowers");
        File xsd = new File("src/main/resources/FlowersScheme.xsd");

        ArrayList<Flower> flowers;

        flowers = Parser.getFlowersList(xml,xsd);
        Collections.sort(flowers, new FlowerComparator());
        for (Flower flower:flowers) {
            LOGGER.info(flower);
        }
    }
}