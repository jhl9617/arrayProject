package array.sample;

import java.lang.reflect.Array;
import java.util.Scanner;

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
        for (int i = 0; i < ar.length; i++) {
            System.out.println(i + "번째 방의 값 : " + ar[i]);
        }
    }

    //배열 선언과 생성은 한번에 작성해도 됨
    public void testArray2() {

        //자료형[] 배열레퍼런스 = new 자료형[갯수]
        boolean[] bar = new boolean[10];

        //배열 생성시 초기값 없으면, jvm에 의해 준비된 기본값(default) 기록됨
        for (int i = 0; i < bar.length; i++) {
            System.out.println(bar + "[" + i + "]" + bar[i]);
        }

    }

    //할당된 배열 각 방에 값 기록/사용
    //배열명[순번] 값;
    //순번 == 인덱스(index)
    public void testArray3() {
        int[] ar = new int[5];

        //각 방(변수방과 같음)에 값 기록
        ar[0] = 12; //ar이 가진 시작주소 = 값;
        ar[1] = 23;
        ar[2] = 5;
        ar[3] = 45;
        ar[4] = 99;

        //배열 각 방의 값 사용 : 배열명[순번]
        for (int i = 0; i < ar.length; i++) {
            System.out.println(i + " + " + ar[i]);
        }
    }

    //배열공간의 초기화 테스트
    public void testArrayInit() {
        //배열 초기화
        //배열공간 생성(할당)과 동시에 초기값 기록 처리
        //구문 표현방식 1
        //자료형[] 배열레퍼런스 = {초기값, 초기값, ...};
        //초기값의 갯수만큼 자동 동적할당(힙에 생성)하고 바로 초기값을 각 방에 순서대로 기록함
        int[] ar = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        System.out.println("할당된 방의 갯수 : " + ar.length);

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + "  ");
        }
        System.out.println();
    }

    public void testArrayInit2() {
        //배열 초기화
        //배열공간 생성(할당)과 동시에 초기값 기록 처리
        //구문 표현방식 2
        //자료형[] 배열레퍼런스 = {초기값, 초기값, ...};
        //초기값의 갯수만큼 자동 동적할당(힙에 생성)하고 바로 초기값을 각 방에 순서대로 기록함
        int[] ar1 = new int[]{11, 22, 33, 44, 55, 66, 77, 88, 99};
        System.out.println("할당된 방의 갯수 : " + ar1.length);

        for (int i = 0; i < ar1.length; i++) {
            System.out.print(ar1[i] + "  ");
        }
        System.out.println();

        int[] ar2 = new int[]{11, 22, 33, 44, 55, 66, 77, 88, 99, 100};
        System.out.println("할당된 방의 갯수 : " + ar2.length);

        for (int i = 0; i < ar2.length; i++) {
            System.out.print(ar2[i] + "  ");
        }
        System.out.println();

        //방법1과 방법2의 차이점 :
        //방법1은 배열 선언과 초기화가 한번에 작성되어야 함
        //int[] ar3;
        //ar3 = {1, 2, 3, 4, 5};
        int[] ar3 = {1, 2, 3, 4, 5};

        //방법 2는 배열 선언과 초기화
        int[] ar4;
        ar4 = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        for (int i = 0; i < ar3.length; i++) {
            System.out.print(ar3[i] + " ");
        }

        for (int i = 0; i < ar4.length; i++) {
            System.out.print(ar4[i] + " ");
        }
    }

    public void testArrayInit21() {
        //배열공간 방갯수는 정수 리터럴(값) 또는 정수변수 사용가능
        Scanner scanner = new Scanner(System.in);

        System.out.print("배열로 할당 할 방 갯수 : ");
        int su = scanner.nextInt();

        int[] nums = new int[su];
        System.out.println("nums length : " + nums.length);

        //1~100 사이의 임의의 난수가 기록되게 함
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 100) + 1;
        }

        for(int i = 0; i < nums.length;i++){
            System.out.print(nums[i] + "  ");
        }
        System.out.println();
    }

}
