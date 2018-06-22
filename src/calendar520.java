public class calendar520 {
    public static void main(String[] args){
        int a=0;
        for(int b=1996;b<=2017;b++){
            if(b%4==0&&b%100!=0||b%400==0){
                a+=366;
            }else{
                a+=365;
            }
        }
        for(int c=1;c<=4;c++){
            if(c==2){
                if(2018%4==0&&2018%100!=0||2018%400==0){
                    a+=29;
                }else{
                    a+=28;
                }
            }else{
                if(c==1||c==3){
                    a+=31;
                }else{
                    a+=30;
                }
            }
        }
        for(int d=12;d>=6;d--){
            if(d==7||d==8||d==10||d==12){
                a+=31;
            }else{
                a+=30;
            }
        }
        a+=49;
        System.out.println("1995年5月2日到2018年5月20日一共"+a+"天");
        int e=a%7;
        String f;
        switch(e){
            case 1:
                f="三";
                break;
            case 2:
                f="四";
                break;
            case 3:
                f="五";
                break;
            case 4:
                f="六";
                break;
            case 5:
                f="天";
                break;
            case 6:
                f="一";
                break;
            default:
                f="二";
                break;
        }
        System.out.println("2018年5月20日为星期"+f);
        System.out.println("2018年5月份日历：\n日\t一\t二\t三\t四\t五\t六\n");
        for(int i=1;i<=2;i++){
            System.out.print("\t");
        }
        for(int i=1;i<=31;i++){
            if(i%7==5){
                System.out.print(i+"\n");
            }else {
                System.out.print(i+"\t");
            }
        }
    }
}