package model;

import java.util.Date;

public class File {

    private String name;

    private Double size;

    private String path;

    private FileType type;

    private Date lastModified;

    public File(String name, Double size, String path, FileType type, Date lastModified) {
        this.name = name;
        this.size = size;
        this.path = path;
        this.type = type;
        this.lastModified = lastModified;
    }

    public String getName() {
        return name;
    }

    public Double getSize() {
        return size;
    }

    public String getPath() {
        return path;
    }

    public FileType getType() {
        return type;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setType(FileType type) {
        this.type = type;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", path='" + path + '\'' +
                ", type=" + type +
                ", lastModified=" + lastModified +
                '}';
    }
}
