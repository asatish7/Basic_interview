package design.patterns.dao;

import java.util.List;

public interface IndexDAO {
public void insertIndex();
public List<Index> getAllIndex();
public Index getIndex(String ricCode);
public void deleteIndex(String ricCode);
}
