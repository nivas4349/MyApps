

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FileNamesCheckList {

	Set<String> checkListSet = new HashSet<>();

	public static void main(String[] args) {
		final FileNamesCheckList fncl = new FileNamesCheckList();
		fncl.checkListSet.add("additionalJars");
		fncl.checkListSet.add("applications");
		fncl.checkListSet.add("migration");

		List<String> filelist = new ArrayList<String>();
		filelist.add("applications");
		filelist.add("additionalJars");
		filelist.add("sdfsdffsdf");
		filelist.add("migration");
		System.out.println(fncl.isValid(filelist));
	}

	boolean isValid(List<String> fList) {
		for (String file : fList) {
			checkListSet.remove(file);
		}
		if (checkListSet.size() == 0) {
			return true;
		} else {
			return false;
		}
	}
}
