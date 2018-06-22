import java.util.Scanner;

public class Calendar {
    public static void main(String[] args)throws Exception{
        Scanner in=new Scanner(System.in);
        int year,month,day;
        System.out.println("请输入你要查询的年份：");
        year=in.nextInt();
        while(true){
            System.out.println("请输入你要查询的月份：");
            month=in.nextInt();
            if(month<1||month>12){
                System.out.println("查询的月份错误");
            }else{
                break;
            }
        }
        if(month==2){
            if(year%4==0&&year%100!=0||year%400==0){
                day=29;
            }else{
                day=28;
            }
        }else if(month==4||month==6||month==9||month==11){
            day=30;
        }else{
            day=31;
        }
        int sum=0;
        for(int i=1900;i<=year;i++){
            if(i%4==0&&i%100!=0||i%400==0){
                sum+=366;
            }else{
                sum+=365;
            }
        }
        for(int i=1;i<month;i++){
            if(i==2){
                if(year%4==0&&year%100!=0||year%400==0){
                    sum+=29;
                }else{
                    sum+=28;
                }
            }else{
                if(i==4||i==6||i==9||i==11){
                    sum+=30;
                }else{
                    sum+=31;
                }
            }
        }
        System.out.println("日\t一\t二\t三\t四\t五\t六");
        int week=sum%7;
        for(int i=1;i<=week;i++){
            System.out.print("\t");
        }
        for(int i=1;i<=day;i++,week++){
            if(week%7==6){
                System.out.print(i+"\n");
            }else {
                System.out.print(i+"\t");
            }
        }
        in.close();
    }
}