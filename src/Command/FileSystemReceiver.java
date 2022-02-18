package Command;

// implement Command Pattern
//File System utility with methods to open, write and close file.
// This file system utility should support multiple operating systems such as Windows and Unix
public interface FileSystemReceiver {

    void openFile();
    void writeFile();
    void closeFile();
}
