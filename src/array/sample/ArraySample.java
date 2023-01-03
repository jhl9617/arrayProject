package array.sample;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * �⺻ �ڷ���(Primitive Type) 1���� �迭 �׽�Ʈ�� Ŭ����
 * 2023.01.02(��) �ۼ�
 */
public class ArraySample {
    //Method
    public void testArray1() {
        //1. �迭 ����
        //�迭������ �ּ������ ���۷������� �����
        //�ڹ� : ���۷��� ���� == C/C++ : ������ ����
        //�ڷ���[] ������; �Ǵ� �ڷ��� ������[]; �Ǵ� �ڷ��� []������;
        //�迭 ���۷��� == �迭�̸� == �迭�� == �迭�� �ּ�
        int[] ar;

        //2. �迭 ����
        //��(heap, �����޸� ����)�� �迭������ �Ҵ�(allocation)�ϴ� ��
        //�ڹٿ����� �迭������ ��ü������ heap�� ���鵵�� ������ ����
        //�ڹٴ� ���� �Ҵ��� �� new �����
        //�迭 ���۷��� = new �ڷ���[�氹��]
        //�氹�� == ÷��
        //heap �� �ش� �ڷ����� �������� ������ŭ ���� ���� �Ҵ��ϰ�
        //�߻��� �����ּҸ� �迭���۷����� ��� ������
        ar = new int[5];

        System.out.println("ar�� ���� �ּ� : " + ar.hashCode());
        //�ڹٰ� java.lang.Array �� �迭�� ����� �⺻���� ������
        System.out.println("ar�� �����ϴ� �迭������ �氹�� : " + ar.length);

        //3. �迭 ���
        //�� ���, �� ���, �� �б�
        //�迭�� �����ּҸ� �̿��ؼ� �� ���� �������� ������
        //�迭���۷���[����] : �����ּҿ��� ������ŭ �̵��� ��ġ
        //�ѹ��� �̵�����Ʈũ�� == �ڷ��� �Ҵ� ����Ʈ ũ��
        //�ڹٴ� ���� �Ҵ�� �濡 �ڵ����� �غ�� �⺻��(default)
        //boolean : false, char : '\u0000', ���� : 0, �Ǽ� : 0
        //Ŭ������ : null
        //�迭�� �������� �ٷ� �� �ַ� for ���� �����
        for (int i = 0; i < ar.length; i++) {
            System.out.println(i + "��° ���� �� : " + ar[i]);
        }
    }

    //�迭 ����� ������ �ѹ��� �ۼ��ص� ��
    public void testArray2() {

        //�ڷ���[] �迭���۷��� = new �ڷ���[����]
        boolean[] bar = new boolean[10];

        //�迭 ������ �ʱⰪ ������, jvm�� ���� �غ�� �⺻��(default) ��ϵ�
        for (int i = 0; i < bar.length; i++) {
            System.out.println(bar + "[" + i + "]" + bar[i]);
        }

    }

    //�Ҵ�� �迭 �� �濡 �� ���/���
    //�迭��[����] ��;
    //���� == �ε���(index)
    public void testArray3() {
        int[] ar = new int[5];

        //�� ��(������� ����)�� �� ���
        ar[0] = 12; //ar�� ���� �����ּ� = ��;
        ar[1] = 23;
        ar[2] = 5;
        ar[3] = 45;
        ar[4] = 99;

        //�迭 �� ���� �� ��� : �迭��[����]
        for (int i = 0; i < ar.length; i++) {
            System.out.println(i + " + " + ar[i]);
        }
    }

    //�迭������ �ʱ�ȭ �׽�Ʈ
    public void testArrayInit() {
        //�迭 �ʱ�ȭ
        //�迭���� ����(�Ҵ�)�� ���ÿ� �ʱⰪ ��� ó��
        //���� ǥ����� 1
        //�ڷ���[] �迭���۷��� = {�ʱⰪ, �ʱⰪ, ...};
        //�ʱⰪ�� ������ŭ �ڵ� �����Ҵ�(���� ����)�ϰ� �ٷ� �ʱⰪ�� �� �濡 ������� �����
        int[] ar = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        System.out.println("�Ҵ�� ���� ���� : " + ar.length);

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + "  ");
        }
        System.out.println();
    }

    public void testArrayInit2() {
        //�迭 �ʱ�ȭ
        //�迭���� ����(�Ҵ�)�� ���ÿ� �ʱⰪ ��� ó��
        //���� ǥ����� 2
        //�ڷ���[] �迭���۷��� = {�ʱⰪ, �ʱⰪ, ...};
        //�ʱⰪ�� ������ŭ �ڵ� �����Ҵ�(���� ����)�ϰ� �ٷ� �ʱⰪ�� �� �濡 ������� �����
        int[] ar1 = new int[]{11, 22, 33, 44, 55, 66, 77, 88, 99};
        System.out.println("�Ҵ�� ���� ���� : " + ar1.length);

        for (int i = 0; i < ar1.length; i++) {
            System.out.print(ar1[i] + "  ");
        }
        System.out.println();

        int[] ar2 = new int[]{11, 22, 33, 44, 55, 66, 77, 88, 99, 100};
        System.out.println("�Ҵ�� ���� ���� : " + ar2.length);

        for (int i = 0; i < ar2.length; i++) {
            System.out.print(ar2[i] + "  ");
        }
        System.out.println();

        //���1�� ���2�� ������ :
        //���1�� �迭 ����� �ʱ�ȭ�� �ѹ��� �ۼ��Ǿ�� ��
        //int[] ar3;
        //ar3 = {1, 2, 3, 4, 5};
        int[] ar3 = {1, 2, 3, 4, 5};

        //��� 2�� �迭 ����� �ʱ�ȭ
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
        //�迭���� �氹���� ���� ���ͷ�(��) �Ǵ� �������� ��밡��
        Scanner scanner = new Scanner(System.in);

        System.out.print("�迭�� �Ҵ� �� �� ���� : ");
        int su = scanner.nextInt();

        int[] nums = new int[su];
        System.out.println("nums length : " + nums.length);

        //1~100 ������ ������ ������ ��ϵǰ� ��
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 100) + 1;
        }

        for(int i = 0; i < nums.length;i++){
            System.out.print(nums[i] + "  ");
        }
        System.out.println();
    }

}
