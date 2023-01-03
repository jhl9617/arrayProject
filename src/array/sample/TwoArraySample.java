package array.sample;

import java.util.Random;
import java.util.Scanner;

/**
 * 2���� �迭 �׽�Ʈ�� Ŭ����
 * 1���� �迭 : �ڷ����� ���� �������� ����,
 * �迭 ����� �Ҵ�ÿ� �迭��ȣ[] 1��, ����(index)
 * �� > int a,b,c,d,e = > int[] ar = new int [5];
 * <p>
 * 2���� �迭 : �ڷ����� ���� 1���� �迭���� ����
 * �迭 ����� �Ҵ�ÿ� �迭��ȣ[][] 2��, ��� ��(��|��)�� ��(ȣ|ĭ)
 * ��> int[] ar = new int[5];
 * int[] br = new int[5];
 * int[] cr = new int[5];
 * => int[][] tar = new int[3][5];   3�� 5���� ����
 * �ڹٴ� 1�����迭�� �����Ҵ���
 * 2�����迭�� �� 1�����迭�� �ּҵ��� �迭�� ������
 * �ڹ��� 2�����迭 == �ּ�(���۷���)�迭��
 * <p>
 * 3���� �迭 : �ڷ����� ���� 1���� �迭���� ����
 * �迭 ����� �Ҵ�ÿ� �迭��ȣ[][][] 3��, ��, ��, ��
 */
public class TwoArraySample {
    //Field
    //���������� �ڷ��� ������ [=�ʱⰪ];
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();

    //Method
    //���������� ��ȯ�ڷ��� �޼ҵ��(�ڷ��� �Ű�����) { �ҽ��ۼ� }
    public void testMethod() {
        //1. 2���� �迭 ����
        //2. 2���� �迭�� ���� ���۷���(�ּҺ���) �����
        //�ڷ���[][] �迭���۷���;
        //�ڷ��� []�迭���۷���[];
        //�ڷ��� �迭���۷���[][];
        int[][] tar; //���������� �����޸� stack�� �Ҵ��

        //2. �迭 ����
        //�� �޸𸮿� �迭���� �����
        //�����迭 ����� : �� 1���� �迭���� �� ����(��)�� ������ ���
        tar = new int[3][5];
        System.out.println("�Ҵ�� �� ���� : " + tar.length);
        System.out.println("�� 1�����迭�� �� ���� : ");
        for (int i = 0; i < tar.length; i++) {
            System.out.println(i + "��° : " + tar[i].length);
        }

        //2���� �迭�� ��� : 2�� for���� �����
        //for(��ݺ�) {    for(�� �ະ ���� ���� �ݺ�){ �迭���۷���[��]}}
        for (int i = 0; i < tar.length; i++) {
            for (int j = 0; j < tar[i].length; j++) {
                System.out.print(tar[i][j] + " ");
            }
            System.out.println();
        }
        //1~100������ ������ ��� ó��
        for (int i = 0; i < tar.length; i++) {
            System.out.print(i + "��°");
            for (int j = 0; j < tar[i].length; j++) {
                tar[i][j] = random.nextInt(100) + 1;
                System.out.printf("%7d", tar[i][j]);
            }
            System.out.println();
        }
    }

    //�����迭 �׽�Ʈ��
    public void testMethod2() {
        //2���� �迭 ����� ������ ���� ������ �� ����
        int[][] tar = new int[3][];
        //�� 1�����迭�� �ּҺ����� �迭 ����⸸ ��

        //�� �ະ ��(��) ������ ���߿� �����ϴ� ������
        //2��° new �� 1���� �迭 �������
        tar[0] = new int[7];
        tar[1] = new int[4];
        tar[2] = new int[10];
        System.out.println("�� ���� : " + tar.length);
        for (int i = 0; i < tar.length; i++) {
            System.out.println(tar);
        }

    }

    //1�����迭�� �ʱ�ȭ : �迭���� �Ҵ�� ���ÿ� �ʱⰪ ���
    //�ڷ���[] �迭�� = {�ʱⰪ, �ʱⰪ, ....};
    //�ڷ���[] �迭�� = new �ڷ���[] {�ʱⰪ,�ʱⰪ, ...};

    public void initTwoArray() {
        //�����迭 �ʱ�ȭ
        int[][] tar = {{10, 20, 30, 40}, {11, 22, 33, 44,}, {12, 23, 34, 45}};
        for (int i = 0; i < tar.length; i++) {
            for (int j = 0; j < tar[i].length; j++) {
                System.out.print(tar[i][j] + " ");
            }
            System.out.println();
        }
    }


    public void initTwoArray2() {
        //�����迭 �ʱ�ȭ
        int[][] tar = {{10, 20, 30, 40, 50}, {11, 22, 33, 44,}, {12, 23, 34, 45, 56, 67, 78, 89}};
        for (int i = 0; i < tar.length; i++) {
            System.out.println(i+"���� �� ���� : "+tar[i].length);
            for (int j = 0; j < tar[i].length; j++) {
                System.out.print(tar[i][j] + " ");
            }
            System.out.println();
        }
    }
}