import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int count=0;
        int c1=0,c2=0;
        String op;
        Scanner s=new Scanner(System.in);
        Random r=new Random();
        System.out.println("ROCK PAPER SCISSOR\nROCK->0\nPAPER->1\nSCISSOR->2");
        while(count<5)
        {
            System.out.print("Enter your choice: ");;
            int s1=s.nextInt();
            int r1=r.nextInt(3);
            if(r1==0)
            {
                op="ROCK";
            }
            else if(r1==1)
            {
                op="Paper";
            }
            else {
                op="Scissor";
            }
            System.out.println("Computer: "+op);
            if(s1==r1)
            {
                System.out.println("No points to both team!!!");
                System.out.println("CHANCE: "+(count+1));
                count++;
            }
            else{
                while((s1==0 && r1==1)||(s1==1 && r1==0)) {
                    if (s1 == 0) {
                        c2++;
                        System.out.println("Point goes to computer!!");
                        System.out.println("You:" + c1 + " Computer:" + c2);
                        System.out.println("CHANCE: "+(count+1));
                        count++;
                        break;
                    } else {
                        c1++;
                        System.out.println("Point goes to you!!");
                        System.out.println("You:" + c1 + " Computer:" + c2);
                        System.out.println("CHANCE: "+(count+1));
                        count++;
                        break;
                    }
                }
                while((s1==0 && r1==2)||(s1==2 && r1==0))
                {
                    if(s1==2)
                    {
                        c2++;
                        System.out.println("Point goes to computer!!");
                        System.out.println("You:"+c1+" Computer:"+c2);
                        System.out.println("CHANCE: "+(count+1));
                        count++;
                        break;
                    }
                    else
                    {
                        c1++;
                        System.out.println("Point goes to you!!");
                        System.out.println("You:"+c1+" Computer:"+c2);
                        System.out.println("CHANCE: "+(count+1));
                        count++;
                        break;
                    }
                }
                while((s1==1 && r1==2)||(s1==2 && r1==1))
                {
                    if(s1==1)
                    {
                        c2++;
                        System.out.println("Point goes to computer!!");
                        System.out.println("You:"+c1+" Computer:"+c2);
                        System.out.println("CHANCE: "+(count+1));
                        count++;
                        break;
                    }
                    else
                    {
                        c1++;
                        System.out.println("Point goes to you!!");
                        System.out.println("You:"+c1+" Computer:"+c2);
                        System.out.println("CHANCE: "+(count+1));
                        count++;
                        break;
                    }
                }
            }
        }
        System.out.println("You: "+c1+"\nComputer: "+c2);
        if(c1>c2)
        {
            System.out.println("You won!!!!!");;
        }
        else if(c1<c2)
        {
            System.out.println("Computer won!!!");
        }
        else {
            System.out.println("Match draw!!!");
        }
    }
}
