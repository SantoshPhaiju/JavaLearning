package JavaGUI;

import javax.swing.*;

public class SystemMenuBar extends JMenuBar {
    public SystemMenuBar() {
        JMenu fileMenu = new JMenu("File");
        JMenu removeStudentMenu = new JMenu("Remove Student");
        JMenu addStudentMenu = new JMenu("Add Student");
        JMenu updateStudentMenu = new JMenu("Update Student");
        JMenu deleteStudentMenu = new JMenu("Delete Student");

        JMenuItem exitMenuItem = new JMenuItem("Exit");
        fileMenu.add(exitMenuItem);

        add(fileMenu);
        add(removeStudentMenu);
        add(addStudentMenu);
        add(updateStudentMenu);
        add(deleteStudentMenu);



    }
}
