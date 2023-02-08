class time
{
int hrs=0,min=0,sec=0;
time(int s)
{
sec=s%60;
min=s//60;
hrs=min//60;
min=min%60;
}
time(int m,int s)
{
min=m;
sec=s%60;
min=min+s//60;
hrs=min//60;
min=min%60;
}
time=(int h,int m,int s)
{
sec=s%60;
min=n;
hrs=h;
min=min+s//60;
hrs=hrs+min//60;
min=min%60;
}