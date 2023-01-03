package array.run;

import array.sample.ArraySample;
import array.sample.TwoArraySample;
import primitive.array.PracticeArray;

public class TestArray {
    public static void main(String[] args) {
        // 기본 자료형 배열 실행 테스트용
        ArraySample arraySample = new ArraySample();
        //arraySample.testArray1();
        //arraySample.testArray2();
        //arraySample.testArray3();

        PracticeArray practiceArray = new PracticeArray();
        //practiceArray.test3();
        //arraySample.testArrayInit21();
        //practiceArray.test6();
        TwoArraySample twoArraySample = new TwoArraySample();
        //twoArraySample.testMethod();
        twoArraySample.initTwoArray2();
    }
}