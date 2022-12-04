package DOM.java.DOM;

import entity.Flower;
import org.w3c.dom.Document;

import java.io.File;
import java.util.ArrayList;

public class Parser {

    public static ArrayList<Flower> getFlowersList(File xmlFile, File xsd){

        Creator creator = new Creator(xmlFile);
        Document doc = creator.getDocument();

        Reader reader = new Reader();
        return reader.readDocument(doc);
    }
}