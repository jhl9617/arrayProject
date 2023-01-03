package primitive.array;

import java.util.*;

public class PracticeArray {

    public void test1() {

        int[] ar = new int[10];
        int tot = 0;
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            ar[i] = (int) (random.nextInt(100) + 1);
            System.out.println(ar[i]);
            tot += ar[i];
        }
        System.out.println("총 합 : " + tot);
    }

    public void test2() {
        int[] ar = new int[10];
        int tot = 0;
        int max = 0;
        int min = 100;
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            ar[i] = (int) (random.nextInt(100) + 1);

            System.out.println(ar[i]);
            tot += ar[i];
            if (max < ar[i]) max = ar[i];
            if (min > ar[i]) min = ar[i];

        }
        System.out.println("최솟값 : " + min + "\n최댓값 : " + max);
    }


    public void test3() {
        byte[] by = new byte[10];
        int tot = 0;
        Random random = new Random();
        random.nextBytes(by);
        for (int i = 0; i < 10; i++) {
            System.out.print(by[i]);
            if (by[i] % 2 == 0) {
                tot += by[i];
                System.out.println("(짝수)");
            } else System.out.println();
        }
        System.out.println("짝수들의 합 : " + tot);
    }

    public void test4() {
        Scanner scanner = new Scanner(System.in);
        String st = scanner.next();
        int[] nums = new int[st.length()];
        int tot = 0;


        for (int i = 0; i < st.length(); i++) {
            nums[i] = Integer.parseInt(st.substring(i, i + 1));
            System.out.print(nums[i] + " ");
            tot += nums[i];
        }
        System.out.println("총 합 : "+tot);
    }

    public void test5() {
        Scanner scanner = new Scanner(System.in);
        String st = scanner.next();
        int[] nums = new int[st.length()];
        int tot = 0;
        for (int i = 0; i < st.length(); i++) {
            nums[i] = (int) st.charAt(i) - 48;
            tot += nums[i];
            System.out.print(((int) st.charAt(i) - 48) + " ");
        }
        System.out.println("총 합 : " + tot);
    }

    public void test6() {

        String personID = "881225-1234567";

        int year = Integer.parseInt(personID.substring(0,2));
        int mon = Integer.parseInt(personID.substring(2,4));
        int day = Integer.parseInt(personID.substring(4,6));

        GregorianCalendar gregorianCalendar = new GregorianCalendar(year+1900, mon-1, day);

        Calendar calendar = Calendar.getInstance();
        calendar.set(1900+year, mon-1, day);
        System.out.println(calendar.getTime());

        System.out.println(calendar);
        System.out.println(calendar.getWeeksInWeekYear());
        System.out.println("day of week: "+calendar.get(Calendar.DAY_OF_WEEK));

        switch (calendar.get(Calendar.DAY_OF_WEEK)) {
            case 1:
                System.out.println("일요일");break;
            case 2:
                System.out.println("월요일");break;
            case 3:
                System.out.println("화요일");break;
            case 4:
                System.out.println("수요일");break;
            case 5:
                System.out.println("목요일");break;
            case 6:
                System.out.println("금요일");break;
            case 7:
                System.out.println("토요일");break;
        }

        String []weeks = {"일","월","화","수","목","금","토"};

        int byear = calendar.get(Calendar.YEAR);
        GregorianCalendar currentYear = new GregorianCalendar();
        System.out.println(currentYear);




    }
}
