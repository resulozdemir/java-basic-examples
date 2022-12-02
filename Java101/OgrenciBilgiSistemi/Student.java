package Java101.OgrenciBilgiSistemi;

public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;
    Course s1;
    Course s2;
    Course s3;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
        this.s1 = mat;
        this.s2 = fizik;
        this.s3 = kimya;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya, int s1, int s2, int s3) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

        if(s1 >= 0 && s1 <= 100){
            this.s1.sozlu = s1;
        }
        if(s2 >= 0 && s2 <= 100){
            this.s2.sozlu = s2;
        }
        if(s3 >= 0 && s3 <= 100){
            this.s3.sozlu = s3;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0 || this.s1.sozlu == 0 || this.s2.sozlu == 0 || this.s3.sozlu == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (((this.mat.note) * 0.80) + ((this.s1.sozlu * 0.20) + ((this.fizik.note) * 0.80) + ((this.s2.sozlu) * 0.20) + ((this.kimya.note) * 0.80) + ((this.s3.sozlu) * 0.20)) / 6);
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Tarih Notu : " + this.mat.note );
        System.out.println("Tarih Sozlu Notu : " + this.s1.sozlu );
        System.out.println("Kimya Notu : " + this.fizik.note);
        System.out.println("Kimya Sozlu Notu : " + this.s2.sozlu );
        System.out.println("Fizik Notu : " + this.kimya.note);
        System.out.println("Fizik Sozlu Notu : " + this.s3.sozlu );
    }
}
