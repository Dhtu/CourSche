package org;

import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        greeting();
        choosing();
    }

    private static void choosing() {
        Scanner s = new Scanner(System.in);
        boolean quit = false;
        while (!quit)
        {
            int choose = s.nextInt();
            switch (choose)
            {
                case 1: System.out.println("1");//这里替换成教学资源管理的入口
                    break;
                case 2: System.out.println("2");//替换成自动排课入口
                    break;
                case 3: System.out.println("3");//替换成手动排课入口
                    break;
                case 4: System.out.println("4");//替换成查询入口
                    break;
                case 5: quit = true;
                    break;
            }

        }

    }

    private static void greeting() {
        System.out.println("Hello, Choose you operation.");
        System.out.println("1. 教学资源\n2. 自动排课3. 手动排课\n4. 排课表查询\n5. 退出");
    }
}
