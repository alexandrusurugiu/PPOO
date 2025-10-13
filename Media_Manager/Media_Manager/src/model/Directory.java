package model;

import java.util.ArrayList;
import java.util.List;

public class Directory {

    private String path;

    private List<File> files;

    public Directory(String path) {
        this.path = path;
        this.files = new ArrayList<>();
    }

    public String getPath() {
        return path;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void addFile(File file) {
        this.files.add(file);
    }
}
