package ua.alevel.task4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ScannerClass {
    String filePath = "./src";
    private File file = new File(filePath);
    private ArrayList<String> foundedFiles = new ArrayList<>();

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public ArrayList<String> getFoundedFiles() {
        return foundedFiles;
    }

    public void setFoundedFiles(ArrayList<String> foundedFiles) {
        this.foundedFiles = foundedFiles;
    }

    public void match() {
        for (File currentFile : Objects.requireNonNull(file.listFiles())) {
            try {
                file = currentFile;
                match();
            } catch (NullPointerException e) {
            }

            if (currentFile.isFile()) {
                try {
                    boolean isContains = Files
                            .lines(Paths.get(currentFile.getPath()))
                            .anyMatch(e -> e.contains("@Service"));
                    if (isContains)
                        foundedFiles.add(currentFile.getPath());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        classNames();
    }

    public void classNames() {
        List<String> names = new ArrayList<>();
        for (String current : foundedFiles) {
            current = current.replace("\\", "/");
            current = current.replace(filePath + "/", "");
            current = current.replaceAll("/", ".");

            names.add(current.replace(".java", ""));
        }
        foundedFiles.clear();
        foundedFiles.addAll(names);
        foundedFiles.remove("ua.alevel.task4.ScannerClass");
    }
}
