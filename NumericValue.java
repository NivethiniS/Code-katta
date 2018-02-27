class NumericValue
{
int mpublic static void main(String arg[])
{
   char s[100];
   int l,count=0,c,i;
   System.out.println(s);
   l=strlen(s);
   for(i=0;i<l;i++)
   {
       if(s[i]>='0' && s[i]<='9')
       {
       count++;
       flag=1;
       }
       else
       flag=0;
   }
   if(flag==1)
     System.out.println(count);
   else
Syatem.out.println("0");

    return 0;
}
}
