/*
 * 
 * Name: zhiwei lin
 */
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.PathMatcher;

public class fileIO {

	public static void checkSpeedFiles() throws IOException {

		PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:*.txt*");
		File f = new File("C:\\Users\\dell\\Downloads\\Backup\\SPEED");
		File[] allFiles = f.listFiles();

		for (int i = 0; i < allFiles.length; i++) {
			String a = allFiles[i].getPath();
			Path b = Paths.get(a);

			if (matcher.matches(b.getFileName())) {
				System.out.println("File doesn't match: " + b);
			}

			else {
				System.out.println("File doesn't match: " + b);
				Files.deleteIfExists(b);
			}

		}

	}

	public static void checkApolloFiles() throws IOException {

		File f = new File("C:\\Users\\dell\\Downloads\\Backup\\APOLLO");
		File[] allFiles = f.listFiles();
		int i = 0;

		for (; i < allFiles.length; i++) {
			continue;
		}

		String a = allFiles[i - 1].getPath();
		int d = a.length();

		int c = a.charAt(d - 5);

		System.out.println(c);

		System.out.println(i);

		if (c != d) {
			System.out.println("Some files are missing.");
		} else
			System.out.println("All files are accounted for.");

	}

	public static void main(String[] args) throws IOException {
		checkSpeedFiles();
		checkApolloFiles();

	}

}