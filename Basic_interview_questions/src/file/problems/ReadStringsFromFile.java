package file.problems;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ReadStringsFromFile {
	public static void main(String[] args) {
		try {
			File file = new File("D:/Git_work_space/Basic_interview_questions/src/file/problems/test.txt");
			FileReader fr = new FileReader(file);
			BufferedReader bf = new BufferedReader(fr);
			String line = null;
			StringBuffer sb = new StringBuffer();
			while ((line = bf.readLine()) != null) {
				sb.append(line);
			}
			String words[] = sb.toString().split(" ");
			Map<String, Long> result = Arrays.asList(words).stream()
					.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("Error Reading file " + e);
		}

	}
}
