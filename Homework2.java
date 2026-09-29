import java.util.Scanner;

class Student {
    int GradeNum;
    String Name;
    String Major;
    int PhoneNum;


    void SetGrade(int GradeNum){
        this.GradeNum = GradeNum;
    }

    void SetName(String Name){
        this.Name = Name;
    }

    void SetMajor(String Major){
        this.Major = Major;
    }

    void SetPhone(int PhoneNum){
        this.PhoneNum = PhoneNum;
    }

}

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] student = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            student[i] = new Student();
            student[i].SetGrade(sc.nextInt());
            student[i].SetName(sc.next());
            student[i].SetMajor(sc.next());
            student[i].SetPhone(sc.nextInt());
        }

        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
        for (int i = 0; i < 3; i++){

            String PhoneNumStr = Integer.toString(student[i].PhoneNum);
            String FullPhoneNum = "0" + PhoneNumStr;
            String FinalPhoneNum = FullPhoneNum.substring(0, 3) + "-" + FullPhoneNum.substring(3, 7) + "-" + FullPhoneNum.substring(7);


            System.out.printf("%d번째 학생: %d %s %s %s\n", (i + 1), student[i].GradeNum, student[i].Name, student[i].Major, FinalPhoneNum);
        }
    }
}

