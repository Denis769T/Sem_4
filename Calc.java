package Calcul;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String string="Программа калькулятор.";
        System.out.println(string);


        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите первое значение: ");
        double num1 = scanner.nextDouble();
        System.out.println("Введите второе значение: ");
        double num2 = scanner.nextDouble();
        System.out.println("Введите знак действия с числами( -,+,/,*)");
        char run=scanner.next().charAt(0);

        double result=0;
        if(run=='-'){
            result=num1-num2;
            System.out.println("Разность значений :\t"+num1+" - "+num2+" = "+result);
            System.out.format("Округлённый результат до двух знаков:\t %.2f\n",result);
            System.out.format("Округлённый результат до одного знака:\t %.1f",result);
        }
        else
            if(run=='+'){
            result=num1+num2;
            System.out.println("Сумма значений :\t"+num1+" + "+num2+" = "+result);
            System.out.format("Округлённый результат до двух знаков:\t %.2f\n",result);
            System.out.format("Округлённый результат до одного знака :\t %.1f",result);
        }
        else
            if(run=='/'){
            result=num1/num2;
            System.out.println("Деление значений :\t"+num1+" / "+num2+" = "+result);
            System.out.format("Округлённый результат до двух знаков:\t %.2f\n",result);
            System.out.format("Округлённый результат до одного знака:\t %.1f",result);
        }
        else
            if(run=='*'){
            result=num1*num2;
            System.out.println("Произведение значений :\t"+num1+" * "+num2+" = "+result);
            System.out.format("Округлённый результат до двух знаков:\t %.2f\n",result);
            System.out.format("Округлённый результат до одного знака:\t %.1f",result);
        }
        else {
            System.out.println("Ввели не верный символ действия над значениями!!!");
        }



    }
}