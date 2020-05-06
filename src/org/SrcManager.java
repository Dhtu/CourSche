package org;

import redis.clients.jedis.Jedis;

import java.util.Scanner;

public class SrcManager {
    static Jedis jedis = new Jedis("localhost");
    public static void srcManagerMain() {
//        greeting();
        choosing();
    }

    private static void choosing() {
        Scanner s = new Scanner(System.in);
        boolean quit = false;
        while (!quit)
        {
            greeting();
            int choose = s.nextInt();
            switch (choose)
            {
                case 1: add();
                    break;
                case 2: delete();
                    break;
                case 3: add();
                    break;
                case 4: select();
                    break;
                case 5: quit = true;
                    break;
            }

        }

    }

    private static void add(){
        Scanner s = new Scanner(System.in);
        int id = s.nextInt();
        int capacity = s.nextInt();
        String info = s.next();
        jedis.hset("src:"+id,"capacity",capacity+"");
        System.out.println("add "+"src:"+id);
    }

    private static void select(){
        Scanner s = new Scanner(System.in);
        int id = s.nextInt();
        System.out.println(jedis.hgetAll("src:"+id));
        System.out.println("select "+"src:"+id);
    }

    private static void delete(){
        Scanner s = new Scanner(System.in);
        int id = s.nextInt();
        jedis.del("src:"+id);
        System.out.println("delete "+"src:"+id);
    }

    private static void greeting() {
        System.out.println("Hello, start managing you source.");
        System.out.println("1. add\n2. delete\n3. update\n4. select\n5. exit");
    }
}
