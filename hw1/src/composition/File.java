package composition;

public class File {
	private String fileName;
	
	public File() {}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	};
	
	public void print(int indents) {
		for(int i = 0; i < indents; i++) 
			System.out.print("\t");
		
		System.out.println("File: " + fileName);
	}
}
