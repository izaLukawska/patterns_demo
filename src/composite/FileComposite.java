package composite;

import java.util.ArrayList;
import java.util.List;

public class FileComposite implements File{

    private final List<File> files = new ArrayList<>();

    public void addFile(File file) {
        files.add(file);
    }

    @Override
    public void print() {
        for (File file : files) {
            file.print();
        }
    }
}
