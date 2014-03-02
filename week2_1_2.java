class week2_1_2 {
  public static void main(String[] args) {
    double[] a={2.2, 5.4, 7.7, 3.0, 10};
	double sum= 0.0;
	double aver=0.0;
    for (int i=0 ; i < a.length ;i++) {
      sum += a[i];
    }
	aver=sum/a.length;
	System.out.println("sum="+sum+"\r\naverage="+aver);
  }
}
