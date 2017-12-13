import java.io.File;

public class HowToCreateAFile 
{
    public static void main(String[] args) 
    {
   
        try
        {
            File f = new File("C:\\Users\\TuX\\Desktop\\Hello2.txt");
            System.out.println("Is Exists : "+f.exists());
            System.out.println("File Size : "+f.length());
            boolean isFolder = f.isDirectory();
            boolean isFile = f.isFile();
            
            System.out.println("Is File : "+f.isFile());
            System.out.println("Is Folder : "+f.isDirectory());
            
            // DELETE A FILE
            // boolean isDeleted = f.delete();
            // System.out.println("Is File Deleted : "+isDeleted);
            
            // Create A File
            // File f2 = new File("C:/Users/TuX/Desktop/Hello2.txt");
            // boolean isCreated = f2.createNewFile();
            // System.out.println("Is F2 Created : "+isCreated);
            
            String fileName = f.getName();
            String parentFolderName = f.getParent();
            String fullPath = f.getAbsolutePath();
            
            System.out.println("FileName : "+fileName);
            System.out.println("Parent Folder : "+parentFolderName);
            System.out.println("Full Path : "+fullPath);
        } catch (Exception e) { e.printStackTrace(); }
    }
}
