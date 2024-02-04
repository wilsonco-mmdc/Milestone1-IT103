import javax.swing.*;
import first.Employee;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EmployeeInterface extends JFrame {
    private JTextField nameField, idField, dobField, addressField, numberField, positionField, slCreditsField, vlCreditsField;
    private JTextArea resultTextArea;

    public EmployeeInterface() {
        setTitle("Employee Information");
        setSize(600, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Create labels and text fields
        addLabelAndTextField(panel, "Name: ");
        addLabelAndTextField(panel, "Employee ID: ");
        addLabelAndTextField(panel, "Date of Birth (yyyy-MM-dd): ");
        addLabelAndTextField(panel, "Address: ");
        addLabelAndTextField(panel, "Contact Number: ");
        addLabelAndTextField(panel, "Position: ");
        addLabelAndTextField(panel, "SL Credits: ");
        addLabelAndTextField(panel, "VL Credits: ");

        // Submit button
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle the submit button click
                createEmployee();
            }
        });
        panel.add(submitButton);

        // display employee details
        resultTextArea = new JTextArea(10, 30);
        resultTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultTextArea);
        panel.add(scrollPane);

        add(panel);
        setLocationRelativeTo(null);
    }

    private void addLabelAndTextField(JPanel panel, String label) {
        JLabel jLabel = new JLabel(label);
        JTextField jTextField = new JTextField();
        panel.add(jLabel);
        panel.add(jTextField);

        // text fields
        switch (label) {
            case "Name: ":
                nameField = jTextField;
                break;
            case "Employee ID: ":
                idField = jTextField;
                break;
            case "Date of Birth (yyyy-MM-dd): ":
                dobField = jTextField;
                break;
            case "Address: ":
                addressField = jTextField;
                break;
            case "Contact Number: ":
                numberField = jTextField;
                break;
            case "Position: ":
                positionField = jTextField;
                break;
            case "SL Credits: ":
                slCreditsField = jTextField;
                break;
            case "VL Credits: ":
                vlCreditsField = jTextField;
                break;
        }
    }

    private void createEmployee() {
        try {
            String name = nameField.getText();
            int id = Integer.parseInt(idField.getText());
            Date dob = new SimpleDateFormat("yyyy-MM-dd").parse(dobField.getText());
            String address = addressField.getText();
            String number = numberField.getText();
            String position = positionField.getText();
            int slCredits = Integer.parseInt(slCreditsField.getText());
            int vlCredits = Integer.parseInt(vlCreditsField.getText());

            Employee employee = new Employee(name, id, dob, address, number, position, slCredits, vlCredits);

            // Append employee details to JTextArea
            resultTextArea.append("Employee created: \n");
            resultTextArea.append("Name: " + employee.getName() + "\n");
            resultTextArea.append("ID: " + employee.getId() + "\n");
            resultTextArea.append("DOB: " + employee.getDate() + "\n");
            resultTextArea.append("Address: " + employee.getAddress() + "\n");
            resultTextArea.append("Contact Number: " + employee.getContactNumber() + "\n");
            resultTextArea.append("Position: " + employee.getPosition() + "\n");
            resultTextArea.append("SL Credits: " + employee.getSlCredits() + "\n");
            resultTextArea.append("VL Credits: " + employee.getVlCredits() + "\n");
            resultTextArea.append("\n");

        } catch (NumberFormatException | ParseException ex) {
            JOptionPane.showMessageDialog(this, "Invalid please check your input and try again.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EmployeeInterface().setVisible(true);
            }
        });
    }
}