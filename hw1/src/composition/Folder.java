package composition;

import java.util.ArrayList;
import java.util.List;

public class Folder {
	private String folderName;
	private List<File> files;
	private List<Folder> folders;
	
	public Folder() {
		setFiles(new ArrayList<>());
		folders = new ArrayList<>();
	}

	public String getFolderName() {
		return folderName;
	}

	public void setFolderName(String folderName) {
		this.folderName = folderName;
	}

	public List<File> getFiles() {
		return files;
	}
	
	public List<Folder> getFolders() {
		return folders;
	}

	public void setFiles(List<File> files) {
		this.files = files;
	}
	
	public void createFile(String fileName) {
		File file = new File();
		file.setFileName(fileName);
		files.add(file);
	}
	
	public void deleteFile(String fileName) {
		File fileToBeDeleted = new File();
		
		for(File file : files) {
			if(file.getFileName().equals(fileName))
				fileToBeDeleted = file;
		}
		
		files.remove(fileToBeDeleted);
	}
	
	public void createFolder(String folderName) {
		Folder folder = new Folder();
		folder.setFolderName(folderName);
		folders.add(folder);
	}
	
	public void deleteFolder(String folderName) {
		Folder folderToBeDeleted = new Folder();
		
		for(Folder folder : folders) {
			if(folder.getFolderName().equals(folderName))
				folderToBeDeleted = folder;
		}
		
		folders.remove(folderToBeDeleted);
	}
	
	public void print() {
		formatter(0);
	}
	
	public void formatter(int indents) {
		for(int i = 0; i < indents; i++)
			System.out.print("\t");
		
		System.out.println("Folder: " + folderName);
		
		for(File file: files)
			file.print(indents + 1);
		
		for(Folder folder: folders)
			folder.formatter(indents + 1);
	}
}
