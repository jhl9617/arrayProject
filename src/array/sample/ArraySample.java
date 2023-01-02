package array.sample;

/**
 * 기본 자료형(Primitive Type) 1차원 배열 테스트용 클래스
 * 2023.01.02(월) 작성
 */
public class ArraySample {
    //Method
    public void testArray1() {
        //1. 배열 선언
        //배열공간의 주소저장용 레퍼런스변수 만들기
        //자바 : 레퍼런스 변수 == C/C++ : 포인터 변수
        //자료형[] 변수명; 또는 자료형 변수명[]; 또는 자료형 []변수명;
        //배열 레퍼런스 == 배열이름 == 배열명 == 배열의 주소
        int[] ar;

        //2. 배열 생성
        //힙(heap, 자유메모리 영역)에 배열공간을 할당(allocation)하는 것
        //자바에서는 배열공간과 객체공간은 heap에 만들도록 정해져 있음
        //자바는 힙에 할당할 때 new 사용함
        //배열 레퍼런스 = new 자료형[방갯수]
        //방갯수 == 첨자
        //heap 에 해당 자료형의 변수들을 갯수만큼 연속 나열 할당하고
        //발생한 시작주소를 배열레퍼런스에 기록 저장함
        ar = new int[5];

        System.out.println("ar이 가진 주소 : " + ar.hashCode());
        //자바가 java.lang.Array 가 배열의 기능을 기본으로 제공함
        System.out.println("ar이 참조하는 배열공간의 방갯수 : " + ar.length);

        //3. 배열 사용
        //값 기록, 값 출력, 값 읽기
        //배열의 시작주소를 이용해서 각 방의 순번으로 접근함
        //배열레퍼런스[순번] : 시작주소에서 순번만큼 이동한 위치
        //한번에 이동바이트크기 == 자료형 할당 바이트 크기
        //자바는 힙에 할당된 방에 자동으로 준비된 기본값(default)
        //boolean : false, char : '\u0000', 정수 : 0, 실수 : 0
        //클래스형 : null
        //배열을 연속으로 다룰 때 주로 for 문을 사용함
        for(int i = 0; i < ar.length;i++){
            System.out.println(i + "번째 방의 값 : " + ar[i]);
        }
    }

    //배열 선언과 생성은 한번에 작성해도 됨
    public void testArray2() {

        //자료형[] 배열레퍼런스 = new 자료형[갯수]
        boolean[] bar = new boolean[10];

        //배열 생성시 초기값 없으면, jvm에 의해 준비된 기본값(default) 기록됨
        for(int i = 0; i < bar.length; i++){
            System.out.println(bar + "["+i+"]" + bar[i]);
        }

    }

}
