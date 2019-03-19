package game2048;
import java.util.*;
public class Game2048 {
public static void main(String[] args) {
    System.out.println("type wasd to input the direction:");
  int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,j=0,k=0,l=0,m=0,n=0,o=0,p=0;
  boolean notfail=true,incorrect=true,notok=true,left=true,right=true,up=true,down=true;
  String choice=" ";
  int num=(int)(Math.random()*16)+1;
  int ch=((int)(Math.random()*2)+1)*2;
  if(num==1){a=ch;}
  if(num==2){b=ch;}
  if(num==3){c=ch;}
  if(num==4){d=ch;}
  if(num==5){e=ch;}
  if(num==6){f=ch;}
  if(num==7){g=ch;}  
  if(num==8){h=ch;}
  if(num==9){i=ch;}
  if(num==10){j=ch;}
  if(num==11){k=ch;}
  if(num==12){l=ch;}
  if(num==13){m=ch;}
  if(num==14){n=ch;}
  if(num==15){o=ch;}  
  if(num==16){p=ch;}
  while(notfail){System.out.println(a+"\t"+b+"\t"+c+"\t"+d);
          System.out.println(e+"\t"+f+"\t"+g+"\t"+h);
          System.out.println(i+"\t"+j+"\t"+k+"\t"+l);
          System.out.println(m+"\t"+n+"\t"+o+"\t"+p);
left=false;right=false;up=false;down=false;   if(a!=0&b==0||b!=0&c==0||c!=0&d==0||e!=0&f==0||f!=0&g==0||g!=0&h==0||i!=0&j==0||j!=0&k==0
     ||k!=0&l==0||m!=0&n==0||n!=0&o==0||o!=0&p==0){right=true;}
  if(d!=0&c==0||c!=0&b==0||b!=0&a==0||h!=0&g==0||g!=0&f==0||f!=0&e==0||l!=0&k==0||k!=0&j==0
     ||j!=0&i==0||p!=0&o==0||o!=0&n==0||n!=0&m==0){left=true;}
  if(a!=0&e==0||e!=0&i==0||i!=0&m==0||b!=0&f==0||f!=0&j==0||j!=0&n==0||b!=0&g==0||g!=0&k==0
     ||k!=0&o==0||d!=0&h==0||h!=0&l==0||l!=0&p==0){down=true;}
  if(m!=0&i==0||i!=0&e==0||e!=0&a==0||n!=0&j==0||j!=0&f==0||f!=0&b==0||o!=0&k==0||k!=0&g==0
     ||g!=0&c==0||p!=0&l==0||l!=0&h==0||h!=0&d==0){up=true;}              
if(a==b&a!=0&b!=0||b==c&c!=0&b!=0||c==d&c!=0&d!=0||e==f&e!=0&f!=0||f==g&f!=0&g!=0||g==h&g!=0&h!=0||i==j&i!=0&j!=0||j==k&j!=0&k!=0||k==l&k!=0&l!=0||m==n&m!=0&n!=0||n==o&n!=0&o!=0||o==p&o!=0&p!=0)          
  {left=true;right=true;}                 
  if(a==e&a!=0&e!=0||e==i&e!=0&i!=0||i==m&i!=0&m!=0||b==f&f!=0&b!=0||f==j&f!=0&j!=0||j==n&j!=0&n!=0||c==g&c!=0&g!=0||g==k&g!=0&k!=0||k==o&k!=0&o!=0||d==h&d!=0&h!=0||h==l&h!=0&l!=0||l==p&l!=0&p!=0)
  {up=true;down=true;}

  if(!left&!right&!up&!down){notfail=false;}
  else{while(incorrect){Scanner s=new Scanner(System.in);                 
                        choice=s.nextLine();
                        if(choice.equals("a")&left||choice.equals("d")&right||up&choice.equals("w")||down&choice.equals("s"))
                        {incorrect=false;}                      
                         else{if(choice.equals("replay")){
                          incorrect=false;notfail=false;}
                             else{System.out.println("ERROR Try Again");}}}
       incorrect=true;
if(choice.equals("a")){int[] use=cal(a,b,c,d);
                a=use[0];b=use[1];c=use[2];d=use[3];
                use=cal(e,f,g,h);
                e=use[0];f=use[1];g=use[2];h=use[3];
                use=cal(i,j,k,l);
                i=use[0];j=use[1];k=use[2];l=use[3];
                use=cal(m,n,o,p);
                m=use[0];n=use[1];o=use[2];p=use[3];}
if(choice.equals("d")){int[] use=cal(d,c,b,a);
                d=use[0];c=use[1];b=use[2];a=use[3];
                use=cal(h,g,f,e);
                h=use[0];g=use[1];f=use[2];e=use[3];
                use=cal(l,k,j,i);
                l=use[0];k=use[1];j=use[2];i=use[3];
                use=cal(p,o,n,m);
                p=use[0];o=use[1];n=use[2];m=use[3];}
if(choice.equals("w")){int[] use=cal(d,h,l,p);
                d=use[0];h=use[1];l=use[2];p=use[3];
                use=cal(c,g,k,o);
                c=use[0];g=use[1];k=use[2];o=use[3];
                use=cal(b,f,j,n);
                b=use[0];f=use[1];j=use[2];n=use[3];
                use=cal(a,e,i,m);
                a=use[0];e=use[1];i=use[2];m=use[3];}
if(choice.equals("s")){int[] use=cal(p,l,h,d);
                p=use[0];l=use[1];h=use[2];d=use[3];
                use=cal(o,k,g,c);
                o=use[0];k=use[1];g=use[2];c=use[3];
                use=cal(n,j,f,b);
                n=use[0];j=use[1];f=use[2];b=use[3];
                use=cal(m,i,e,a);
                m=use[0];i=use[1];e=use[2];a=use[3];}
num=(int)(Math.random()*16)+1;
  ch=((int)(Math.random()*2)+1)*2;
  while(notok&notfail)
{if(num==1){if(a==0){a=ch;notok=false;}else{num++;}}
               if(num==2){if(b==0){b=ch;notok=false;}else{num++;}}
               if(num==3){if(c==0){c=ch;notok=false;}else{num++;}}
               if(num==4){if(d==0){d=ch;notok=false;}else{num++;}}
               if(num==5){if(e==0){e=ch;notok=false;}else{num++;}}
               if(num==6){if(f==0){f=ch;notok=false;}else{num++;}}
               if(num==7){if(g==0){g=ch;notok=false;}else{num++;}}
               if(num==8){if(h==0){h=ch;notok=false;}else{num++;}}
               if(num==9){if(i==0){i=ch;notok=false;}else{num++;}}
               if(num==10){if(j==0){j=ch;notok=false;}else{num++;}}
               if(num==11){if(k==0){k=ch;notok=false;}else{num++;}}
               if(num==12){if(l==0){l=ch;notok=false;}else{num++;}}
               if(num==13){if(m==0){m=ch;notok=false;}else{num++;}}
               if(num==14){if(n==0){n=ch;notok=false;}else{num++;}}
               if(num==15){if(o==0){o=ch;notok=false;}else{num++;}}
               if(num==16){if(p==0){p=ch;notok=false;}else{num=1;}}}
  notok=true;}}
    System.out.println("GAME OVER!");
   }
public static int[] cal(int fi,int se,int th,int fo){
  if(fi==0){fi=se;se=th;th=fo;fo=0;
           if(fi==0){fi=se;se=th;th=0;
                    if(fi==0){fi=se;se=0;}}
           else{if(se==0){se=th;th=0;}}}
  else{if(se==0){se=th;th=fo;fo=0;
                if(se==0){se=th;th=0;}}
       else{if(th==0){th=fo;fo=0;}}}
  if(fi==se){fi*=2;se=th;th=fo;fo=0;
             if (se==th){se*=2;th=0;}}
  else{if(se==th){se*=2;th=fo;fo=0;}
       else{if(th==fo){th*=2;fo=0;}}}
  int[]result={fi,se,th,fo};
  return result;}}
