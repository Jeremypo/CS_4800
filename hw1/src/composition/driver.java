package composition;

import java.util.List;

public class driver {

	public static void main(String[] args) {
		Folder root;
		Folder current;
		Folder prev;
		
		root = new Folder();
		root.setFolderName("php_demo 1");
		
		current = root;
		
		current.createFolder("Source Files");
		current.createFolder("Include Path");
		current.createFolder("Remote Files");
		
		prev = current;
		current = pointToSubFolder("Source Files", current);
		
		current.createFolder(".phalcon");
		current.createFolder("app");
		current.createFolder("cache");
		current.createFolder("public");
		
		prev = current;
		current = pointToSubFolder("app", current);
		
		current.createFolder("config");
		current.createFolder("controllers");
		current.createFolder("library");
		current.createFolder("migrations");
		current.createFolder("models");
		current.createFolder("views");
		
		current = prev;
		current = pointToSubFolder("public", current);
		
		current.createFile(".htaccess");
		current.createFile(".htrouter.php");
		current.createFile("index.html");
		
		current = root;
	
		//1. before deletions
		System.out.println("\\\\ Initial Tree \\\\");
		root.print();
		
		current = pointToSubFolder("Source Files", current);
		
		//2. delete app
		current.deleteFolder("app");
		
		//3. delete public
		current.deleteFolder("public");
		
		//return to root
		current = root;
		
		//final output
		System.out.println("\n\\\\ Final Tree \\\\");
		current.print();
	}
	
	public static Folder pointToSubFolder(String folderName, Folder currentFolder) {
		Folder foundFolder = new Folder();
		List<Folder> folders = currentFolder.getFolders();
		
		for(Folder folder : folders)
			if(folder.getFolderName().equals(folderName))
				return folder;
		
		return foundFolder;
	}

}
