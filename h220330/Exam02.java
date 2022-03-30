package example01.h220330;

public class Exam02 {

    public static void main(String[] args) {

        int[] koreanScore = {72,35,82,72,56,89};
        int[] mathScore = {80,58,91,45,35,75};

        subjectAverage(koreanScore,mathScore);
    }

    public static void subjectAverage(int[] koreanScore, int[] mathScore) {

        int koreanTotal = 0;
        int mathTotal = 0;
        double[] studentAvg = new double[6];
        double koreanAvg = 0;
        double mathAvg = 0;

        System.out.println("6명의 국어, 수학 점수를 입력하세요");

        // 학생별 점수 출력
        for(int student = 0; student < 6; student++) {
            System.out.println((student+1) + "번\t국어: " + koreanScore[student]);
            System.out.println("\t수학: " + mathScore[student]);
        }

        // 학생 평균
        for(int student = 0; student < 6; student++) {
            studentAvg[student] = (double)(koreanScore[student] + mathScore[student])/2;
        }

        // 국어, 수학 각 평균
        for(int student = 0; student < 6; student++) {
            koreanTotal += koreanScore[student];
            mathTotal += mathScore[student];
        }
        koreanAvg = (double)koreanTotal/koreanScore.length;
        mathAvg = (double)mathTotal/mathScore.length;
        koreanAvg = Math.ceil(koreanAvg*10)/10;
        mathAvg = Math.ceil(mathAvg*10)/10;                 // 소수 둘째자리 올림

        // 학생별 점수, 평균 출력
        System.out.println("No.국어\t수학\t평균");
        for(int student = 0; student < 6; student++) {
            System.out.println((student+1) + "\t" + koreanScore[student] + "\t" + mathScore[student] + "\t" + studentAvg[student] );
        }

        System.out.println("평균 " + koreanAvg + " " + mathAvg);
    }
}
