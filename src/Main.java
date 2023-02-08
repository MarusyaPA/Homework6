public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание по теме Циклы");

        System.out.println("Задача № 1");

        for (int i= 0; i<=10; i=i+1){
            System.out.println("Итерация цикла " + i);
        }
        System.out.println("Задача № 2");

            for (int b= 10; b>=0; b=b-1){
                System.out.println("Итерация цикла " + b);
            }
        System.out.println("Задача № 3");

        for (int a= 0; a<=17 ; a=a+2){
            System.out.println("Четные числа " + a);
        }

        System.out.println("Задача № 4");

        for (int n= 10; n>=-10; n=n-1){
            System.out.println("Итерация цикла " + n);
        }
        System.out.println("Задача № 5");

        for (int d= 1904; d<= 2096; d=d+4){
            System.out.println(d + " год является високосным");
        }
        System.out.println("Задача № 6");

        for (int e= 7; e<= 98; e=e+7){
            System.out.println(e);
        }

        System.out.println("Задача № 7");

        for (int w= 1; w<= 512; w=w*2){
            System.out.println(w);
        }

        System.out.println("Задача № 8-9");

        int salary = 29000;
        int total = 0;
        for (int q= 0; q<= 12; q=q+1)
        {total = total+total/100+salary;
            System.out.println("Месяц " + q + " сумма накоплений равна " + total + " рублей");}

        System.out.println("Задача № 10");

        int z = 2;
        int t= 1;
        for (t = 1; t <= 10; t=t+1){
            System.out.println(z + " * " + t + " = " + z*t);
        }
    }
}
