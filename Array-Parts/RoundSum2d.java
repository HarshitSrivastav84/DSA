class RoundSum2d {
  public static void main(String[] args){
    int arr[][] = {
      {1 ,2 ,3 ,4 ,5 },
      {6 ,7 ,8 ,9 ,10},
      {11,12,13,14,15},
      {16,17,18,19,20}
    };

 int minr =0 ;
 int minc=0;
 int maxr =arr.length-1;
 int maxc =arr[0].length-1;

 int count = 0;

 while(count == arr.length){

 for(int i = minc ; i<=maxc ;i++ ){
  System.out.print(arr[minr][i]+" ");
  count++;
}
minr++;
for(int j=minr; j<=maxr; j++){
  System.out.print(arr[j][maxc] + " ");
  count++;
}
maxc--;
for(int i=maxc; i>=minc; i--){
  System.out.print(arr[maxr][i] + " ");
  count++;
}
maxr--;
for(int j=maxr; j>=minr; j--){
  System.out.print(arr[j][minc] + " ");
  count++;
 }
}
  }
}
