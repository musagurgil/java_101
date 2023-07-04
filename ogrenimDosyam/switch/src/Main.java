public class Main {
    public static void main(String[] args) {
        char grade = 'E';

        switch (grade) {
            case 'A':
                System.out.println("Öğrenci 'A' not derecesini almıştır.");
                break;
            case 'B':
                System.out.println("Öğrenci 'B' not derecesini almıştır.");
                break;
            case 'C':
                System.out.println("Öğrenci 'C' not derecesini almıştır.");
                break;
            case 'D':
                System.out.println("Öğrenci 'D' not derecesini almıştır.");
                break;
            case 'F':
                System.out.println("Öğrenci 'F' not derecesini almıştır.");
                break;
            default:
                System.out.println("Öğrenci geçersiz not derecesini almıştır.");
        }
    }
}