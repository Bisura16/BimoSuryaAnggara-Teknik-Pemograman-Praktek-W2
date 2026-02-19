
import id.ac.polban.employee.model.*;
import id.ac.polban.employee.service.*;

public class TestJar {
    public static void main(String[] args) {
        System.out.println("=== MEMULAI PENGUJIAN ===");
        Department itDept = new Department("KOMINFO");
        EmploymentType type = new EmploymentType("Part-Time");
        Employee emp1 = new Employee(1, "Bimo", itDept, type, 5000000);
        Employee emp2 = new Employee(2, "Anggara", itDept, type, 6000000);

        System.out.println("JAR Berhasil Diuji!");
        System.out.println("Karyawan 1: " + emp1.getName() +" [" + emp1.getDepartment().getName() + "] " +"Status: " + emp1.getType().getType());
        System.out.println("Karyawan 2: " + emp2.getName() +" [" + emp2.getDepartment().getName() + "] " + "Status: " + emp2.getType().getType());

        System.out.println("\n--- TESTING LOGIKA STATIC ---");
        int total = Employee.getEmployeeCount();
        System.out.println("Jumlah Karyawan ( SEHARUSNYA 2): " + total);

        if (total == 2) {
            System.out.println("STATUS: AMAN! LOGIKA STATIC VALID.");
        } else {
            System.out.println("STATUS: LOGIKA STATIC TIDAK VALID!");
        }
    }
}