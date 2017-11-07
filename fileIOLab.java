/*
 * 
 * Name:Zhiwei Lin
 */
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
public class fileIOLab {

public static deletePath(String)	
	try {
	    Files.delete(path);
	} catch (NoSuchFileException x) {
	    System.err.format("%s: no such" + " file or directory%n", path);
	} catch (DirectoryNotEmptyException x) {
	    System.err.format("%s not empty%n", path);
	} catch (IOException x) {
	    // File permission problems are caught here.
	    System.err.println(x);
	}

}

 public static Boolean isDir(Path path) {
	  if (path == null || !Files.exists(path)) return false;
	  else return Files.isDirectory(path);
	}
 
 
 
public static void main(String[] args) throws IOException {
	file[]fileList= getFileList("C:\\Users\\zhl752\\Downloads\\Backup.zip\\Backup\\SPEED");
	for(File file:fileList) {
	 System.out.println(file.getName());
	}
}

  private static File[]getFileList(String dirPath) {
	  File dir = new File(dirpath);
	  File[]file= dir.listFiles(new FilenameFilter() {public boolean accept(File dir, String name) 
		  {
		    return name.startsWith("SPEED");
		    		}
	  }
  } }