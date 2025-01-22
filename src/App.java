import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {

        Connection conn = DbConnect.connect();
        boolean flag = true;
        while (flag) { 
            Scanner sc = new Scanner(System.in);
            System.out.println("Options: 1. Create, 2. Read, 3. Update, 4. Delete, 5. Close");
            int option = sc.nextInt();

            switch (option) {
                case 1 -> {
                    System.out.println("Enter id: ");
                    int id = sc.nextInt();
                    System.out.println("Enter name: ");
                    String name = sc.next();
                    System.out.println("Enter email: ");
                    String email = sc.next();
                    System.out.println("Enter phone: ");
                    String phone = sc.next();
                    Operations.create(conn, id, name, email, phone);
                }
                case 2 -> {
                    ArrayList<Students> res = Operations.read(conn);
                    for (Students st : res) {
                        System.out.println("Id: " + st.getId() + ", Name: " + st.getName() + ", Email: " + st.getEmail() + ", Phone: " + st.getPhone());
                    }
                }
                case 3 -> {
                    System.out.println("Enter id: ");
                    int id = sc.nextInt();
                    Operations.update(conn, id);
                }
                case 4 -> {
                    System.out.println("Enter id: ");
                    int id = sc.nextInt();
                    Operations.delete(conn, id);
                }
                case 5 -> {
                    System.out.println("Closing the connection");
                    conn.close();
                    flag = false;
                }
                default -> System.out.println("Invalid option");
            }
        }
        
    }
}
