public class Student {
    Course c1;
    Course c2;
    Course c3;
    Course s1;
    Course s2;
    Course s3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3, Course s1, Course s2,Course s3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3, int soz1, int soz2, int soz3){
        if(note1>= 0 && note1<= 100){
            this.c1.note = note1;
        }
        if(note2>= 0 && note2<= 100){
            this.c2.note = note2;
        }
        if(note3>= 0 && note3<= 100){
            this.c3.note = note3;
        }
        if(soz1>= 0 && soz1<= 100){
            this.s1.soz = soz1;
        }
        if(soz2>= 0 && soz2<= 100){
            this.s2.soz = soz2;
        }
        if(soz3>= 0 && soz3<= 100){
            this.s3.soz = soz3;
        }
    }

    void isPass(){
        this.avarage = ((this.c1.note*0.8)+(this.s1.soz*0.2)+(this.c2.note*0.8)+(this.s2.soz*0.2)+(this.c3.note*0.8)+(this.c3.soz*0.2))/3.0;
        if(this.avarage>55){
            System.out.println("Sınıfı geçtiniz :)");
            this.isPass = true;
        }else{
            System.out.println("Kaldınızz");
        }

        printNote();
    }
    void printNote(){
        System.out.println(this.c1.name + " Notu\t:"+ this.c1.note);
        System.out.println(this.c2.name + " Notu\t:"+ this.c2.note);
        System.out.println(this.c3.name + " Notu\t:"+ this.c3.note);
        System.out.println(this.s1.name + " Sözlü notu\t:"+ this.s1.soz);
        System.out.println(this.s2.name + " Sözlü notu\t:"+ this.s2.soz);
        System.out.println(this.s3.name + " Sözlü notu\t:"+ this.s3.soz);
        System.out.println("Ortalamanız : "+ this.avarage);
    }
}
