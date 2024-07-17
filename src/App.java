import java.util.List;

import DAO.AbrigoDAO;
import Model.Abrigo;
import Util.CSVReader;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        List<Abrigo> abrigos = CSVReader.lerAbrigos();
        new AbrigoDAO().deletar("5");
        
    }
}
