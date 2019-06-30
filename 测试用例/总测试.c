void main()
{
int a,b=2,c=5,d=6,i=1,j=2,aa=7;
int e[2][3]={{2,5,3},{8,3,2}};
char s;
a=1+2*(c+4*(5+6*(b+8)))+123;
b=e[1][1];
/*
while(a>3)
{
	i++;
	j--;
*/

while(aa>3)//while statement
{
	i++;
	--j;
	do{
		for(i=2;i<5;i++)
		{
			switch(a+3)
			{
				case 1:
				{
					a++;
				}
				break;
				case 2:
				{b++;}
				break;
				case 3:
				{c++;}
				break;
				default:
				{
				c%=2;
				}
				break;
			}
			while(d>3&&c<2||j>1)
			{
				a*=b+c;
				++a;
				for(j=5;j>0;j--)
				{
					c+=5+e[1][0];
				}
			}
			
		}

	}
	while(i>2&&j<5);
}

if(a<b)
{
	for(i=10;i>0;i--)
	{
		if(a>3)
			{c=e[1][2];}
		else if(d>2)
		{
			d=d+3*4;
		}
		else
		{
			c*=2;
			}
	}
}
else if(c*5==d)
{
	while(d+2>c%3)
	{
		a=e[0][0];
	}
}
else {a++;}
}
