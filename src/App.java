import java.util.Scanner;

class Person {
    public String name;
    public String bornDate;

    Person(String name, String bornDate) {
        this.name = name;
        this.bornDate = bornDate;
    }

    public void sleep() {
        System.out.println("Zzz...");
    }
}

class Mahasiswa extends Person {
    public String StudentId;
    public int point;

    Mahasiswa(String name, String bornDate, String studentId, int point) {
        super(name, bornDate);
        this.StudentId = studentId;
        this.point = point;
    }

    void helpingDosen() {
        point += 10;
    }

    void display() {
        System.out.println(
                "Name : " + super.name + "\n" +
                        "bornDate : " + super.bornDate + "\n" +
                        "point : " + this.point);
    }
}

class Dosen extends Person {
    public String CodeDosen;

    Dosen(String name, String bornDate, String CodeDosen) {
        super(name, bornDate);
        this.CodeDosen = CodeDosen;
    }

    void selfDev() {
        System.out.println("Self dev time");
    }

    void teach() {
        System.out.println("Teaching Time");
    }

    void p2m() {
        System.out.println("Helping masyarakat time");
    }

    void research() {
        System.out.println("Researching time");
    }

    void otherWorks() {
        System.out.println("Having quality time");
    }

    void display() {
        System.out.println(
                "Name : " + super.name + "\n" +
                        "bornDate : " + super.bornDate + "\n" +
                        "CodeDosen : " + this.CodeDosen);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Dosen d = new Dosen("A", "01012001", "DN001");
        Mahasiswa m = new Mahasiswa("Mabu", "03052002", "1234565", 0);
        Scanner scan = new Scanner(System.in);

        System.out.println("mahasiswa | dosen");
        String classString = scan.next();
        System.out.println(classString);
        if (classString.equals("dosen")) {
            d.display();
            Scanner scan2 = new Scanner(System.in);

            String method = scan2.next();
            switch (method) {
                case "other_works":
                    d.otherWorks();
                    break;
                case "p2m":
                    d.p2m();
                    break;
                case "research":
                    d.research();
                    break;
                case "teach":
                    d.teach();
                    break;
                case "self_dev":
                    d.selfDev();
                    break;
                case "sleep":
                    d.sleep();
                    break;
                default:
                    break;
            }
        } else if (classString.equals("mahasiswa")) {
            m.display();
            Scanner scan2 = new Scanner(System.in);

            String method = scan2.next();

            switch (method) {
                case "helping_dosen":
                    m.helpingDosen();
                    break;
                case "sleep":
                    d.sleep();
                    break;
                default:
                    break;
            }
        }

        // d.otherWorks();
        // d.p2m();
        // d.research();
        // d.teach();
        // d.selfDev();

        // System.out.println(m.point);
        // m.helpingDosen();
        // System.out.println(m.point);

    }
}
