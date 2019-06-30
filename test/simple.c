void f(double d){
  int d1;
  return;
  double x;
  return x;  //error : return void, not double
}
double f(int d){
  int d1;
  double x[5];
  {
     float d;
     x[2] = d;
  }
  x[1]++;
  break;
  return x;    //error: return double, not double[]
  return x[3][3]; //error: return double, not error
  return x[1];
}
double f(int x, double b){
   return b;
}

void main(){
  double c,b,d[5];
  int x,y,z[3];
  x = z;    // error: int[] to int 
  x = f(x); // error: double to int
  z = f(x); // error: double to int[]
  c = f(x,b) + z[1] ++;
  c = f(f(x,b),d);  // error
  c = f(f(x,b),c + x+ z);
}
