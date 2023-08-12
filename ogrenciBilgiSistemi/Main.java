public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut hoca","trh", "905385504558");
        Teacher t2 = new Teacher("Neşe hoca","ing","05367586523");
        Teacher t3 = new Teacher("Ahmet hoca","mat","05367596423");

        Course tarih = new Course("tarih","001","trh");
        tarih.addTeacher(t1);

        Course ingilizce = new Course("inglizce","002","ing");
        ingilizce.addTeacher(t2);

        Course matematik = new Course("matematik","003","mat");
        matematik.addTeacher(t3);

        Student s1 = new Student("fatih arslan", "316", "3",tarih, ingilizce, matematik, tarih, ingilizce, matematik);
        s1.addBulkExamNote(100,58,96,75,60,55);
        s1.isPass();
    }
}