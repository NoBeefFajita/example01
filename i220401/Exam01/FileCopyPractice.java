package example01.i220401.Exam01;

import java.io.*;
import java.util.ArrayList;

public class FileCopyPractice {
    public static void main(String...args) {
        /*
        *   cmd로 파일 카피시 문자 깨짐 발생
        */
        try {
            Console cmd = System.console();
            String sourceFileName = cmd.readLine("복사 소스 이름: "); // "example01/i220401/files/originFile.txt"
            String copiedFileName = cmd.readLine("복사 대상 파일 이름: ");

            String strLine;                                     // 1행 데이터 저장용
            ArrayList<String> strList = new ArrayList<>();      // 데이터 분할 저장용
            // 읽기 열기
            BufferedReader br = new BufferedReader(new FileReader(sourceFileName));
            // 전체 문서 strList 에 저장
            while ((strLine = br.readLine()) != null) {
                strList.add(strLine);
            }
            // 닫기
            br.close();

            // 복사 파일 만들기
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(copiedFileName)));
            // 붙여넣기
            for(int i = 0; i < strList.size(); i++) {
                pw.println(strList.get(i));
            }
            // 닫기
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("「파일명의 지정이 부정합니다」");
        } catch (IOException e) {
            System.out.println("「입출력 에러입니다」");
        } catch (Exception e) {
            System.out.println( "두 개의 파일 이름을 올바르게 지정하십시오.");
        }
    }
}
