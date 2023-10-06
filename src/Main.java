public class Main {

    // Question 1 - calculateGrade
    public static char calculateGrade(int grade)
    {
        if(grade >= 90)
        {
            return 'A';
        }
        else if(grade <= 89 && grade >= 80)
        {
            return 'B';
        }
        else if(grade <= 79 && grade >= 70)
        {
            return 'C';
        }
        else if(grade <= 69 && grade >= 60)
        {
            return 'D';
        }
        else if(grade <= 59 && grade >= 50)
        {
            return 'E';
        }
        else
        {
            return 'F';
        }
    }

    // Question 2 - fizzBuzz
    public static String fizzBuzz(int num)
    {
        if(num%5 == 0 && num%3 == 0)
        {
            return "fizzbuzz";
        }
        else if(num%3 == 0)
        {
            return "fizz";
        }
        else if(num%5 == 0)
        {
            return "buzz";
        }
        else
        {
            return "unlucky";
        }
    }

    // Question 3 - frontBack
    public static String frontBack(String str)
    {
        if(str.length() < 2)
        {
            return str;
        }
        else
        {
            String firstTwoChars = str.substring(0,2);
            return firstTwoChars + str + firstTwoChars;
        }
    }

    // Question 4 - twoAsOne
    public static boolean twoAsOne(int a, int b, int c)
    {
        if (a+b == c || a+c == b || b+c == a)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // Question 5 - endUp
    public static String endUp(String str)
    {
        if(str.length() < 3)
        {
            return str.toUpperCase();
        }
        else
        {
            String lastThreeChars = str.substring(str.length()-3);
            String front = str.substring(0,str.length()-3);
            return front + lastThreeChars.toUpperCase();
        }
    }

}
