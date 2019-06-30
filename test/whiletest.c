void main(){
    double a=0;
    int b=6;
    int c[7][5];
	while(a<6 || a> b && a> c[1][1]){
	   if(a>3) {
	      a=6;
	      b = c[3][3]++ +b;
	      b = ++ c[3][3] +b;
	      c[1][1] = a;
	      c[2][2] = c [1][1];
	      break;
	   }else{
	      while(b<0){
	          b++;
	      }
	   }	   
	}   
	b =a<6 || a> b;
}