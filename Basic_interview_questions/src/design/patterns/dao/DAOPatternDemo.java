package design.patterns.dao;

public class DAOPatternDemo {
public static void main(String[] args) {
	IndexDAO indexDAO= new IndexDAOImpl();
	indexDAO.insertIndex();
	indexDAO.getAllIndex();
	System.out.println(indexDAO.getIndex(".Wells").getDescription());
	indexDAO.deleteIndex(".IBM");
}
}
