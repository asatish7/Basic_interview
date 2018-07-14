package file.problems;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class ReadStringFromFile {

	public static void main(String[] args) {
		try{
		File file = new File("D:/Git_work_space/Basic_interview_questions/src/file/problems/test.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line;
		StringBuffer lines = new StringBuffer();
		while((line = br.readLine())!=null){
			lines.append(line);
		}
		System.out.println("All lines read from file are /n"+lines.toString());
		String [] words= lines.toString().split(" ");
		Map<String,Integer> wordCount = new HashMap<>();
		for(int i=0;i<words.length;i++){
			String word= words[i];
			if(wordCount.containsKey(word))
			wordCount.put(words[i], wordCount.get(word) + 1);
			else
			wordCount.put(words[i], 1);
		}
		wordCount.forEach((k,v) -> {
			System.out.println("Word: "+k+", Count: "+v);
		});
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}