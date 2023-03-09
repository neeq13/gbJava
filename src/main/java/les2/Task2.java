package les2;

import javax.swing.*;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Task2 extends JFrame {
    private final JButton btnOpenDir;
    private final JFileChooser fileChooser;
    private final String path = "ssrc/main/java/les2/task1/file.txt";
    private int count = 0;
    private Logger log;
    {
        try(FileInputStream ins = new FileInputStream("src/main/resources/logger.properties")){
            LogManager.getLogManager().readConfiguration(ins);
            log = Logger.getLogger(Task1.class.getName());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Task2() {
        super("Выбор директории");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.btnOpenDir = new JButton("Открыть директорию");
        this.fileChooser = new JFileChooser();
        addFileChooserListeners();

        JPanel contents = new JPanel();
        contents.add(btnOpenDir);
        setContentPane(contents);
        setSize(360, 110);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void uiMethod() {
        UIManager.put(
                "FileChooser.saveButtonText", "Сохранить");
        UIManager.put(
                "FileChooser.cancelButtonText", "Отмена");
        UIManager.put(
                "FileChooser.fileNameLabelText", "Наименование файла");
        UIManager.put(
                "FileChooser.filesOfTypeLabelText", "Типы файлов");
        UIManager.put(
                "FileChooser.lookInLabelText", "Директория");
        UIManager.put(
                "FileChooser.saveInLabelText", "Сохранить в директории");
        UIManager.put(
                "FileChooser.folderNameLabelText", "Путь директории");
    }

    private void addFileChooserListeners() {
        btnOpenDir.addActionListener(e -> {
            fileChooser.setDialogTitle("Выбор директории");
            fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int result = fileChooser.showOpenDialog(Task2.this);
            if (result == JFileChooser.APPROVE_OPTION) {
                readDir(String.valueOf(fileChooser.getSelectedFile()));
                JOptionPane.showMessageDialog(Task2.this,
                        fileChooser.getSelectedFile());
            }
        });
    }

    private void readDir(String path) {
        File file = new File(path);
        File[] files = file.listFiles();
        if (files != null) {
            for (File entry : files) {
                if (entry.isDirectory()) {
                    readDir(entry.getPath());
                    continue;
                }
                writeInFile(entry);
            }
        } else {
            log.log(Level.WARNING,"что-то пошло не так");
            logErrors("File's not found");
        }
    }

    private void writeInFile(File entry) {

        try (FileWriter fw = new FileWriter(path, true)) {
            if(new File(path).exists() && new File(path).length() != 0 && count == 0){
                count = getCount(count);
            }
            count++;
            fw.write(count + " Расширение файла: ");
            fw.append(entry.getName().substring(entry.getName().indexOf(".") + 1, entry.getName().length() - 1));
            fw.append("\n");
            fw.flush();
        } catch (IOException e) {
            log.log(Level.WARNING,"что-то пошло не так: \n" + e.getMessage());
            logErrors(e.getMessage());
        }
    }

    private int getCount(int count) throws IOException {
        BufferedReader input = new BufferedReader(new FileReader(path));
        String last = null;
        String line;
        while (null != (line = input.readLine())) {
            last = line;
        }
        if(last != null) {
            count = Integer.parseInt(last.substring(0, last.indexOf(" ")));
        }
        return count;
    }

    private void logErrors(String logg) {
        try (FileWriter fw = new FileWriter("src/main/java/les2/task1/log.txt", true)) {
            fw.write(logg);
            fw.append("\n");
            fw.flush();
        } catch (IOException e) {
            log.log(Level.WARNING,"что-то пошло не так: \n" + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
