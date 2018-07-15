package design.patterns.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IndexDAOImpl implements IndexDAO {
	Map<String, Index> indexMap = new HashMap<>();
	@Override
	public void insertIndex() {
		List<Index> indexList = Arrays.asList(new Index(".IBM", "20180714", "IBM index"),
				new Index(".IBM", "20180714", "IBM index"), 
				new Index(".Sapient", "20180714", "IBM index"),
				new Index(".Wells", "20180714", "Wells index"), 
				new Index(".Wipro", "20180714", "IBM index"));
		
		indexList.forEach((e) -> {
			indexMap.put(e.getRicCode(), e);
		});
		
		System.out.println("Inserted " + indexList.size() + " elements");
	}

	@Override
	public List<Index> getAllIndex() {
		return new ArrayList<Index>(indexMap.values());
	}

	@Override
	public void deleteIndex(String ricCode) {
		indexMap.remove(ricCode);
		System.out.println("removed: "+ricCode);
	}

	@Override
	public Index getIndex(String ricCode) {
		Index index= indexMap.get(ricCode);
		if(index==null)
			System.out.println("Index does not exists");
		
		else
		return index;
		
		return index;
	}

}
